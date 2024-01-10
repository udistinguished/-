package com.entity.vo;

import com.entity.JiatingzhichuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 家庭支出
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
public class JiatingzhichuVO  implements Serializable {
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
	 * 支出分类
	 */
	
	private String zhichufenlei;
		
	/**
	 * 金额
	 */
	
	private String jine;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
	 * 设置：支出分类
	 */
	 
	public void setZhichufenlei(String zhichufenlei) {
		this.zhichufenlei = zhichufenlei;
	}
	
	/**
	 * 获取：支出分类
	 */
	public String getZhichufenlei() {
		return zhichufenlei;
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
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
