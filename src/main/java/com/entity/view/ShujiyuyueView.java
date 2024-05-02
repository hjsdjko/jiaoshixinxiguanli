package com.entity.view;

import com.entity.ShujiyuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 教室预约
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shujiyuyue")
public class ShujiyuyueView extends ShujiyuyueEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 预约审核的值
		*/
		private String shujiyuyueYesnoValue;



		//级联表 jiaoshi
			/**
			* 教室编号
			*/
			private String jiaoshiUuidNumber;
			/**
			* 教室标题
			*/
			private String jiaoshiName;
			/**
			* 教室类型
			*/
			private Integer jiaoshiTypes;
				/**
				* 教室类型的值
				*/
				private String jiaoshiValue;
			/**
			* 教室状态
			*/
			private Integer jiaoshiStatusTypes;
				/**
				* 教室状态的值
				*/
				private String jiaoshiStatusValue;
			/**
			* 教室图片
			*/
			private String jiaoshiPhoto;
			/**
			* 教室地址
			*/
			private String jiaoshiAddress;
			/**
			* 教室容纳量
			*/
			private Integer jiaoshiRongnaliang;
			/**
			* 教室详情
			*/
			private String jiaoshiContent;

		//级联表 laoshi
			/**
			* 教师姓名
			*/
			private String laoshiName;
			/**
			* 头像
			*/
			private String laoshiPhoto;
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

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public ShujiyuyueView() {

	}

	public ShujiyuyueView(ShujiyuyueEntity shujiyuyueEntity) {
		try {
			BeanUtils.copyProperties(this, shujiyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 预约审核的值
			*/
			public String getShujiyuyueYesnoValue() {
				return shujiyuyueYesnoValue;
			}
			/**
			* 设置： 预约审核的值
			*/
			public void setShujiyuyueYesnoValue(String shujiyuyueYesnoValue) {
				this.shujiyuyueYesnoValue = shujiyuyueYesnoValue;
			}








				//级联表的get和set jiaoshi
					/**
					* 获取： 教室编号
					*/
					public String getJiaoshiUuidNumber() {
						return jiaoshiUuidNumber;
					}
					/**
					* 设置： 教室编号
					*/
					public void setJiaoshiUuidNumber(String jiaoshiUuidNumber) {
						this.jiaoshiUuidNumber = jiaoshiUuidNumber;
					}
					/**
					* 获取： 教室标题
					*/
					public String getJiaoshiName() {
						return jiaoshiName;
					}
					/**
					* 设置： 教室标题
					*/
					public void setJiaoshiName(String jiaoshiName) {
						this.jiaoshiName = jiaoshiName;
					}
					/**
					* 获取： 教室类型
					*/
					public Integer getJiaoshiTypes() {
						return jiaoshiTypes;
					}
					/**
					* 设置： 教室类型
					*/
					public void setJiaoshiTypes(Integer jiaoshiTypes) {
						this.jiaoshiTypes = jiaoshiTypes;
					}


						/**
						* 获取： 教室类型的值
						*/
						public String getJiaoshiValue() {
							return jiaoshiValue;
						}
						/**
						* 设置： 教室类型的值
						*/
						public void setJiaoshiValue(String jiaoshiValue) {
							this.jiaoshiValue = jiaoshiValue;
						}
					/**
					* 获取： 教室状态
					*/
					public Integer getJiaoshiStatusTypes() {
						return jiaoshiStatusTypes;
					}
					/**
					* 设置： 教室状态
					*/
					public void setJiaoshiStatusTypes(Integer jiaoshiStatusTypes) {
						this.jiaoshiStatusTypes = jiaoshiStatusTypes;
					}


						/**
						* 获取： 教室状态的值
						*/
						public String getJiaoshiStatusValue() {
							return jiaoshiStatusValue;
						}
						/**
						* 设置： 教室状态的值
						*/
						public void setJiaoshiStatusValue(String jiaoshiStatusValue) {
							this.jiaoshiStatusValue = jiaoshiStatusValue;
						}
					/**
					* 获取： 教室图片
					*/
					public String getJiaoshiPhoto() {
						return jiaoshiPhoto;
					}
					/**
					* 设置： 教室图片
					*/
					public void setJiaoshiPhoto(String jiaoshiPhoto) {
						this.jiaoshiPhoto = jiaoshiPhoto;
					}
					/**
					* 获取： 教室地址
					*/
					public String getJiaoshiAddress() {
						return jiaoshiAddress;
					}
					/**
					* 设置： 教室地址
					*/
					public void setJiaoshiAddress(String jiaoshiAddress) {
						this.jiaoshiAddress = jiaoshiAddress;
					}
					/**
					* 获取： 教室容纳量
					*/
					public Integer getJiaoshiRongnaliang() {
						return jiaoshiRongnaliang;
					}
					/**
					* 设置： 教室容纳量
					*/
					public void setJiaoshiRongnaliang(Integer jiaoshiRongnaliang) {
						this.jiaoshiRongnaliang = jiaoshiRongnaliang;
					}
					/**
					* 获取： 教室详情
					*/
					public String getJiaoshiContent() {
						return jiaoshiContent;
					}
					/**
					* 设置： 教室详情
					*/
					public void setJiaoshiContent(String jiaoshiContent) {
						this.jiaoshiContent = jiaoshiContent;
					}






				//级联表的get和set laoshi
					/**
					* 获取： 教师姓名
					*/
					public String getLaoshiName() {
						return laoshiName;
					}
					/**
					* 设置： 教师姓名
					*/
					public void setLaoshiName(String laoshiName) {
						this.laoshiName = laoshiName;
					}
					/**
					* 获取： 头像
					*/
					public String getLaoshiPhoto() {
						return laoshiPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setLaoshiPhoto(String laoshiPhoto) {
						this.laoshiPhoto = laoshiPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getLaoshiPhone() {
						return laoshiPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setLaoshiPhone(String laoshiPhone) {
						this.laoshiPhone = laoshiPhone;
					}
					/**
					* 获取： 邮箱
					*/
					public String getLaoshiEmail() {
						return laoshiEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setLaoshiEmail(String laoshiEmail) {
						this.laoshiEmail = laoshiEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getLaoshiDelete() {
						return laoshiDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setLaoshiDelete(Integer laoshiDelete) {
						this.laoshiDelete = laoshiDelete;
					}











				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}





}
