package com.entity.vo;

import com.entity.YinxingchuxuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 银行储蓄
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
public class YinxingchuxuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 储蓄类型
	 */
	
	private String chuxuleixing;
		
	/**
	 * 银行名称
	 */
	
	private String yinxingmingcheng;
		
	/**
	 * 银行账户
	 */
	
	private String yinxingzhanghu;
		
	/**
	 * 金额
	 */
	
	private String jine;
		
	/**
	 * 存入时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date cunrushijian;
		
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
	 * 设置：储蓄类型
	 */
	 
	public void setChuxuleixing(String chuxuleixing) {
		this.chuxuleixing = chuxuleixing;
	}
	
	/**
	 * 获取：储蓄类型
	 */
	public String getChuxuleixing() {
		return chuxuleixing;
	}
				
	
	/**
	 * 设置：银行名称
	 */
	 
	public void setYinxingmingcheng(String yinxingmingcheng) {
		this.yinxingmingcheng = yinxingmingcheng;
	}
	
	/**
	 * 获取：银行名称
	 */
	public String getYinxingmingcheng() {
		return yinxingmingcheng;
	}
				
	
	/**
	 * 设置：银行账户
	 */
	 
	public void setYinxingzhanghu(String yinxingzhanghu) {
		this.yinxingzhanghu = yinxingzhanghu;
	}
	
	/**
	 * 获取：银行账户
	 */
	public String getYinxingzhanghu() {
		return yinxingzhanghu;
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
	 * 设置：存入时间
	 */
	 
	public void setCunrushijian(Date cunrushijian) {
		this.cunrushijian = cunrushijian;
	}
	
	/**
	 * 获取：存入时间
	 */
	public Date getCunrushijian() {
		return cunrushijian;
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
