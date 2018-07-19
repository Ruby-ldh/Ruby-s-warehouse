package hst.service.trialCode;

import java.util.List;

import com.github.pagehelper.PageInfo;

import hst.model.trialCode.TrialCodeBeen;

public interface TrialCodeService {
	//չʾ����ʱ��10�����µ����
		public List<TrialCodeBeen> findProbationLength();
		public List<TrialCodeBeen> listTrialCodeBeen();
		public List<TrialCodeBeen> findTrialCodeBeenId(String orderName);
		public void addTrialCode(TrialCodeBeen trialCodeBeen);
		public TrialCodeBeen findByCode(String code);
		public PageInfo<TrialCodeBeen> findProbationLengthByPage(int currentPage, int pageSize);
		//�����Ŀ��Ų���
		public List<TrialCodeBeen> findByOrdId(String ordId);
		//�����Ŀ��Ų���豸
		public List<TrialCodeBeen> listorderName(String ordId);
		//�����Ŀ��Ʋ�ѯ
		public List<TrialCodeBeen> findByOrdName(TrialCodeBeen trialCodeBeen);
		
		//������ʱ����ҳ����µ�һ�����
		public TrialCodeBeen findByNew(String ordId);
}
