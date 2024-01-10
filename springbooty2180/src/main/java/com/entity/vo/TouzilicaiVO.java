package com.entity.vo;

import com.entity.TouzilicaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 投资理财
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
public class TouzilicaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 投资类型
	 */
	
	private String touzileixing;
		
	/**
	 * 投资账户
	 */
	
	private String touzizhanghu;
		
	/**
	 * 名称
	 */
	
	private String mingcheng;
		
	/**
	 * 金额
	 */
	
	private String jine;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 投资时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date touzishijian;
				
	
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
	 * 设置：投资类型
	 */
	 
	public void setTouzileixing(String touzileixing) {
		this.touzileixing = touzileixing;
	}
	
	/**
	 * 获取：投资类型
	 */
	public String getTouzileixing() {
		return touzileixing;
	}
				
	
	/**
	 * 设置：投资账户
	 */
	 
	public void setTouzizhanghu(String touzizhanghu) {
		this.touzizhanghu = touzizhanghu;
	}
	
	/**
	 * 获取：投资账户
	 */
	public String getTouzizhanghu() {
		return touzizhanghu;
	}
				
	
	/**
	 * 设置：名称
	 */
	 
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
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
				
	
	/**
	 * 设置：投资时间
	 */
	 
	public void setTouzishijian(Date touzishijian) {
		this.touzishijian = touzishijian;
	}
	
	/**
	 * 获取：投资时间
	 */
	public Date getTouzishijian() {
		return touzishijian;
	}
			
}
