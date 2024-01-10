package com.entity.view;

import com.entity.JiatingzhichuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家庭支出
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
@TableName("jiatingzhichu")
public class JiatingzhichuView  extends JiatingzhichuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiatingzhichuView(){
	}
 
 	public JiatingzhichuView(JiatingzhichuEntity jiatingzhichuEntity){
 	try {
			BeanUtils.copyProperties(this, jiatingzhichuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
