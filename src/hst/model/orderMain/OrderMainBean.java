package hst.model.orderMain;

public class OrderMainBean {
	private String ordId;//项目id
	private String date;//时间
	private String cliname;//公司名
	private String xmName;//项目名
	private String edMan;//负责人
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getXmName() {
		return xmName;
	}
	public void setXmName(String xmName) {
		this.xmName = xmName;
	}
	public String getEdMan() {
		return edMan;
	}
	public void setEdMan(String edMan) {
		this.edMan = edMan;
	}
	public String getOrdId() {
		return ordId;
	}
	public void setOrdId(String ordId) {
		this.ordId = ordId;
	}
	public String getCliname() {
		return cliname;
	}
	public void setCliname(String cliname) {
		this.cliname = cliname;
	}
	
}
