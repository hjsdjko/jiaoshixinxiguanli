package com.entity.model;

import com.entity.LaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 教师
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LaoshiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 教师姓名
     */
    private String laoshiName;


    /**
     * 头像
     */
    private String laoshiPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 联系方式
     */
    private String laoshiPhone;


    /**
     * 邮箱
     */
    private String laoshiEmail;


    /**
     * 假删
     */
    private Integer laoshiDelete;


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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：教师姓名
	 */
    public String getLaoshiName() {
        return laoshiName;
    }


    /**
	 * 设置：教师姓名
	 */
    public void setLaoshiName(String laoshiName) {
        this.laoshiName = laoshiName;
    }
    /**
	 * 获取：头像
	 */
    public String getLaoshiPhoto() {
        return laoshiPhoto;
    }


    /**
	 * 设置：头像
	 */
    public void setLaoshiPhoto(String laoshiPhoto) {
        this.laoshiPhoto = laoshiPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：联系方式
	 */
    public String getLaoshiPhone() {
        return laoshiPhone;
    }


    /**
	 * 设置：联系方式
	 */
    public void setLaoshiPhone(String laoshiPhone) {
        this.laoshiPhone = laoshiPhone;
    }
    /**
	 * 获取：邮箱
	 */
    public String getLaoshiEmail() {
        return laoshiEmail;
    }


    /**
	 * 设置：邮箱
	 */
    public void setLaoshiEmail(String laoshiEmail) {
        this.laoshiEmail = laoshiEmail;
    }
    /**
	 * 获取：假删
	 */
    public Integer getLaoshiDelete() {
        return laoshiDelete;
    }


    /**
	 * 设置：假删
	 */
    public void setLaoshiDelete(Integer laoshiDelete) {
        this.laoshiDelete = laoshiDelete;
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
