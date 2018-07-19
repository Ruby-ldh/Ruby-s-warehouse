package hst.model.equipment;

import java.sql.Timestamp;
import java.util.Date;

public class EquipmentBean {
	private String xmName;//项目名
	private String ordId;//项目id
	private String orderName;//设备id
	private String machineCode;//机器码
	private String code;//试用码
	private String local;//使用地点
	private String type;//类型
	private int authorization;//是否授权
	private String system;//系统
	private String address;//地址
	private String version;//版本
	private Date expirationTime;//到期时间
	private int state;//正式版本
	private int id;//id
	
	private String applicantUserId;//申请人id
	private String applicantUserName;//申请人名
	private String auditorUserId;//审核人id
	private String auditorUserName;//审核人名
	private Date auditorTime;//审核时间
	private String reason;//申请理由
	private int probationLength;//时长
	private String remark;//备注
	private Date applicantTime;//申请时间
	private String addPersonId;//设备添加人id
	private String addPersonName;//设备添加人名
	private Timestamp addTime;//设备添加时间
	private int mailState;//邮件状态
	
	
	public int getMailState() {
		return mailState;
	}
	public void setMailState(int mailState) {
		this.mailState = mailState;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getAddPersonId() {
		return addPersonId;
	}
	public void setAddPersonId(String addPersonId) {
		this.addPersonId = addPersonId;
	}
	public String getAddPersonName() {
		return addPersonName;
	}
	public void setAddPersonName(String addPersonName) {
		this.addPersonName = addPersonName;
	}
	public Timestamp getAddTime() {
		return addTime;
	}
	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}
	public String getApplicantUserId() {
		return applicantUserId;
	}
	public void setApplicantUserId(String applicantUserId) {
		this.applicantUserId = applicantUserId;
	}
	public String getApplicantUserName() {
		return applicantUserName;
	}
	public void setApplicantUserName(String applicantUserName) {
		this.applicantUserName = applicantUserName;
	}
	public String getAuditorUserId() {
		return auditorUserId;
	}
	public void setAuditorUserId(String auditorUserId) {
		this.auditorUserId = auditorUserId;
	}
	public String getAuditorUserName() {
		return auditorUserName;
	}
	public void setAuditorUserName(String auditorUserName) {
		this.auditorUserName = auditorUserName;
	}
	public Date getAuditorTime() {
		return auditorTime;
	}
	public void setAuditorTime(Date auditorTime) {
		this.auditorTime = auditorTime;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getProbationLength() {
		return probationLength;
	}
	public void setProbationLength(int probationLength) {
		this.probationLength = probationLength;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getApplicantTime() {
		return applicantTime;
	}
	public void setApplicantTime(Date applicantTime) {
		this.applicantTime = applicantTime;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getXmName() {
		return xmName;
	}
	public void setXmName(String xmName) {
		this.xmName = xmName;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAuthorization() {
		return authorization;
	}
	public void setAuthorization(int authorization) {
		this.authorization = authorization;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public Date getExpirationTime() {
		return expirationTime;
	}
	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getMachineCode() {
		return machineCode;
	}
	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}
	public String getOrdId() {
		return ordId;
	}
	public void setOrdId(String ordId) {
		this.ordId = ordId;
	}
	public String getorderName() {
		return orderName;
	}
	public void setorderName(String orderName) {
		this.orderName = orderName;
	}
	@Override
	public String toString() {
		return "EquipmentBean [xmName=" + xmName + ", ordId=" + ordId + ", orderName=" + orderName + ", machineCode="
				+ machineCode + ", code=" + code + ", local=" + local + ", type=" + type + ", authorization="
				+ authorization + ", system=" + system + ", address=" + address + ", version=" + version
				+ ", expirationTime=" + expirationTime + ", state=" + state + ", id=" + id + ", applicantUserId="
				+ applicantUserId + ", applicantUserName=" + applicantUserName + ", auditorUserId=" + auditorUserId
				+ ", auditorUserName=" + auditorUserName + ", auditorTime=" + auditorTime + ", reason=" + reason
				+ ", probationLength=" + probationLength + ", remark=" + remark + ", applicantTime=" + applicantTime
				+ "]";
	}
	
	
	
}
