package hst.service.trialCode.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import hst.mapper.trialCode.TrialCodeMapper;
import hst.model.trialCode.TrialCodeBeen;
import hst.service.trialCode.TrialCodeService;
@Service("trialCodeService")
public class TrialCodeServiceImpl implements TrialCodeService{

	@Resource
	private TrialCodeMapper trialCodeMapper;
	
	@Override
	public List<TrialCodeBeen> findProbationLength() {
		// TODO Auto-generated method stub
		List<TrialCodeBeen> findProbationLength=trialCodeMapper.findProbationLength();
		return findProbationLength;
	}
	@Override
	public List<TrialCodeBeen> listTrialCodeBeen() {
		// TODO Auto-generated method stub
		List<TrialCodeBeen> list=trialCodeMapper.listTrialCodeBeen();
		System.out.println(list);
		return list;
	}
	@Override
	public List<TrialCodeBeen> findTrialCodeBeenId(String orderName) {
		// TODO Auto-generated method stub
		List<TrialCodeBeen> findTrialCodeBeenId=trialCodeMapper.findTrialCodeBeenId(orderName);
		return findTrialCodeBeenId;
	}
	@Override
	public void addTrialCode(TrialCodeBeen trialCodeBeen) {
		// TODO Auto-generated method stub
		trialCodeMapper.addTrialCode(trialCodeBeen);
	}
	@Override
	public TrialCodeBeen findByCode(String code) {
		// TODO Auto-generated method stub
		TrialCodeBeen findByCode=trialCodeMapper.findByCode(code);
		return findByCode;
	}
	@Override
	public PageInfo<TrialCodeBeen> findProbationLengthByPage(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		List<TrialCodeBeen> findProbationLengthByPage=trialCodeMapper.findByPage();
		PageHelper.startPage(currentPage, pageSize);
		PageInfo<TrialCodeBeen> pageInfo=new PageInfo<TrialCodeBeen>(findProbationLengthByPage);
		return pageInfo;
	}
	@Override
	public List<TrialCodeBeen> findByOrdId(String ordId) {
		// TODO Auto-generated method stub
		List<TrialCodeBeen> findByOrdId=trialCodeMapper.findByOrdId(ordId);
		return findByOrdId;
	}
	@Override
	public List<TrialCodeBeen> findByOrdName(TrialCodeBeen trialCodeBeen) {
		// TODO Auto-generated method stub
		List<TrialCodeBeen> findByOrdName=trialCodeMapper.findByOrdName(trialCodeBeen);
		return findByOrdName;
	}
	@Override
	public TrialCodeBeen findByNew(String ordId) {
		// TODO Auto-generated method stub
		TrialCodeBeen findByNew=trialCodeMapper.findByNew(ordId);
		return  findByNew;
	}
	/* (non-Javadoc)
	 * @see hst.service.trialCode.TrialCodeService#listorderName(java.lang.String)
	 */
	@Override
	public List<TrialCodeBeen> listorderName(String ordId) {
		// TODO Auto-generated method stub
		List<TrialCodeBeen> listorderName=trialCodeMapper.listOrderId(ordId);
		return listorderName;
	}
	
}
