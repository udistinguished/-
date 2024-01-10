package com.entity.view;

import com.entity.TouzilicaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 投资理财
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
@TableName("touzilicai")
public class TouzilicaiView  extends TouzilicaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TouzilicaiView(){
	}
 
 	public TouzilicaiView(TouzilicaiEntity touzilicaiEntity){
 	try {
			BeanUtils.copyProperties(this, touzilicaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
