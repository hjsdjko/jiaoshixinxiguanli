package com.dao;

import com.entity.ShujiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShujiyuyueView;

/**
 * 教室预约 Dao 接口
 *
 * @author 
 */
public interface ShujiyuyueDao extends BaseMapper<ShujiyuyueEntity> {

   List<ShujiyuyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
