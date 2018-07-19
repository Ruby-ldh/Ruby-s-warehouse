package hst.mapper.trialCode;

import java.util.List;

import hst.model.trialCode.TrialCodeBeen;

public interface TrialCodeMapper {
	//展示试用时长10天以下的数据
	public List<TrialCodeBeen> findProbationLength();
	public List<TrialCodeBeen> listTrialCodeBeen();
	public List<TrialCodeBeen> findTrialCodeBeenId(String orderId);
	//根据项目id查询
	public List<TrialCodeBeen> findByOrdId(String ordId);
	
	//根据审核时间查找出最新的一条数据
	public TrialCodeBeen findByNew(String ordId);
	//根据项目编号查出设备
	public List<TrialCodeBeen> listOrderId(String ordId);
	
	
	//根据项目名称查询
	public List<TrialCodeBeen> findByOrdName(TrialCodeBeen trialCodeBeen);
	
	public void addTrialCode(TrialCodeBeen trialCodeBeen);
	public TrialCodeBeen findByCode(String code);
	public List<TrialCodeBeen> findByPage();
}
