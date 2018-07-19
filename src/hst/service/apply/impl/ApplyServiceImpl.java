package hst.service.apply.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hst.mapper.apply.ApplyMapper;
import hst.model.apply.ApplyBean;
import hst.service.apply.ApplyService;
@Service("applyService")
public class ApplyServiceImpl implements ApplyService {

	@Resource 
	private ApplyMapper applyMapper;
	@Override
	public List<ApplyBean> listApply() {
		// TODO Auto-generated method stub
		List<ApplyBean> listApply=applyMapper.listApply();
		return listApply;
	}

	@Override
	public void addApply(ApplyBean applyBean) {
		// TODO Auto-generated method stub
		applyMapper.addApply(applyBean);
	}

	@Override
	public void updateApply(ApplyBean applyBean) {
		// TODO Auto-generated method stub
		applyMapper.updateApply(applyBean);
	}

	@Override
	public void deleteApply(int applyId) {
		// TODO Auto-generated method stub
		applyMapper.deleteApply(applyId);
	}

	@Override
	public ApplyBean findByMachineCode(int applyId) {
		// TODO Auto-generated method stub
		ApplyBean findByMachineCode=applyMapper.findByMachineCode(applyId);
		return findByMachineCode;
	}

	/* (non-Javadoc)
	 * @see hst.service.apply.ApplyService#listApplyByOrderName()
	 */
	@Override
	public List<ApplyBean> listApplyByOrderName(int id) {
		// TODO Auto-generated method stub
		List<ApplyBean> listApplyByOrderName=applyMapper.listApplyByOrderName(id);
		return listApplyByOrderName;
	}

	/* (non-Javadoc)
	 * @see hst.service.apply.ApplyService#findByIdApply(java.lang.String)
	 */
	@Override
	public List<ApplyBean> findByIdApply(String sqId) {
		// TODO Auto-generated method stub
		List<ApplyBean> findByIdApply=applyMapper.findByIdApply(sqId);
		return findByIdApply;
	}

}
