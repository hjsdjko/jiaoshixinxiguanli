package com.entity.vo;

import com.entity.JiaoshiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教室信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaoshi")
public class JiaoshiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
