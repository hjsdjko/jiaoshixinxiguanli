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
 * 教室信息
 *
 * @author 
 * @email
 */
@TableName("jiaoshi")
public class JiaoshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaoshiEntity() {

	}

	public JiaoshiEntity(T t) {
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
     * 教室编号
     */
    @TableField(value = "jiaoshi_uuid_number")

    private String jiaoshiUuidNumber;


    /**
     * 教室标题
     */
    @TableField(value = "jiaoshi_name")

    private String jiaoshiName;


    /**
     * 教室类型
     */
    @TableField(value = "jiaoshi_types")

    private Integer jiaoshiTypes;


    /**
     * 教室状态
     */
    @TableField(value = "jiaoshi_status_types")

    private Integer jiaoshiStatusTypes;


    /**
     * 教室图片
     */
    @TableField(value = "jiaoshi_photo")

    private String jiaoshiPhoto;


    /**
     * 教室地址
     */
    @TableField(value = "jiaoshi_address")

    private String jiaoshiAddress;


    /**
     * 教室容纳量
     */
    @TableField(value = "jiaoshi_rongnaliang")

    private Integer jiaoshiRongnaliang;


    /**
     * 教室详情
     */
    @TableField(value = "jiaoshi_content")

    private String jiaoshiContent;


    /**
     * 发布时间
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
	 * 设置：教室编号
	 */
    public String getJiaoshiUuidNumber() {
        return jiaoshiUuidNumber;
    }


    /**
	 * 获取：教室编号
	 */

    public void setJiaoshiUuidNumber(String jiaoshiUuidNumber) {
        this.jiaoshiUuidNumber = jiaoshiUuidNumber;
    }
    /**
	 * 设置：教室标题
	 */
    public String getJiaoshiName() {
        return jiaoshiName;
    }


    /**
	 * 获取：教室标题
	 */

    public void setJiaoshiName(String jiaoshiName) {
        this.jiaoshiName = jiaoshiName;
    }
    /**
	 * 设置：教室类型
	 */
    public Integer getJiaoshiTypes() {
        return jiaoshiTypes;
    }


    /**
	 * 获取：教室类型
	 */

    public void setJiaoshiTypes(Integer jiaoshiTypes) {
        this.jiaoshiTypes = jiaoshiTypes;
    }
    /**
	 * 设置：教室状态
	 */
    public Integer getJiaoshiStatusTypes() {
        return jiaoshiStatusTypes;
    }


    /**
	 * 获取：教室状态
	 */

    public void setJiaoshiStatusTypes(Integer jiaoshiStatusTypes) {
        this.jiaoshiStatusTypes = jiaoshiStatusTypes;
    }
    /**
	 * 设置：教室图片
	 */
    public String getJiaoshiPhoto() {
        return jiaoshiPhoto;
    }


    /**
	 * 获取：教室图片
	 */

    public void setJiaoshiPhoto(String jiaoshiPhoto) {
        this.jiaoshiPhoto = jiaoshiPhoto;
    }
    /**
	 * 设置：教室地址
	 */
    public String getJiaoshiAddress() {
        return jiaoshiAddress;
    }


    /**
	 * 获取：教室地址
	 */

    public void setJiaoshiAddress(String jiaoshiAddress) {
        this.jiaoshiAddress = jiaoshiAddress;
    }
    /**
	 * 设置：教室容纳量
	 */
    public Integer getJiaoshiRongnaliang() {
        return jiaoshiRongnaliang;
    }


    /**
	 * 获取：教室容纳量
	 */

    public void setJiaoshiRongnaliang(Integer jiaoshiRongnaliang) {
        this.jiaoshiRongnaliang = jiaoshiRongnaliang;
    }
    /**
	 * 设置：教室详情
	 */
    public String getJiaoshiContent() {
        return jiaoshiContent;
    }


    /**
	 * 获取：教室详情
	 */

    public void setJiaoshiContent(String jiaoshiContent) {
        this.jiaoshiContent = jiaoshiContent;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
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
        return "Jiaoshi{" +
            "id=" + id +
            ", jiaoshiUuidNumber=" + jiaoshiUuidNumber +
            ", jiaoshiName=" + jiaoshiName +
            ", jiaoshiTypes=" + jiaoshiTypes +
            ", jiaoshiStatusTypes=" + jiaoshiStatusTypes +
            ", jiaoshiPhoto=" + jiaoshiPhoto +
            ", jiaoshiAddress=" + jiaoshiAddress +
            ", jiaoshiRongnaliang=" + jiaoshiRongnaliang +
            ", jiaoshiContent=" + jiaoshiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
