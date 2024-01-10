package com.entity.vo;

import java.io.Serializable;
 

/**
 * 家庭账户
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
public class FamilyAccountVO implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 账户号
	 */
	
	private String zhanghuhao;
		
	/**
	 * 金额
	 */
	
	private String jine;
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：账户号
	 */
	 
	public void setZhanghuhao(String zhanghuhao) {
		this.zhanghuhao = zhanghuhao;
	}
	
	/**
	 * 获取：账户号
	 */
	public String getZhanghuhao() {
		return zhanghuhao;
	}
				
	
	/**
	 * 设置：金额
	 */
	 
	public void setJine(String jine) {
		this.jine = jine;
	}
	
	/**
	 * 获取：金额
	 */
	public String getJine() {
		return jine;
	}
			
}
