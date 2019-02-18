package com.zhoubi.graindepot.bean;import java.io.Serializable;import java.util.Date;import java.text.SimpleDateFormat;public class PlanfileOutplan implements Serializable {    private Integer outplanid;//出库计划安排主键    private String planname;//计划安排名称    private Integer planfileid;//计划文件主键    private Integer plandetailid;//计划详细信息主键    private Integer groupid;//集团ID    private Integer companyid;//企业ID    private Integer graindepotid;//粮库ID    private Integer producingyear;//收获年度    private Short grade;//等级要求（1：一等 2：二等 3：三等 4：四等 5：五等 6：等外 99：未定等）    private Double tqty;//吨数量    private Double tprice;//吨单价    private Double kgqty;//千克数量(计)    private Double kgprice;//千克单价(计)    private Double amount;//金额    private Date planbegindate;//计划开始日期    private Date planenddate;//计划结束日期    private Double execkgqty;//已执行千克数量    private Double exectqty;//已执行吨数量(计)    private Integer createuserid;//创建人主键    private Date createtime;//createtime    private Short spstatus;//审批状态（0：待审批 1：审批通过 -1：审批不通过）    private Integer spuserid;//审批人主键    private Date sptime;//审批时间    private String spremark;//审批意见    private Integer plantypeid;    private String plantypestr;//计划类型    private String planno;    private String grainname;    private String gradestr;//粮食等级    private String spstatusstr;//审核状态str    public String getSpstatusstr() {        if (spstatus != null) {            return Constant.Approval.getText(spstatus);        }        return spstatusstr;    }    public void setSpstatusstr(String spstatusstr) {        this.spstatusstr = spstatusstr;    }    public String getGradestr() {        if (grade != 0) {            return Constant.GrainGrade.getText(grade);        }        return gradestr;    }    public void setGradestr(String gradestr) {        this.gradestr = gradestr;    }    public Integer getPlantypeid() {        return plantypeid;    }    public void setPlantypeid(Integer plantypeid) {        this.plantypeid = plantypeid;    }    public String getPlantypestr() {        if (plantypeid != null && plantypeid == 1) {            return "轮换计划";        } else if (plantypeid != null && plantypeid == 2) {            return "轮出计划";        } else if (plantypeid != null && plantypeid == 3) {            return "轮入计划";        }        return plantypestr;    }    public void setPlantypestr(String plantypestr) {        this.plantypestr = plantypestr;    }    public String getPlanno() {        return planno;    }    public void setPlanno(String planno) {        this.planno = planno;    }    public String getGrainname() {        return grainname;    }    public void setGrainname(String grainname) {        this.grainname = grainname;    }    public Integer getOutplanid(){        return outplanid;    }    public void setOutplanid(Integer outplanid){        this.outplanid=outplanid;    }    public String getPlanname(){        return planname;    }    public void setPlanname(String planname){        this.planname=planname;    }    public Integer getPlanfileid(){        return planfileid;    }    public void setPlanfileid(Integer planfileid){        this.planfileid=planfileid;    }    public Integer getPlandetailid(){        return plandetailid;    }    public void setPlandetailid(Integer plandetailid){        this.plandetailid=plandetailid;    }    public Integer getGroupid(){        return groupid;    }    public void setGroupid(Integer groupid){        this.groupid=groupid;    }    public Integer getCompanyid(){        return companyid;    }    public void setCompanyid(Integer companyid){        this.companyid=companyid;    }    public Integer getGraindepotid(){        return graindepotid;    }    public void setGraindepotid(Integer graindepotid){        this.graindepotid=graindepotid;    }    public Integer getProducingyear(){        return producingyear;    }    public void setProducingyear(Integer producingyear){        this.producingyear=producingyear;    }    public Short getGrade(){        return grade;    }    public void setGrade(Short grade){        this.grade=grade;    }    public Double getTqty(){        return tqty;    }    public void setTqty(Double tqty){        this.tqty=tqty;    }    public Double getTprice(){        return tprice;    }    public void setTprice(Double tprice){        this.tprice=tprice;    }    public Double getKgqty(){        return kgqty;    }    public void setKgqty(Double kgqty){        this.kgqty=kgqty;    }    public Double getKgprice(){        return kgprice;    }    public void setKgprice(Double kgprice){        this.kgprice=kgprice;    }    public Double getAmount(){        return amount;    }    public void setAmount(Double amount){        this.amount=amount;    }    private String planbegindatestr;    public void setPlanbegindatestr(String planbegindateStr){        this.planbegindatestr=planbegindateStr;    }    public String getPlanbegindatestr(){        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");        return planbegindate == null ? planbegindatestr : simpleDateFormat.format(planbegindate);    }    public Date getPlanbegindate(){        return planbegindate;    }    public void setPlanbegindate(Date planbegindate){        this.planbegindate=planbegindate;    }    private String planenddatestr;    public void setPlanenddatestr(String planenddateStr){        this.planenddatestr=planenddatestr;    }    public String getPlanenddatestr(){        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");        return planenddate == null ? planenddatestr : simpleDateFormat.format(planenddate);    }    public Date getPlanenddate(){        return planenddate;    }    public void setPlanenddate(Date planenddate){        this.planenddate=planenddate;    }    public Double getExeckgqty(){        return execkgqty;    }    public void setExeckgqty(Double execkgqty){        this.execkgqty=execkgqty;    }    public Double getExectqty(){        return exectqty;    }    public void setExectqty(Double exectqty){        this.exectqty=exectqty;    }    public Integer getCreateuserid(){        return createuserid;    }    public void setCreateuserid(Integer createuserid){        this.createuserid=createuserid;    }    private String createtimestr;    public void setCreatetimestr(String createtimestr){        this.createtimestr=createtimestr;    }    public String getCreatetimestr(){        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");        return createtime == null ? createtimestr : simpleDateFormat.format(createtime);    }    public Date getCreatetime(){        return createtime;    }    public void setCreatetime(Date createtime){        this.createtime=createtime;    }    public Short getSpstatus(){        return spstatus;    }    public void setSpstatus(Short spstatus){        this.spstatus=spstatus;    }    public Integer getSpuserid(){        return spuserid;    }    public void setSpuserid(Integer spuserid){        this.spuserid=spuserid;    }    private String sptimestr;    public void setSptimestr(String sptimeStr){        this.sptimestr=sptimeStr;    }    public String getSptimestr(){        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");        return sptime == null ? sptimestr : simpleDateFormat.format(sptime);    }    public Date getSptime(){        return sptime;    }    public void setSptime(Date sptime){        this.sptime=sptime;    }    public String getSpremark(){        return spremark;    }    public void setSpremark(String spremark){        this.spremark=spremark;    }}