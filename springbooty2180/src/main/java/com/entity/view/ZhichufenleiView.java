package com.entity.view;

import com.entity.ZhichufenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 支出分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
@TableName("zhichufenlei")
public class ZhichufenleiView  extends ZhichufenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhichufenleiView(){
	}
 
 	public ZhichufenleiView(ZhichufenleiEntity zhichufenleiEntity){
 	try {
			BeanUtils.copyProperties(this, zhichufenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
