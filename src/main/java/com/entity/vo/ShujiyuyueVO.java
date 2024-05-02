package com.entity.vo;

import com.entity.ShujiyuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教室预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shujiyuyue")
public class ShujiyuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 教室
     */

    @TableField(value = "jiaoshi_id")
    private Integer jiaoshiId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 教师
     */

    @TableField(value = "laoshi_id")
    private Integer laoshiId;


    /**
     * 预约信息
     */

    @TableField(value = "shujiyuyue_text")
    private String shujiyuyueText;


    /**
     * 预约审核
     */

    @TableField(value = "shujiyuyue_yesno_types")
    private Integer shujiyuyueYesnoTypes;


    /**
     * 审核原因
     */

    @TableField(value = "shujiyuyue_yesno_text")
    private String shujiyuyueYesnoText;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shujiyuyue_time")
    private Date shujiyuyueTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：教室
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：教室
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：教师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 获取：教师
	 */

    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 设置：预约信息
	 */
    public String getShujiyuyueText() {
        return shujiyuyueText;
    }


    /**
	 * 获取：预约信息
	 */

    public void setShujiyuyueText(String shujiyuyueText) {
        this.shujiyuyueText = shujiyuyueText;
    }
    /**
	 * 设置：预约审核
	 */
    public Integer getShujiyuyueYesnoTypes() {
        return shujiyuyueYesnoTypes;
    }


    /**
	 * 获取：预约审核
	 */

    public void setShujiyuyueYesnoTypes(Integer shujiyuyueYesnoTypes) {
        this.shujiyuyueYesnoTypes = shujiyuyueYesnoTypes;
    }
    /**
	 * 设置：审核原因
	 */
    public String getShujiyuyueYesnoText() {
        return shujiyuyueYesnoText;
    }


    /**
	 * 获取：审核原因
	 */

    public void setShujiyuyueYesnoText(String shujiyuyueYesnoText) {
        this.shujiyuyueYesnoText = shujiyuyueYesnoText;
    }
    /**
	 * 设置：预约时间
	 */
    public Date getShujiyuyueTime() {
        return shujiyuyueTime;
    }


    /**
	 * 获取：预约时间
	 */

    public void setShujiyuyueTime(Date shujiyuyueTime) {
        this.shujiyuyueTime = shujiyuyueTime;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
