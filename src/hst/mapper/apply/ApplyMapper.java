package hst.mapper.apply;

import java.util.List;

import hst.model.apply.ApplyBean;

public interface ApplyMapper {
	//遍历
	public List<ApplyBean> listApply();
	//申请添加
	public void addApply(ApplyBean applyBean);
	//修改审核状态
	public void updateApply(ApplyBean applyBean);
	//删除
	public void deleteApply(int applyId);
	//通过id查找
	public ApplyBean findByMachineCode(int applyId);
	
	//遍历某个特定设备下的试用码申请记录
	public List<ApplyBean> listApplyByOrderName(int id);
	
	//某人的申请记录
	public List<ApplyBean> findByIdApply(String sqId);
	//某人的审核记录
}
