package hst.service.apply;

import java.util.List;

import hst.model.apply.ApplyBean;

public interface ApplyService {

	public List<ApplyBean> listApply();
	
	public void addApply(ApplyBean applyBean);
	
	public void updateApply(ApplyBean applyBean);
	
	public void deleteApply(int applyId);
	
	public ApplyBean findByMachineCode(int applyId);
	
	//遍历某个特定设备下的试用码申请记录
		public List<ApplyBean> listApplyByOrderName(int id);
	
		
		//某人的申请记录
		public List<ApplyBean> findByIdApply(String sqId);
}
