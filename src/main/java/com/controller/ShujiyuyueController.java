
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 教室预约
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shujiyuyue")
public class ShujiyuyueController {
    private static final Logger logger = LoggerFactory.getLogger(ShujiyuyueController.class);

    @Autowired
    private ShujiyuyueService shujiyuyueService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private JiaoshiService jiaoshiService;
    @Autowired
    private LaoshiService laoshiService;
    @Autowired
    private YonghuService yonghuService;



    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("教师".equals(role))
            params.put("laoshiId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = shujiyuyueService.queryPage(params);

        //字典表数据转换
        List<ShujiyuyueView> list =(List<ShujiyuyueView>)page.getList();
        for(ShujiyuyueView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShujiyuyueEntity shujiyuyue = shujiyuyueService.selectById(id);
        if(shujiyuyue !=null){
            //entity转view
            ShujiyuyueView view = new ShujiyuyueView();
            BeanUtils.copyProperties( shujiyuyue , view );//把实体数据重构到view中

                //级联表
                JiaoshiEntity jiaoshi = jiaoshiService.selectById(shujiyuyue.getJiaoshiId());
                if(jiaoshi != null){
                    BeanUtils.copyProperties( jiaoshi , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setJiaoshiId(jiaoshi.getId());
                }
                //级联表
                LaoshiEntity laoshi = laoshiService.selectById(shujiyuyue.getLaoshiId());
                if(laoshi != null){
                    BeanUtils.copyProperties( laoshi , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setLaoshiId(laoshi.getId());
                }
                //级联表
                YonghuEntity yonghu = yonghuService.selectById(shujiyuyue.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShujiyuyueEntity shujiyuyue, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shujiyuyue:{}",this.getClass().getName(),shujiyuyue.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            shujiyuyue.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("教师".equals(role))
            shujiyuyue.setLaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<ShujiyuyueEntity> queryWrapper = new EntityWrapper<ShujiyuyueEntity>()
            .eq("jiaoshi_id", shujiyuyue.getJiaoshiId())
            .eq("yonghu_id", shujiyuyue.getYonghuId())
            .eq("laoshi_id", shujiyuyue.getLaoshiId())
            .eq("shujiyuyue_text", shujiyuyue.getShujiyuyueText())
            .eq("shujiyuyue_yesno_types", shujiyuyue.getShujiyuyueYesnoTypes())
            .eq("shujiyuyue_yesno_text", shujiyuyue.getShujiyuyueYesnoText())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShujiyuyueEntity shujiyuyueEntity = shujiyuyueService.selectOne(queryWrapper);
        if(shujiyuyueEntity==null){
            shujiyuyue.setShujiyuyueYesnoTypes(1);
            shujiyuyue.setInsertTime(new Date());
            shujiyuyue.setCreateTime(new Date());
            shujiyuyueService.insert(shujiyuyue);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShujiyuyueEntity shujiyuyue, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,shujiyuyue:{}",this.getClass().getName(),shujiyuyue.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            shujiyuyue.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
//        else if("教师".equals(role))
//            shujiyuyue.setLaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<ShujiyuyueEntity> queryWrapper = new EntityWrapper<ShujiyuyueEntity>()
            .notIn("id",shujiyuyue.getId())
            .andNew()
            .eq("jiaoshi_id", shujiyuyue.getJiaoshiId())
            .eq("yonghu_id", shujiyuyue.getYonghuId())
            .eq("laoshi_id", shujiyuyue.getLaoshiId())
            .eq("shujiyuyue_text", shujiyuyue.getShujiyuyueText())
            .eq("shujiyuyue_yesno_types", shujiyuyue.getShujiyuyueYesnoTypes())
            .eq("shujiyuyue_yesno_text", shujiyuyue.getShujiyuyueYesnoText())
            .eq("shujiyuyue_time", shujiyuyue.getShujiyuyueTime())
            .eq("insert_time", shujiyuyue.getInsertTime())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShujiyuyueEntity shujiyuyueEntity = shujiyuyueService.selectOne(queryWrapper);
        if(shujiyuyueEntity==null){
            shujiyuyueService.updateById(shujiyuyue);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        shujiyuyueService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<ShujiyuyueEntity> shujiyuyueList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ShujiyuyueEntity shujiyuyueEntity = new ShujiyuyueEntity();
//                            shujiyuyueEntity.setJiaoshiId(Integer.valueOf(data.get(0)));   //教室 要改的
//                            shujiyuyueEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            shujiyuyueEntity.setLaoshiId(Integer.valueOf(data.get(0)));   //教师 要改的
//                            shujiyuyueEntity.setShujiyuyueText(data.get(0));                    //预约信息 要改的
//                            shujiyuyueEntity.setShujiyuyueYesnoTypes(Integer.valueOf(data.get(0)));   //预约审核 要改的
//                            shujiyuyueEntity.setShujiyuyueYesnoText(data.get(0));                    //审核原因 要改的
//                            shujiyuyueEntity.setShujiyuyueTime(new Date(data.get(0)));          //预约时间 要改的
//                            shujiyuyueEntity.setInsertTime(date);//时间
//                            shujiyuyueEntity.setCreateTime(date);//时间
                            shujiyuyueList.add(shujiyuyueEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        shujiyuyueService.insertBatch(shujiyuyueList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
