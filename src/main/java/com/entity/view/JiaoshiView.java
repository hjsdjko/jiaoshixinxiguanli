package com.entity.view;

import com.entity.JiaoshiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 教室信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiaoshi")
public class JiaoshiView extends JiaoshiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 教室类型的值
		*/
		private String jiaoshiValue;
		/**
		* 教室状态的值
		*/
		private String jiaoshiStatusValue;



	public JiaoshiView() {

	}

	public JiaoshiView(JiaoshiEntity jiaoshiEntity) {
		try {
			BeanUtils.copyProperties(this, jiaoshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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









}
