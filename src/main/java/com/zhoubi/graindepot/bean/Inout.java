package com.zhoubi.graindepot.bean;import java.io.Serializable;import java.util.Date;import java.text.SimpleDateFormat;public class Inout implements Serializable {	private Integer billid;//主键	private Integer groupid;//集团ID	private String groupname;//集团	private Integer companyid;//企业ID	private String companyname;//企业	private Integer graindepotid;//粮库ID	private String graindepotname;//粮库	private Integer storageid;//仓房ID	private String storagename;//仓房ID	private Date billdate;//单据日期	private String billcode;//单据号	private Integer billtype;//单据类型(0：期初库存单 1：正常业务单据 2：补单)	private Short billstate;//单据状态（0：编辑，1：已审核，-1：已作废）	private Short delflag;//逻辑删除标志(1:逻辑删除)	private Short inoutflag;//出入库标志（1：入库，-1：出库）	private Integer planfileid;//计划文件主键	private Integer inplanid;//入库计划安排主键	private Integer outplanid;//出库计划安排主键	private Integer contractid;//合同主键	private Short inresontype;//入库原由（1：轮入 2：其他收入）	private Short outresontype;//出库原由	private Short customtype;//客户性质（1：个人 2：单位）	private Integer traderid;//往来单位主键	private String sellmanname;//售粮人	private String sellmanwechat;//售粮人微信号	private String sellmanalipay;//售粮人支付宝账号	private String sellmanidcard;//售粮人身份证	private String sellmanaddress;//联系地址	private Short sellmansex;//性别：1：男 2：女 3：未指定	private String sellmanphone;//售粮人联系电话	private String iccardnum;//IC卡号	private String carriercorp;//承运单位	private String carriername;//承运人	private String carrierwechat;//承运人微信号	private String carrieralipay;//承运人支付宝账号	private String carrieridcard;//承运人身份证	private Short carriersex;//承运人性别	private String carrierphone;//承运人联系电话	private Short trucktype;//运输类型：1：车辆 2：船舶 3：火车 99：其他	private String trucknum;//车船号	private Integer grainid;//粮食品种	private Integer grainattrid;//粮食性质	private Integer producingyear;//收获年度	private Short grade;//粮食等级（1：一等 2：二等 3：三等 4：四等 5：五等 6：等外 99：未定等）	private Double grossweight;//毛重	private Double tareweight;//皮重	private Double netweight;//净重=毛重-皮重	private Double totalincdedu;//合计扣量（正数：扣量 ，负数：增量）	private Double extradedu;//增加扣量	private Double paidweight;//结算重量=毛重-皮重-合计扣量-增加扣量	private Double price;//单价（元/公斤）	private Double amount;//结算金额=结算重量*单价	private Double paidqty;//已结算重量	private Double paidamount;//已结算金额	private Short packtype;//包装方式（1：散装，2：包装）	private Integer packcount;//总包数	private Double selfreport;//自报数量（KG）	private String voucno;//联单号	private Integer printcount;//打印次数	private Integer printtempid;//打印模板主键	private Short billstage;//单据当前阶段（1：登记 2：扦样 3：检验 4：称毛重 5：值仓 6：称皮重 7：结算 99：其他）	private Integer regopid;//登记人员	private Date regtime;//登记时间	private Short regstate;//绑卡状态(RegState=1：绑卡状态，0：未绑卡 ，-1：已退港)	private Integer samplingoptid;//扦样人	private Date samplingtime;//扦样时间	private Short samplingstate;//扦样状态（1：已扦样 0：未扦样）	private Integer inspectoptid;//检验人员	private Date inspecttime;//检验时间	private Short inspectstate;//检验状态（1：已检验 0：未检验）	private Integer gwopid;//称毛重操作员	private Date gwtime;//称毛重时间	private Short gwstate;//称毛重状态（1：已称毛重 0：未称毛重）	private Integer valuebinoptid;//值仓操作人	private Date valuebinstarttime;//值仓开始时间	private Date valuebinendtime;//值仓结束时间	private Short valuebinstate;//值仓状态（1：值仓完成 0：未值仓 2：值仓中）	private Integer tareoptid;//称皮重操作员	private Date taretime;//称皮重时间	private Short tarestate;//称皮重状态（1：已称皮重 0：未称皮重）	private Integer paidoptid;//结算操作员	private Date paidtime;//结算时间	private Date paiddate;//结算日期	private Short paidstate;//结算状态（1：已结算 2：结算部分 0：未结算）	private Short traderflag;//往来结算状态（1：已结算 0：未结算）	private Short settlemothod;//结算方式(:1：现金结算，2：银行卡结算，3：微信结算，4：支付宝结算)	private String bankcardnum;//银行卡号	private Short backicflag;//退卡标识(1：已退卡 0：未退卡)	private String backreason;//退卡原由	private Date backictime;//退卡时间	private Short stopflag;//中止标识（1：已中止）	private String stopreason;//中止原由	private Short onetomany;//一单多车标识（1：一单多车）	private String soucearea;//原产地	private String remark;//备注	private Integer createuserid;//创建人	private Date createtime;//创建时间	private Date updatetime;//最近更新时间	private Integer fprovinceid;//调入省份	private Integer fcityid;//调入市（州）	private String name;//用于联想查询字段    private String grainname;    private String grainattrname;    public String getName() {		return name;	}	public void setName(String name) {		this.name = name;	}	public Integer getFprovinceid() {		return fprovinceid;	}	public void setFprovinceid(Integer fprovinceid) {		this.fprovinceid = fprovinceid;	}	public Integer getFcityid() {		return fcityid;	}	public void setFcityid(Integer fcityid) {		this.fcityid = fcityid;	}	public Integer getBillid(){		return billid;	}	public void setBillid(Integer billid){		this.billid=billid;	}	public Integer getGroupid(){		return groupid;	}	public void setGroupid(Integer groupid){		this.groupid=groupid;	}	public Integer getCompanyid(){		return companyid;	}	public void setCompanyid(Integer companyid){		this.companyid=companyid;	}	public Integer getGraindepotid(){		return graindepotid;	}	public void setGraindepotid(Integer graindepotid){		this.graindepotid=graindepotid;	}	public Integer getStorageid(){		return storageid;	}	public void setStorageid(Integer storageid){		this.storageid=storageid;	}	private String billdateStr;	public void setBilldateStr(String billdateStr){		this.billdateStr=billdateStr;	}	public String getBilldateStr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		 return billdate == null ? billdateStr : simpleDateFormat.format(billdate); 	}	public Date getBilldate(){		return billdate;	}	public void setBilldate(Date billdate){		this.billdate=billdate;	}	public String getBillcode(){		return billcode;	}	public void setBillcode(String billcode){		this.billcode=billcode;	}	public Integer getBilltype(){		return billtype;	}	public void setBilltype(Integer billtype){		this.billtype=billtype;	}	public Short getBillstate(){		return billstate;	}	public void setBillstate(Short billstate){		this.billstate=billstate;	}	public Short getDelflag(){		return delflag;	}	public void setDelflag(Short delflag){		this.delflag=delflag;	}	public Short getInoutflag(){		return inoutflag;	}	public void setInoutflag(Short inoutflag){		this.inoutflag=inoutflag;	}	public Integer getPlanfileid(){		return planfileid;	}	public void setPlanfileid(Integer planfileid){		this.planfileid=planfileid;	}	public Integer getInplanid(){		return inplanid;	}	public void setInplanid(Integer inplanid){		this.inplanid=inplanid;	}	public Integer getOutplanid(){		return outplanid;	}	public void setOutplanid(Integer outplanid){		this.outplanid=outplanid;	}	public Integer getContractid(){		return contractid;	}	public void setContractid(Integer contractid){		this.contractid=contractid;	}	public Short getInresontype(){		return inresontype;	}	public void setInresontype(Short inresontype){		this.inresontype=inresontype;	}	public Short getOutresontype(){		return outresontype;	}	public void setOutresontype(Short outresontype){		this.outresontype=outresontype;	}	public Short getCustomtype(){		return customtype;	}	public void setCustomtype(Short customtype){		this.customtype=customtype;	}	public Integer getTraderid(){		return traderid;	}	public void setTraderid(Integer traderid){		this.traderid=traderid;	}	public String getSellmanname(){		return sellmanname;	}	public void setSellmanname(String sellmanname){		this.sellmanname=sellmanname;	}	public String getSellmanwechat(){		return sellmanwechat;	}	public void setSellmanwechat(String sellmanwechat){		this.sellmanwechat=sellmanwechat;	}	public String getSellmanalipay(){		return sellmanalipay;	}	public void setSellmanalipay(String sellmanalipay){		this.sellmanalipay=sellmanalipay;	}	public String getSellmanidcard(){		return sellmanidcard;	}	public void setSellmanidcard(String sellmanidcard){		this.sellmanidcard=sellmanidcard;	}	public String getSellmanaddress(){		return sellmanaddress;	}	public void setSellmanaddress(String sellmanaddress){		this.sellmanaddress=sellmanaddress;	}	public Short getSellmansex(){		return sellmansex;	}	public void setSellmansex(Short sellmansex){		this.sellmansex=sellmansex;	}	public String getSellmanphone(){		return sellmanphone;	}	public void setSellmanphone(String sellmanphone){		this.sellmanphone=sellmanphone;	}	public String getIccardnum(){		return iccardnum;	}	public void setIccardnum(String iccardnum){		this.iccardnum=iccardnum;	}	public String getCarriercorp(){		return carriercorp;	}	public void setCarriercorp(String carriercorp){		this.carriercorp=carriercorp;	}	public String getCarriername(){		return carriername;	}	public void setCarriername(String carriername){		this.carriername=carriername;	}	public String getCarrierwechat(){		return carrierwechat;	}	public void setCarrierwechat(String carrierwechat){		this.carrierwechat=carrierwechat;	}	public String getCarrieralipay(){		return carrieralipay;	}	public void setCarrieralipay(String carrieralipay){		this.carrieralipay=carrieralipay;	}	public String getCarrieridcard(){		return carrieridcard;	}	public void setCarrieridcard(String carrieridcard){		this.carrieridcard=carrieridcard;	}	public Short getCarriersex(){		return carriersex;	}	public void setCarriersex(Short carriersex){		this.carriersex=carriersex;	}	public String getCarrierphone(){		return carrierphone;	}	public void setCarrierphone(String carrierphone){		this.carrierphone=carrierphone;	}	public Short getTrucktype(){		return trucktype;	}	public void setTrucktype(Short trucktype){		this.trucktype=trucktype;	}	public String getTrucknum(){		return trucknum;	}	public void setTrucknum(String trucknum){		this.trucknum=trucknum;	}	public Integer getGrainid(){		return grainid;	}	public void setGrainid(Integer grainid){		this.grainid=grainid;	}	public Integer getGrainattrid(){		return grainattrid;	}	public void setGrainattrid(Integer grainattrid){		this.grainattrid=grainattrid;	}	public Integer getProducingyear(){		return producingyear;	}	public void setProducingyear(Integer producingyear){		this.producingyear=producingyear;	}	public Short getGrade(){		return grade;	}	public void setGrade(Short grade){		this.grade=grade;	}	public Double getGrossweight(){		return grossweight;	}	public void setGrossweight(Double grossweight){		this.grossweight=grossweight;	}	public Double getTareweight(){		return tareweight;	}	public void setTareweight(Double tareweight){		this.tareweight=tareweight;	}	public Double getNetweight(){		return netweight;	}	public void setNetweight(Double netweight){		this.netweight=netweight;	}	public Double getTotalincdedu(){		return totalincdedu;	}	public void setTotalincdedu(Double totalincdedu){		this.totalincdedu=totalincdedu;	}	public Double getExtradedu(){		return extradedu;	}	public void setExtradedu(Double extradedu){		this.extradedu=extradedu;	}	public Double getPaidweight(){		return paidweight;	}	public void setPaidweight(Double paidweight){		this.paidweight=paidweight;	}	public Double getPrice(){		return price;	}	public void setPrice(Double price){		this.price=price;	}	public Double getAmount(){		return amount;	}	public void setAmount(Double amount){		this.amount=amount;	}	public Double getPaidqty(){		return paidqty;	}	public void setPaidqty(Double paidqty){		this.paidqty=paidqty;	}	public Double getPaidamount(){		return paidamount;	}	public void setPaidamount(Double paidamount){		this.paidamount=paidamount;	}	public Short getPacktype(){		return packtype;	}	public void setPacktype(Short packtype){		this.packtype=packtype;	}	public Integer getPackcount(){		return packcount;	}	public void setPackcount(Integer packcount){		this.packcount=packcount;	}	public Double getSelfreport(){		return selfreport;	}	public void setSelfreport(Double selfreport){		this.selfreport=selfreport;	}	public String getVoucno(){		return voucno;	}	public void setVoucno(String voucno){		this.voucno=voucno;	}	public Integer getPrintcount(){		return printcount;	}	public void setPrintcount(Integer printcount){		this.printcount=printcount;	}	public Integer getPrinttempid(){		return printtempid;	}	public void setPrinttempid(Integer printtempid){		this.printtempid=printtempid;	}	public Short getBillstage(){		return billstage;	}	public void setBillstage(Short billstage){		this.billstage=billstage;	}	public Integer getRegopid(){		return regopid;	}	public void setRegopid(Integer regopid){		this.regopid=regopid;	}private String regtimeStr;	public void setRegtimeStr(String regtimeStr){		this.regtimeStr=regtimeStr;	}	public String getRegtimeStr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		 return regtime == null ? regtimeStr : simpleDateFormat.format(regtime); 	}	public Date getRegtime(){		return regtime;	}	public void setRegtime(Date regtime){		this.regtime=regtime;	}	public Short getRegstate(){		return regstate;	}	public void setRegstate(Short regstate){		this.regstate=regstate;	}	public Integer getSamplingoptid(){		return samplingoptid;	}	public void setSamplingoptid(Integer samplingoptid){		this.samplingoptid=samplingoptid;	}private String samplingtimeStr;	public void setSamplingtimeStr(String samplingtimeStr){		this.samplingtimeStr=samplingtimeStr;	}	public String getSamplingtimeStr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		 return samplingtime == null ? samplingtimeStr : simpleDateFormat.format(samplingtime); 	}	public Date getSamplingtime(){		return samplingtime;	}	public void setSamplingtime(Date samplingtime){		this.samplingtime=samplingtime;	}	public Short getSamplingstate(){		return samplingstate;	}	public void setSamplingstate(Short samplingstate){		this.samplingstate=samplingstate;	}	public Integer getInspectoptid(){		return inspectoptid;	}	public void setInspectoptid(Integer inspectoptid){		this.inspectoptid=inspectoptid;	}private String inspecttimeStr;	public void setInspecttimeStr(String inspecttimeStr){		this.inspecttimeStr=inspecttimeStr;	}	public String getInspecttimeStr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		 return inspecttime == null ? inspecttimeStr : simpleDateFormat.format(inspecttime); 	}	public Date getInspecttime(){		return inspecttime;	}	public void setInspecttime(Date inspecttime){		this.inspecttime=inspecttime;	}	public Short getInspectstate(){		return inspectstate;	}	public void setInspectstate(Short inspectstate){		this.inspectstate=inspectstate;	}	public Integer getGwopid(){		return gwopid;	}	public void setGwopid(Integer gwopid){		this.gwopid=gwopid;	}private String gwtimeStr;	public void setGwtimeStr(String gwtimeStr){		this.gwtimeStr=gwtimeStr;	}	public String getGwtimeStr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		 return gwtime == null ? gwtimeStr : simpleDateFormat.format(gwtime); 	}	public Date getGwtime(){		return gwtime;	}	public void setGwtime(Date gwtime){		this.gwtime=gwtime;	}	public Short getGwstate(){		return gwstate;	}	public void setGwstate(Short gwstate){		this.gwstate=gwstate;	}	public Integer getValuebinoptid(){		return valuebinoptid;	}	public void setValuebinoptid(Integer valuebinoptid){		this.valuebinoptid=valuebinoptid;	}private String valuebinstarttimeStr;	public void setValuebinstarttimeStr(String valuebinstarttimeStr){		this.valuebinstarttimeStr=valuebinstarttimeStr;	}	public String getValuebinstarttimeStr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		 return valuebinstarttime == null ? valuebinstarttimeStr : simpleDateFormat.format(valuebinstarttime); 	}	public Date getValuebinstarttime(){		return valuebinstarttime;	}	public void setValuebinstarttime(Date valuebinstarttime){		this.valuebinstarttime=valuebinstarttime;	}private String valuebinendtimeStr;	public void setValuebinendtimeStr(String valuebinendtimeStr){		this.valuebinendtimeStr=valuebinendtimeStr;	}	public String getValuebinendtimeStr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		 return valuebinendtime == null ? valuebinendtimeStr : simpleDateFormat.format(valuebinendtime); 	}	public Date getValuebinendtime(){		return valuebinendtime;	}	public void setValuebinendtime(Date valuebinendtime){		this.valuebinendtime=valuebinendtime;	}	public Short getValuebinstate(){		return valuebinstate;	}	public void setValuebinstate(Short valuebinstate){		this.valuebinstate=valuebinstate;	}	public Integer getTareoptid(){		return tareoptid;	}	public void setTareoptid(Integer tareoptid){		this.tareoptid=tareoptid;	}private String taretimeStr;	public void setTaretimeStr(String taretimeStr){		this.taretimeStr=taretimeStr;	}	public String getTaretimeStr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		 return taretime == null ? taretimeStr : simpleDateFormat.format(taretime); 	}	public Date getTaretime(){		return taretime;	}	public void setTaretime(Date taretime){		this.taretime=taretime;	}	public Short getTarestate(){		return tarestate;	}	public void setTarestate(Short tarestate){		this.tarestate=tarestate;	}	public Integer getPaidoptid(){		return paidoptid;	}	public void setPaidoptid(Integer paidoptid){		this.paidoptid=paidoptid;	}private String paidtimeStr;	public void setPaidtimeStr(String paidtimeStr){		this.paidtimeStr=paidtimeStr;	}	public String getPaidtimeStr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		 return paidtime == null ? paidtimeStr : simpleDateFormat.format(paidtime); 	}	public Date getPaidtime(){		return paidtime;	}	public void setPaidtime(Date paidtime){		this.paidtime=paidtime;	}private String paiddateStr;	public void setPaiddateStr(String paiddateStr){		this.paiddateStr=paiddateStr;	}	public String getPaiddateStr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		 return paiddate == null ? paiddateStr : simpleDateFormat.format(paiddate); 	}	public Date getPaiddate(){		return paiddate;	}	public void setPaiddate(Date paiddate){		this.paiddate=paiddate;	}	public Short getPaidstate(){		return paidstate;	}	public void setPaidstate(Short paidstate){		this.paidstate=paidstate;	}	public Short getTraderflag(){		return traderflag;	}	public void setTraderflag(Short traderflag){		this.traderflag=traderflag;	}	public Short getSettlemothod(){		return settlemothod;	}	public void setSettlemothod(Short settlemothod){		this.settlemothod=settlemothod;	}	public String getBankcardnum(){		return bankcardnum;	}	public void setBankcardnum(String bankcardnum){		this.bankcardnum=bankcardnum;	}	public Short getBackicflag(){		return backicflag;	}	public void setBackicflag(Short backicflag){		this.backicflag=backicflag;	}	public String getBackreason(){		return backreason;	}	public void setBackreason(String backreason){		this.backreason=backreason;	}private String backictimeStr;	public void setBackictimeStr(String backictimeStr){		this.backictimeStr=backictimeStr;	}	public String getBackictimeStr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		 return backictime == null ? backictimeStr : simpleDateFormat.format(backictime); 	}	public Date getBackictime(){		return backictime;	}	public void setBackictime(Date backictime){		this.backictime=backictime;	}	public Short getStopflag(){		return stopflag;	}	public void setStopflag(Short stopflag){		this.stopflag=stopflag;	}	public String getStopreason(){		return stopreason;	}	public void setStopreason(String stopreason){		this.stopreason=stopreason;	}	public Short getOnetomany(){		return onetomany;	}	public void setOnetomany(Short onetomany){		this.onetomany=onetomany;	}	public String getSoucearea(){		return soucearea;	}	public void setSoucearea(String soucearea){		this.soucearea=soucearea;	}	public String getRemark(){		return remark;	}	public void setRemark(String remark){		this.remark=remark;	}	public Integer getCreateuserid(){		return createuserid;	}	public void setCreateuserid(Integer createuserid){		this.createuserid=createuserid;	}private String createtimeStr;	public void setCreatetimeStr(String createtimeStr){		this.createtimeStr=createtimeStr;	}	public String getCreatetimeStr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		 return createtime == null ? createtimeStr : simpleDateFormat.format(createtime); 	}	public Date getCreatetime(){		return createtime;	}	public void setCreatetime(Date createtime){		this.createtime=createtime;	}private String updatetimeStr;	public void setUpdatetimeStr(String updatetimeStr){		this.updatetimeStr=updatetimeStr;	}	public String getUpdatetimeStr(){		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		 return updatetime == null ? updatetimeStr : simpleDateFormat.format(updatetime); 	}	public Date getUpdatetime(){		return updatetime;	}	public void setUpdatetime(Date updatetime){		this.updatetime=updatetime;	}	public String getGroupname() {		return groupname;	}	public void setGroupname(String groupname) {		this.groupname = groupname;	}	public String getCompanyname() {		return companyname;	}	public void setCompanyname(String companyname) {		this.companyname = companyname;	}	public String getGraindepotname() {		return graindepotname;	}	public void setGraindepotname(String graindepotname) {		this.graindepotname = graindepotname;	}	public String getStoragename() {		return storagename;	}	public void setStoragename(String storagename) {		this.storagename = storagename;	}	public String getGrainname() {		return grainname;	}	public void setGrainname(String grainname) {		this.grainname = grainname;	}	public String getGrainattrname() {		return grainattrname;	}	public void setGrainattrname(String grainattrname) {		this.grainattrname = grainattrname;	}}