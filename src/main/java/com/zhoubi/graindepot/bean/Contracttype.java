package com.zhoubi.graindepot.bean;import java.io.Serializable;import java.util.Date;import java.text.SimpleDateFormat;public class Contracttype implements Serializable {	private Integer conttypeid;//合同类型主键	private String conttypecode;//合同类型编号	private String conttypename;//合同类型名称	private Short buysellflag;//购销标志（1：采购，-1：销售）	private String buysellflagstr;	public String getBuysellflagstr() {		if (buysellflag!=null&&buysellflag==1) {			return "采购";		}		if (buysellflag!=null&&buysellflag==-1) {			return "销售";		}		return buysellflagstr;	}	public void setBuysellflagstr(String buysellflagstr) {		this.buysellflagstr = buysellflagstr;	}	public Integer getConttypeid() {		return conttypeid;	}	public void setConttypeid(Integer conttypeid) {		this.conttypeid = conttypeid;	}	public String getConttypecode() {		return conttypecode;	}	public void setConttypecode(String conttypecode) {		this.conttypecode = conttypecode;	}	public String getConttypename() {		return conttypename;	}	public void setConttypename(String conttypename) {		this.conttypename = conttypename;	}	public Short getBuysellflag() {		return buysellflag;	}	public void setBuysellflag(Short buysellflag) {		this.buysellflag = buysellflag;	}}