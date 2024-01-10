package com.entity.view;

import com.entity.YinxingchuxuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 银行储蓄
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
@TableName("yinxingchuxu")
public class YinxingchuxuView  extends YinxingchuxuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YinxingchuxuView(){
	}
 
 	public YinxingchuxuView(YinxingchuxuEntity yinxingchuxuEntity){
 	try {
			BeanUtils.copyProperties(this, yinxingchuxuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
