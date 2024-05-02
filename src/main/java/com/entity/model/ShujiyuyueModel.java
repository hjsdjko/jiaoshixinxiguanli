package com.entity.model;

import com.entity.ShujiyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 教室预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShujiyuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 教室
     */
    private Integer jiaoshiId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 教师
     */
    private Integer laoshiId;


    /**
     * 预约信息
     */
    private String shujiyuyueText;


    /**
     * 预约审核
     */
    private Integer shujiyuyueYesnoTypes;


    /**
     * 审核原因
     */
    private String shujiyuyueYesnoText;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date shujiyuyueTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：教室
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 设置：教室
	 */
    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：教师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 设置：教师
	 */
    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 获取：预约信息
	 */
    public String getShujiyuyueText() {
        return shujiyuyueText;
    }


    /**
	 * 设置：预约信息
	 */
    public void setShujiyuyueText(String shujiyuyueText) {
        this.shujiyuyueText = shujiyuyueText;
    }
    /**
	 * 获取：预约审核
	 */
    public Integer getShujiyuyueYesnoTypes() {
        return shujiyuyueYesnoTypes;
    }


    /**
	 * 设置：预约审核
	 */
    public void setShujiyuyueYesnoTypes(Integer shujiyuyueYesnoTypes) {
        this.shujiyuyueYesnoTypes = shujiyuyueYesnoTypes;
    }
    /**
	 * 获取：审核原因
	 */
    public String getShujiyuyueYesnoText() {
        return shujiyuyueYesnoText;
    }


    /**
	 * 设置：审核原因
	 */
    public void setShujiyuyueYesnoText(String shujiyuyueYesnoText) {
        this.shujiyuyueYesnoText = shujiyuyueYesnoText;
    }
    /**
	 * 获取：预约时间
	 */
    public Date getShujiyuyueTime() {
        return shujiyuyueTime;
    }


    /**
	 * 设置：预约时间
	 */
    public void setShujiyuyueTime(Date shujiyuyueTime) {
        this.shujiyuyueTime = shujiyuyueTime;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
