package com.zhoubi.graindepot.bean;import java.io.Serializable;import java.util.Date;import java.text.SimpleDateFormat;public class Storagestructure implements Serializable {	private Integer storagestructureid;//仓房结构主键	private String storagestructurename;//仓房结构名称	private Integer orderno;//仓房结构排序号	public Integer getStoragestructureid() {		return storagestructureid;	}	public void setStoragestructureid(Integer storagestructureid) {		this.storagestructureid = storagestructureid;	}	public String getStoragestructurename() {		return storagestructurename;	}	public void setStoragestructurename(String storagestructurename) {		this.storagestructurename = storagestructurename;	}	public Integer getOrderno(){		return orderno;	}	public void setOrderno(Integer orderno){		this.orderno=orderno;	}}