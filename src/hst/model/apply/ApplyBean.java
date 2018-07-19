package hst.model.apply;

import java.util.Date;

public class ApplyBean {
	private int applyId;
	private int id;
	private String ordId;//项目id
	private String ordName;//项目名
	private String orderName;//设备名称
	private String machineCode;//机器码
	private String sqId;//申请id
	private String sqName;//申请人名
	private String sqReason;//申请理由
	private Date sqTime;//申请时间
	private String local;//使用地点
	private String type;//类型
	private int authorization;//是否授权
	private String system;//系统
	private String address;//地址
	private String version;//版本
	private int state;//申请状态
	private String shId;//审核id
	private String shName;//审核人名
	private String remark;//备注
	private Date shTime;//审核时间
	private Date expirationTime;//到期时间
	private String code;//试用码
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getShId() {
		return shId;
	}
	public void setShId(String shId) {
		this.shId = shId;
	}
	public String getShName() {
		return shName;
	}
	public void setShName(String shName) {
		this.shName = shName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getShTime() {
		return shTime;
	}
	public void setShTime(Date shTime) {
		this.shTime = shTime;
	}
	public Date getExpirationTime() {
		return expirationTime;
	}
	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}

	
	public int getApplyId() {
		return applyId;
	}
	public void setApplyId(int applyId) {
		this.applyId = applyId;
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
	
	
	public String getSqId() {
		return sqId;
	}
	public void setSqId(String sqId) {
		this.sqId = sqId;
	}
	public String getSqName() {
		return sqName;
	}
	public void setSqName(String sqName) {
		this.sqName = sqName;
	}
	public String getSqReason() {
		return sqReason;
	}
	public void setSqReason(String sqReason) {
		this.sqReason = sqReason;
	}
	public Date getSqTime() {
		return sqTime;
	}
	public void setSqTime(Date sqTime) {
		this.sqTime = sqTime;
	}

	
}
