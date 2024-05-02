package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 教室预约
 *
 * @author 
 * @email
 */
@TableName("shujiyuyue")
public class ShujiyuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShujiyuyueEntity() {

	}

	public ShujiyuyueEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="HH:mm")
	@DateTimeFormat
    @TableField(value = "shujiyuyue_time")

    private Date shujiyuyueTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Shujiyuyue{" +
            "id=" + id +
            ", jiaoshiId=" + jiaoshiId +
            ", yonghuId=" + yonghuId +
            ", laoshiId=" + laoshiId +
            ", shujiyuyueText=" + shujiyuyueText +
            ", shujiyuyueYesnoTypes=" + shujiyuyueYesnoTypes +
            ", shujiyuyueYesnoText=" + shujiyuyueYesnoText +
            ", shujiyuyueTime=" + shujiyuyueTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
