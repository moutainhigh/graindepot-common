package com.zhoubi.graindepot.bean;import java.io.Serializable;import java.util.Date;import java.text.SimpleDateFormat;public class GrainattrUpdate implements Serializable {	private Integer keyid;//主键	private String billcode;//单据号	private Date billdate;//单据日期	private Short billstate;//单据状态（0：编辑，1：已审核，-1：已作废）	private Integer groupid;//集团	private Integer companyid;//企业	private Integer graindepotid;//粮库	private Integer storageid;//仓房	private Integer grainid;//粮食品种	private Short producingyear;//收获年度	private Integer oldgrainattrid;//原粮食性质	private Integer newgrainattrid;//现粮食性质	private Double updateqty;//粮食性质变更数	private Integer createuserid;//创建人	private Date createtime;//创建时间	private Integer spuserid;//审批人	private Date sptime;//审批时间	private Short delflag;//逻辑删除标志（1：删除）	private String groupname;	private String companyname;	private String graindepotname;	private String storagename;	private String grainname;	private String oldgrainattrname;	private String newgrainattrname;	public String getGroupname() {		return groupname;	}	public void setGroupname(String groupname) {		this.groupname = groupname;	}	public String getCompanyname() {		return companyname;	}	public void setCompanyname(String companyname) {		this.companyname = companyname;	}	public String getGraindepotname() {		return graindepotname;	}	public void setGraindepotname(String graindepotname) {		this.graindepotname = graindepotname;	}	public String getStoragename() {		return storagename;	}	public void setStoragename(String storagename) {		this.storagename = storagename;	}	public String getGrainname() {		return grainname;	}	public void setGrainname(String grainname) {		this.grainname = grainname;	}	public String getOldgrainattrname() {		return oldgrainattrname;	}	public void setOldgrainattrname(String oldgrainattrname) {		this.oldgrainattrname = oldgrainattrname;	}	public String getNewgrainattrname() {		return newgrainattrname;	}	public void setNewgrainattrname(String newgrainattrname) {		this.newgrainattrname = newgrainattrname;	}	public Integer getKeyid(){		return keyid;	}	public void setKeyid(Integer keyid){		this.keyid=keyid;	}	public String getBillcode(){		return billcode;	}	public void setBillcode(String billcode){		this.billcode=billcode;	}private String billdatestr;	public void setBilldatestr(String billdatestr){		this.billdatestr=billdatestr;	}	public String getBilldatestr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		 return billdate == null ? billdatestr : simpleDateFormat.format(billdate); 	}	public Date getBilldate(){		return billdate;	}	public void setBilldate(Date billdate){		this.billdate=billdate;	}	public Short getBillstate(){		return billstate;	}	public void setBillstate(Short billstate){		this.billstate=billstate;	}	public Integer getGroupid(){		return groupid;	}	public void setGroupid(Integer groupid){		this.groupid=groupid;	}	public Integer getCompanyid(){		return companyid;	}	public void setCompanyid(Integer companyid){		this.companyid=companyid;	}	public Integer getGraindepotid(){		return graindepotid;	}	public void setGraindepotid(Integer graindepotid){		this.graindepotid=graindepotid;	}	public Integer getStorageid(){		return storageid;	}	public void setStorageid(Integer storageid){		this.storageid=storageid;	}	public Integer getGrainid(){		return grainid;	}	public void setGrainid(Integer grainid){		this.grainid=grainid;	}	public Short getProducingyear(){		return producingyear;	}	public void setProducingyear(Short producingyear){		this.producingyear=producingyear;	}	public Integer getOldgrainattrid(){		return oldgrainattrid;	}	public void setOldgrainattrid(Integer oldgrainattrid){		this.oldgrainattrid=oldgrainattrid;	}	public Integer getNewgrainattrid(){		return newgrainattrid;	}	public void setNewgrainattrid(Integer newgrainattrid){		this.newgrainattrid=newgrainattrid;	}	public Double getUpdateqty(){		return updateqty;	}	public void setUpdateqty(Double updateqty){		this.updateqty=updateqty;	}	public Integer getCreateuserid(){		return createuserid;	}	public void setCreateuserid(Integer createuserid){		this.createuserid=createuserid;	}private String createtimestr;	public void setCreatetimestr(String createtimestr){		this.createtimestr=createtimestr;	}	public String getCreatetimestr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		 return createtime == null ? createtimestr : simpleDateFormat.format(createtime); 	}	public Date getCreatetime(){		return createtime;	}	public void setCreatetime(Date createtime){		this.createtime=createtime;	}	public Integer getSpuserid(){		return spuserid;	}	public void setSpuserid(Integer spuserid){		this.spuserid=spuserid;	}private String sptimestr;	public void setSptimestr(String sptimestr){		this.sptimestr=sptimestr;	}	public String getSptimestr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		 return sptime == null ? sptimestr : simpleDateFormat.format(sptime); 	}	public Date getSptime(){		return sptime;	}	public void setSptime(Date sptime){		this.sptime=sptime;	}	public Short getDelflag(){		return delflag;	}	public void setDelflag(Short delflag){		this.delflag=delflag;	}}