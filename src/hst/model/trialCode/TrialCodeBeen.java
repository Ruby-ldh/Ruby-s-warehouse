package hst.model.trialCode;

import java.util.Date;

public class TrialCodeBeen {
	private int id;//���1
	private String ordId;//��Ŀ���1
	private String ordName;//��Ŀ����1
	private String orderId;//�豸���1
	private String code;//������1
	private String machineCode;//������1
	private String applicantUserId;//������id1
	private String applicantUserName;//����������1
	private String auditorUserId;//�����id1
	private String auditorUserName;//���������1
	private Date auditorTime;//���ʱ��1
	private String reason;//����ԭ��1
	private int probationLength;//����ʱ��1
	private Date expirationTime;//����ʱ��1
	private String remark;//��ע1
	private Date applicantTime;//����ʱ��1
	private String local;//ʹ�õص�1
	private String type;//�豸����1
	private int authorization;//�Ƿ���Ȩ1
	private String system;//����ϵͳ1
	private String address;//��ַ1
	private String version;//���ð汾1
	private int state;//��ʽ�汾״̬1
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getOrdName() {
		return ordName;
	}
	public void setOrdName(String ordName) {
		this.ordName = ordName;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
	public Date getExpirationTime() {
		return expirationTime;
	}
	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
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
	
}
