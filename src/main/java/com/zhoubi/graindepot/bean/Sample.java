package com.zhoubi.graindepot.bean;import java.io.Serializable;import java.util.Date;import java.text.SimpleDateFormat;public class Sample implements Serializable {	private Integer sampid;//样品主键	private String sampcode;//样品编号	private Integer groupid;//集团	private Integer companyid;//企业	private Integer graindepotid;//粮库	private Integer storageid;//仓房	private Integer grainid;//粮食品种	private Integer grainattrid;//粮食性质	private Short producingyear;//收获年度	private Date sampdate;//扦样日期	private String sampname;//扦样人	private Double sampqty;//样品数量	private Double standardqty;//代表数量	private String sampfrom;//样品来源单位	private String iccardnum;//IC卡内码	private Date validdate;//有效期限	private String baoguanuse;//样品保管员	private String baoguanpos;//样品保管位置	private Short clearflag;//清理标志（1：清理）	private Date cleardate;//清理日期	private String clearuser;//清理操作员	private Integer createuserid;//创建人	private Date createtime;//创建时间	private Short delflag;//逻辑删除标志（1：删除）	private String grainname;	private String grainattrname;	private String companyname;	private String groupname;	private String graindepotname;	private String storagename;	private String clearflagstr;//清理标志str	public String getClearflagstr() {		if (clearflag!=null&&clearflag==1) {			return "是";		}		return "否";	}	public void setClearflagstr(String clearflagstr) {		this.clearflagstr = clearflagstr;	}	public String getGrainname() {		return grainname;	}	public void setGrainname(String grainname) {		this.grainname = grainname;	}	public String getGrainattrname() {		return grainattrname;	}	public void setGrainattrname(String grainattrname) {		this.grainattrname = grainattrname;	}	public String getCompanyname() {		return companyname;	}	public void setCompanyname(String companyname) {		this.companyname = companyname;	}	public String getGroupname() {		return groupname;	}	public void setGroupname(String groupname) {		this.groupname = groupname;	}	public String getGraindepotname() {		return graindepotname;	}	public void setGraindepotname(String graindepotname) {		this.graindepotname = graindepotname;	}	public String getStoragename() {		return storagename;	}	public void setStoragename(String storagename) {		this.storagename = storagename;	}	public Integer getSampid(){		return sampid;	}	public void setSampid(Integer sampid){		this.sampid=sampid;	}	public String getSampcode(){		return sampcode;	}	public void setSampcode(String sampcode){		this.sampcode=sampcode;	}	public Integer getGroupid(){		return groupid;	}	public void setGroupid(Integer groupid){		this.groupid=groupid;	}	public Integer getCompanyid(){		return companyid;	}	public void setCompanyid(Integer companyid){		this.companyid=companyid;	}	public Integer getGraindepotid(){		return graindepotid;	}	public void setGraindepotid(Integer graindepotid){		this.graindepotid=graindepotid;	}	public Integer getStorageid(){		return storageid;	}	public void setStorageid(Integer storageid){		this.storageid=storageid;	}	public Integer getGrainid(){		return grainid;	}	public void setGrainid(Integer grainid){		this.grainid=grainid;	}	public Integer getGrainattrid(){		return grainattrid;	}	public void setGrainattrid(Integer grainattrid){		this.grainattrid=grainattrid;	}	public Short getProducingyear(){		return producingyear;	}	public void setProducingyear(Short producingyear){		this.producingyear=producingyear;	}private String sampdatestr;	public void setSampdatestr(String sampdatestr){		this.sampdatestr=sampdatestr;	}	public String getSampdatestr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");		 return sampdate == null ? sampdatestr : simpleDateFormat.format(sampdate); 	}	public Date getSampdate(){		return sampdate;	}	public void setSampdate(Date sampdate){		this.sampdate=sampdate;	}	public String getSampname(){		return sampname;	}	public void setSampname(String sampname){		this.sampname=sampname;	}	public Double getSampqty(){		return sampqty;	}	public void setSampqty(Double sampqty){		this.sampqty=sampqty;	}	public Double getStandardqty(){		return standardqty;	}	public void setStandardqty(Double standardqty){		this.standardqty=standardqty;	}	public String getSampfrom(){		return sampfrom;	}	public void setSampfrom(String sampfrom){		this.sampfrom=sampfrom;	}	public String getIccardnum(){		return iccardnum;	}	public void setIccardnum(String iccardnum){		this.iccardnum=iccardnum;	}private String validdatestr;	public void setValiddatestr(String validdatestr){		this.validdatestr=validdatestr;	}	public String getValiddatestr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");		 return validdate == null ? validdatestr : simpleDateFormat.format(validdate); 	}	public Date getValiddate(){		return validdate;	}	public void setValiddate(Date validdate){		this.validdate=validdate;	}	public String getBaoguanuse(){		return baoguanuse;	}	public void setBaoguanuse(String baoguanuse){		this.baoguanuse=baoguanuse;	}	public String getBaoguanpos(){		return baoguanpos;	}	public void setBaoguanpos(String baoguanpos){		this.baoguanpos=baoguanpos;	}	public Short getClearflag(){		return clearflag;	}	public void setClearflag(Short clearflag){		this.clearflag=clearflag;	}private String cleardatestr;	public void setCleardatestr(String cleardatestr){		this.cleardatestr=cleardatestr;	}	public String getCleardatestr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");		 return cleardate == null ? cleardatestr : simpleDateFormat.format(cleardate); 	}	public Date getCleardate(){		return cleardate;	}	public void setCleardate(Date cleardate){		this.cleardate=cleardate;	}	public String getClearuser(){		return clearuser;	}	public void setClearuser(String clearuser){		this.clearuser=clearuser;	}	public Integer getCreateuserid(){		return createuserid;	}	public void setCreateuserid(Integer createuserid){		this.createuserid=createuserid;	}private String createtimestr;	public void setCreatetimestr(String createtimestr){		this.createtimestr=createtimestr;	}	public String getCreatetimestr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");		 return createtime == null ? createtimestr : simpleDateFormat.format(createtime); 	}	public Date getCreatetime(){		return createtime;	}	public void setCreatetime(Date createtime){		this.createtime=createtime;	}	public Short getDelflag(){		return delflag;	}	public void setDelflag(Short delflag){		this.delflag=delflag;	}}