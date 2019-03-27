package com.zhoubi.graindepot.bean;import java.io.Serializable;import java.util.Date;import java.text.SimpleDateFormat;public class DruginstoreDetail implements Serializable {	private Integer keyid;//药剂入库明细主键	private Integer billid;//药剂入库主键	private Integer rowno;//行号	private Integer drugid;//药剂资料	private Double inqty;//入库数量	private Double price;//单价	private Double amount;//金额	private Double unitqty;//单包数量	private Double inmeasqty;//入库计量数量（计）	private String prodfac;//生产厂家	private Date proddate;//生产日期	private String batchcode;//生产批号	private String remark;//摘要	private String drgvender;//药剂供应商	private String brand;//药剂品牌	public String getDrgvender() {		return drgvender;	}	public void setDrgvender(String drgvender) {		this.drgvender = drgvender;	}	public String getBrand() {		return brand;	}	public void setBrand(String brand) {		this.brand = brand;	}	public Integer getKeyid(){		return keyid;	}	public void setKeyid(Integer keyid){		this.keyid=keyid;	}	public Integer getBillid(){		return billid;	}	public void setBillid(Integer billid){		this.billid=billid;	}	public Integer getRowno(){		return rowno;	}	public void setRowno(Integer rowno){		this.rowno=rowno;	}	public Integer getDrugid(){		return drugid;	}	public void setDrugid(Integer drugid){		this.drugid=drugid;	}	public Double getInqty(){		return inqty;	}	public void setInqty(Double inqty){		this.inqty=inqty;	}	public Double getPrice(){		return price;	}	public void setPrice(Double price){		this.price=price;	}	public Double getAmount(){		return amount;	}	public void setAmount(Double amount){		this.amount=amount;	}	public Double getUnitqty(){		return unitqty;	}	public void setUnitqty(Double unitqty){		this.unitqty=unitqty;	}	public Double getInmeasqty(){		return inmeasqty;	}	public void setInmeasqty(Double inmeasqty){		this.inmeasqty=inmeasqty;	}	public String getProdfac(){		return prodfac;	}	public void setProdfac(String prodfac){		this.prodfac=prodfac;	}private String proddatestr;	public void setProddatestr(String proddatestr){		this.proddatestr=proddatestr;	}	public String getProddatestr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		 return proddate == null ? proddatestr : simpleDateFormat.format(proddate); 	}	public Date getProddate(){		return proddate;	}	public void setProddate(Date proddate){		this.proddate=proddate;	}	public String getBatchcode(){		return batchcode;	}	public void setBatchcode(String batchcode){		this.batchcode=batchcode;	}	public String getRemark(){		return remark;	}	public void setRemark(String remark){		this.remark=remark;	}}