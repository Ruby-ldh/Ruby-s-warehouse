package hst.mapper.trialCode;

import java.util.List;

import hst.model.trialCode.TrialCodeBeen;

public interface TrialCodeMapper {
	//չʾ����ʱ��10�����µ�����
	public List<TrialCodeBeen> findProbationLength();
	public List<TrialCodeBeen> listTrialCodeBeen();
	public List<TrialCodeBeen> findTrialCodeBeenId(String orderId);
	//������Ŀid��ѯ
	public List<TrialCodeBeen> findByOrdId(String ordId);
	
	//�������ʱ����ҳ����µ�һ������
	public TrialCodeBeen findByNew(String ordId);
	//������Ŀ��Ų���豸
	public List<TrialCodeBeen> listOrderId(String ordId);
	
	
	//������Ŀ���Ʋ�ѯ
	public List<TrialCodeBeen> findByOrdName(TrialCodeBeen trialCodeBeen);
	
	public void addTrialCode(TrialCodeBeen trialCodeBeen);
	public TrialCodeBeen findByCode(String code);
	public List<TrialCodeBeen> findByPage();
}
