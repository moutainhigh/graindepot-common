package com.zhoubi.graindepot.bean;import java.io.Serializable;import java.util.Date;import java.text.SimpleDateFormat;public class Contract implements Serializable {	private Integer contractid;//合同主键	private Integer buysellflag;//购销标志（1：采购，-1：销售）	private Integer conttypeid;//合同类型主键	private String contractno;//合同号	private Integer groupid;//集团ID	private Integer companyid;//企业ID	private Integer graindepotid;//粮库ID	private Integer storageid;//仓房ID	private Integer grainid;//粮食品种主键	private Integer grainattrid;//粮食性质主键	private Integer producingyear;//收获年度	private Integer grade;//粮食等级（1：一等 2：二等 3：三等 4：四等 5：五等 6：等外 99：未定等）	private Integer traderid;//往来单位主键	private String tradartiperson;//往来单位法人代表	private String corpartiperson;//本公司法人代表	private Double tqty;//吨数量	private Double kgqty;//千克数量(计)	private Double tprice;//吨单价	private Double kgprice;//千克单价(计)	private Double amount;//金额	private Double execqty;//已执行数量	private Double exectqty;//已执行吨数量(计)	private Double bailpert;//每吨履约保证金	private Double bailrate;//履约保证金率	private Double bailamt;//履约保证金	private String gqrequire;//质量要求	private String partyaagent;//甲方委托代理人	private String partybagent;//乙方委托代理人	private String partyabanknum;//甲方银行卡号	private String partybbanknum;//乙方银行卡号	private String filenamelist;//附加文件清单，分号隔开	private String bidno;//中标号	private Double handlingpert;//每吨装卸费	private Double handlingamt;//装卸费	private Date signdate;//签订日期	private Date execdate;//实际执行日期	private Integer completed;//执行完毕（1：执行完毕）	private String signaddress;//签订地点	private String honouraddress;//履约地点	private Integer honourstate;//履行状态（0：未履行，1：履行中，2：履行终了）	private Date honourbegindate;//履约开始时间	private Date honourenddate;//履约结束时间	private Integer stopflag;//中止执行（1：中止执行）	private Integer stopfile;//终止依据	private Integer createuserid;//创建人	private Date createtime;//创建时间	private Integer spuserid;//审批人	private Date sptime;//审批时间	private Integer spstatus;//审批状态（0：待审批 1：审批通过 -1：审批不通过）	private String spremark;//审批意见	private String conttypename;//合同类型名称	private String grainname;//粮食品种名称	private String grainattrname;//粮食性质	private String tradername;//来往单位名称	private String gradestr;//粮食等级str	private String honourstatestr;//履行状态	private String spstatusstr;//审核状态	private String buysellflagstr;//购销标志	private String signdatestr;	private String execdatestr;	private String honourbegindatestr;	private String honourenddatestr;	private String createtimestr;	private String sptimestr;	public String getSpstatusstr() {		if (spstatus!=null) {			return Constant.Approval.getText(spstatus);		}		return spstatusstr;	}	public void setSpstatusstr(String spstatusstr) {		this.spstatusstr = spstatusstr;	}	public String getHonourstatestr() {		if (honourstate!=null&&honourstate==0) {			return "未履行";		}		if (honourstate!=null&&honourstate==1) {			return "履行中";		}		if (honourstate!=null&&honourstate==2) {			return "履行终了";		}		return honourstatestr;	}	public void setHonourstatestr(String honourstatestr) {		this.honourstatestr = honourstatestr;	}	public String getGradestr() {		if (grade!=null) {			return Constant.GrainGrade.getText(grade);		}		return gradestr;	}	public void setGradestr(String gradestr) {		this.gradestr = gradestr;	}	public String getBuysellflagstr() {		if (buysellflag!=null&&buysellflag==1) {			return "采购";		}else if (buysellflag!=null&&buysellflag==-1) {			return "销售";		}		return buysellflagstr;	}	public void setBuysellflagstr(String buysellflagstr) {		this.buysellflagstr = buysellflagstr;	}	public String getTradername() {		return tradername;	}	public void setTradername(String tradername) {		this.tradername = tradername;	}	public String getConttypename() {		return conttypename;	}	public void setContTypename(String conttypename) {		this.conttypename = conttypename;	}	public String getGrainname() {		return grainname;	}	public void setGrainname(String grainname) {		this.grainname = grainname;	}	public String getGrainattrname() {		return grainattrname;	}	public void setGrainattrname(String grainattrname) {		this.grainattrname = grainattrname;	}	public void setSigndatestr(String signdatestr){		this.signdatestr=signdatestr;	}	public String getSigndatestr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");		 return signdate == null ? signdatestr : simpleDateFormat.format(signdate);	}	public void setExecdatestr(String execdatestr){		this.execdatestr=execdatestr;	}	public String getExecdatestr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");		 return execdate == null ? execdatestr : simpleDateFormat.format(execdate);	}	public void setHonourbegindatestr(String honourbegindatestr){		this.honourbegindatestr=honourbegindatestr;	}	public String getHonourbegindatestr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");		 return honourbegindate == null ? honourbegindatestr : simpleDateFormat.format(honourbegindate);	}	public void setHonourenddatestr(String honourenddatestr){		this.honourenddatestr=honourenddatestr;	}	public String getHonourenddatestr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");		 return honourenddate == null ? honourenddatestr : simpleDateFormat.format(honourenddate);	}	public void setCreatetimestr(String createtimestr){		this.createtimestr=createtimestr;	}	public String getCreatetimestr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");		 return createtime == null ? createtimestr : simpleDateFormat.format(createtime);	}	public void setSptimestr(String sptimeStr){		this.sptimestr=sptimestr;	}	public String getSptimestr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");		 return sptime == null ? sptimestr : simpleDateFormat.format(sptime);	}	public Integer getContractid() {		return contractid;	}	public void setContractid(Integer contractid) {		this.contractid = contractid;	}	public Integer getBuysellflag() {		return buysellflag;	}	public void setBuysellflag(Integer buysellflag) {		this.buysellflag = buysellflag;	}	public Integer getConttypeid() {		return conttypeid;	}	public void setConttypeid(Integer conttypeid) {		this.conttypeid = conttypeid;	}	public String getContractno() {		return contractno;	}	public void setContractno(String contractno) {		this.contractno = contractno;	}	public Integer getGroupid() {		return groupid;	}	public void setGroupid(Integer groupid) {		this.groupid = groupid;	}	public Integer getCompanyid() {		return companyid;	}	public void setCompanyid(Integer companyid) {		this.companyid = companyid;	}	public Integer getGraindepotid() {		return graindepotid;	}	public void setGraindepotid(Integer graindepotid) {		this.graindepotid = graindepotid;	}	public Integer getStorageid() {		return storageid;	}	public void setStorageid(Integer storageid) {		this.storageid = storageid;	}	public Integer getGrainid() {		return grainid;	}	public void setGrainid(Integer grainid) {		this.grainid = grainid;	}	public Integer getGrainattrid() {		return grainattrid;	}	public void setGrainattrid(Integer grainattrid) {		this.grainattrid = grainattrid;	}	public Integer getProducingyear() {		return producingyear;	}	public void setProducingyear(Integer producingyear) {		this.producingyear = producingyear;	}	public Integer getGrade() {		return grade;	}	public void setGrade(Integer grade) {		this.grade = grade;	}	public Integer getTraderid() {		return traderid;	}	public void setTraderid(Integer traderid) {		this.traderid = traderid;	}	public String getTradartiperson() {		return tradartiperson;	}	public void setTradartiperson(String tradartiperson) {		this.tradartiperson = tradartiperson;	}	public String getCorpartiperson() {		return corpartiperson;	}	public void setCorpartiperson(String corpartiperson) {		this.corpartiperson = corpartiperson;	}	public Double getTqty() {		return tqty;	}	public void setTqty(Double tqty) {		this.tqty = tqty;	}	public Double getKgqty() {		return kgqty;	}	public void setKgqty(Double kgqty) {		this.kgqty = kgqty;	}	public Double getTprice() {		return tprice;	}	public void setTprice(Double tprice) {		this.tprice = tprice;	}	public Double getKgprice() {		return kgprice;	}	public void setKgprice(Double kgprice) {		this.kgprice = kgprice;	}	public Double getAmount() {		return amount;	}	public void setAmount(Double amount) {		this.amount = amount;	}	public Double getExecqty() {		return execqty;	}	public void setExecqty(Double execqty) {		this.execqty = execqty;	}	public Double getExectqty() {		return exectqty;	}	public void setExectqty(Double exectqty) {		this.exectqty = exectqty;	}	public Double getBailpert() {		return bailpert;	}	public void setBailpert(Double bailpert) {		this.bailpert = bailpert;	}	public Double getBailrate() {		return bailrate;	}	public void setBailrate(Double bailrate) {		this.bailrate = bailrate;	}	public Double getBailamt() {		return bailamt;	}	public void setBailamt(Double bailamt) {		this.bailamt = bailamt;	}	public String getGqrequire() {		return gqrequire;	}	public void setGqrequire(String gqrequire) {		this.gqrequire = gqrequire;	}	public String getPartyaagent() {		return partyaagent;	}	public void setPartyaagent(String partyaagent) {		this.partyaagent = partyaagent;	}	public String getPartybagent() {		return partybagent;	}	public void setPartybagent(String partybagent) {		this.partybagent = partybagent;	}	public String getPartyabanknum() {		return partyabanknum;	}	public void setPartyabanknum(String partyabanknum) {		this.partyabanknum = partyabanknum;	}	public String getPartybbanknum() {		return partybbanknum;	}	public void setPartybbanknum(String partybbanknum) {		this.partybbanknum = partybbanknum;	}	public String getFilenamelist() {		return filenamelist;	}	public void setFilenamelist(String filenamelist) {		this.filenamelist = filenamelist;	}	public String getBidno() {		return bidno;	}	public void setBidno(String bidno) {		this.bidno = bidno;	}	public Double getHandlingpert() {		return handlingpert;	}	public void setHandlingpert(Double handlingpert) {		this.handlingpert = handlingpert;	}	public Double getHandlingamt() {		return handlingamt;	}	public void setHandlingamt(Double handlingamt) {		this.handlingamt = handlingamt;	}	public Date getSigndate() {		return signdate;	}	public void setSigndate(Date signdate) {		this.signdate = signdate;	}	public Date getExecdate() {		return execdate;	}	public void setExecdate(Date execdate) {		this.execdate = execdate;	}	public Integer getCompleted() {		return completed;	}	public void setCompleted(Integer completed) {		this.completed = completed;	}	public String getSignaddress() {		return signaddress;	}	public void setSignaddress(String signaddress) {		this.signaddress = signaddress;	}	public String getHonouraddress() {		return honouraddress;	}	public void setHonouraddress(String honouraddress) {		this.honouraddress = honouraddress;	}	public Integer getHonourstate() {		return honourstate;	}	public void setHonourstate(Integer honourstate) {		this.honourstate = honourstate;	}	public Date getHonourbegindate() {		return honourbegindate;	}	public void setHonourbegindate(Date honourbegindate) {		this.honourbegindate = honourbegindate;	}	public Date getHonourenddate() {		return honourenddate;	}	public void setHonourenddate(Date honourenddate) {		this.honourenddate = honourenddate;	}	public Integer getStopflag() {		return stopflag;	}	public void setStopflag(Integer stopflag) {		this.stopflag = stopflag;	}	public Integer getStopfile() {		return stopfile;	}	public void setStopfile(Integer stopfile) {		this.stopfile = stopfile;	}	public Integer getCreateuserid() {		return createuserid;	}	public void setCreateuserid(Integer createuserid) {		this.createuserid = createuserid;	}	public Date getCreatetime() {		return createtime;	}	public void setCreatetime(Date createtime) {		this.createtime = createtime;	}	public Integer getSpuserid() {		return spuserid;	}	public void setSpuserid(Integer spuserid) {		this.spuserid = spuserid;	}	public Date getSptime() {		return sptime;	}	public void setSptime(Date sptime) {		this.sptime = sptime;	}	public Integer getSpstatus() {		return spstatus;	}	public void setSpstatus(Integer spstatus) {		this.spstatus = spstatus;	}	public String getSpremark() {		return spremark;	}	public void setSpremark(String spremark) {		this.spremark = spremark;	}	public void setConttypename(String conttypename) {		this.conttypename = conttypename;	}}