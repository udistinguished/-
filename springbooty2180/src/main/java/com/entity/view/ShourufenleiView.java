package com.entity.view;

import com.entity.ShourufenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 收入分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
@TableName("shourufenlei")
public class ShourufenleiView  extends ShourufenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShourufenleiView(){
	}
 
 	public ShourufenleiView(ShourufenleiEntity shourufenleiEntity){
 	try {
			BeanUtils.copyProperties(this, shourufenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
