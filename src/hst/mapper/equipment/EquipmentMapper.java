package hst.mapper.equipment;

import java.util.List;

import hst.model.equipment.EquipmentBean;

public interface EquipmentMapper {
	//遍历设备表
	public List<EquipmentBean> listEquipmentBean();
	//通过项目id查找
	public List<EquipmentBean> findEquipmentBeanId(String ordId);
	//通过项目id、审核时间查找出最新的一条数据
	public List<EquipmentBean> findByNew(String ordId);
	//ͨ通过设备编号查找所有
	public List<EquipmentBean> findByorderName(int id);
	//判断设备编号是否重复
	public EquipmentBean excludeRepetition(int id);
	//组合查询
	public List<EquipmentBean> combinationQuery(EquipmentBean equipmentBean);
	//因为添加试用码而修改数据库
	public void updateBytrialCode(EquipmentBean equipmentBean);
	//设备添加
	public void addEquipment(EquipmentBean equipmentBean);
	//设备删除
	public void deleteEquipment(int id);
	//查找试用码为空的字段
	public List<EquipmentBean> codeNull(String ordId);
	//查找试用码不为空的字段
	public List<EquipmentBean> codeNotNull(String ordId);
	//根据项目名称查询,到期提醒
	public List<EquipmentBean> findByOrdName(EquipmentBean equipmentBean);
	//10天到期提醒
	/*public List<EquipmentBean> findByExpirationTimebyTen(EquipmentBean equipmentBean);*/
	public List<EquipmentBean> findByExpirationTimebyTen();
	//4天到期提醒
	/*public List<EquipmentBean> findByExpirationTimebyFour(EquipmentBean equipmentBean);*/
	public List<EquipmentBean> findByExpirationTimebyFour();
	//修改设备
	public void updateEquipment(EquipmentBean equipmentBean);
	//一键切换正式版的状态
	public void updateState(EquipmentBean equipmentBean);
	
	//修改到期时间大于十天的mailState状态
	public void updateByExpirationTimeByOther(EquipmentBean equipmentBean);
	//修改到期时间小于十天的mailState状态
	public void updateByExpirationTimeByTen(EquipmentBean equipmentBean);
	//修改到期时间小于四天的状态，把mailState之前的true改成false
	public void updateByExpirationTimeByFourByFalse(EquipmentBean equipmentBean);
	//修改到期时间小于四天的状态，把mailState之前的false改成true
	public void updateByExpirationTimeByFourByTrue(EquipmentBean equipmentBean);
	
}
