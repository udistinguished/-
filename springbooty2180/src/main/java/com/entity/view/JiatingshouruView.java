package com.entity.view;

import com.entity.JiatingshouruEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家庭收入
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
@TableName("jiatingshouru")
public class JiatingshouruView  extends JiatingshouruEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiatingshouruView(){
	}
 
 	public JiatingshouruView(JiatingshouruEntity jiatingshouruEntity){
 	try {
			BeanUtils.copyProperties(this, jiatingshouruEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
