package hst.service.equipment.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hst.mapper.equipment.EquipmentMapper;
import hst.model.equipment.EquipmentBean;
import hst.service.equipment.EquipmentService;
@Service("EquipmentService")
public class EquipmentServiceImpl implements EquipmentService {
	@Resource
	private EquipmentMapper equipmentMapper;
	
	@Override
	public List<EquipmentBean> findEquipmentBeanId(String ordId) {
		// TODO Auto-generated method stub
		List<EquipmentBean> findEquipmentBeanId=equipmentMapper.findEquipmentBeanId(ordId);
		return findEquipmentBeanId;
	}

	/* (non-Javadoc)
	 * @see hst.service.equipment.EquipmentService#findByorderName(java.lang.String)
	 */
	@Override
	public List<EquipmentBean> findByorderName(int id) {
		// TODO Auto-generated method stub
		List<EquipmentBean> findByorderName=equipmentMapper.findByorderName(id);
		return findByorderName;
	}

	/* (non-Javadoc)
	 * @see hst.service.equipment.EquipmentService#listEquipmentBean()
	 */
	@Override
	public List<EquipmentBean> listEquipmentBean() {
		// TODO Auto-generated method stub
		List<EquipmentBean> listEquipmentBean=equipmentMapper.listEquipmentBean();
		return listEquipmentBean;
	}

	/* (non-Javadoc)
	 * @see hst.service.equipment.EquipmentService#combinationQuery(hst.model.equipment.EquipmentBean)
	 */
	@Override
	public List<EquipmentBean> combinationQuery(EquipmentBean equipmentBean) {
		// TODO Auto-generated method stub
		List<EquipmentBean> combinationQuery=equipmentMapper.combinationQuery(equipmentBean);
		return combinationQuery;
	}

	/* (non-Javadoc)
	 * @see hst.service.equipment.EquipmentService#addEquipment(hst.model.equipment.EquipmentBean)
	 */
	@Override
	public void addEquipment(EquipmentBean equipmentBean) {
		// TODO Auto-generated method stub
		equipmentMapper.addEquipment(equipmentBean);
	}

	/* (non-Javadoc)
	 * @see hst.service.equipment.EquipmentService#excludeRepetition(java.lang.String)
	 */
	@Override
	public EquipmentBean excludeRepetition(int id) {
		// TODO Auto-generated method stub
		EquipmentBean excludeRepetition=equipmentMapper.excludeRepetition(id);
		return excludeRepetition;
	}

	/* (non-Javadoc)
	 * @see hst.service.equipment.EquipmentService#findByNew(java.lang.String)
	 */
	@Override
	public List<EquipmentBean> findByNew(String ordId) {
		// TODO Auto-generated method stub
		List<EquipmentBean> findByNew=equipmentMapper.findByNew(ordId);
		return findByNew;
	}

	/* (non-Javadoc)
	 * @see hst.service.equipment.EquipmentService#deleteEquipment(int)
	 */
	@Override
	public void deleteEquipment(int id) {
		// TODO Auto-generated method stub
		equipmentMapper.deleteEquipment(id);
	}

	/* (non-Javadoc)
	 * @see hst.service.equipment.EquipmentService#updateBytrialCode(hst.model.equipment.EquipmentBean)
	 */
	@Override
	public void updateBytrialCode(EquipmentBean equipmentBean) {
		// TODO Auto-generated method stub
		equipmentMapper.updateBytrialCode(equipmentBean);
	}

	/* (non-Javadoc)
	 * @see hst.service.equipment.EquipmentService#codeNull(java.lang.String)
	 */
	@Override
	public List<EquipmentBean> codeNull(String ordId) {
		// TODO Auto-generated method stub
		List<EquipmentBean> codeNull=equipmentMapper.codeNull(ordId);
		return codeNull;
	}

	/* (non-Javadoc)
	 * @see hst.service.equipment.EquipmentService#codeNotNull(java.lang.String)
	 */
	@Override
	public List<EquipmentBean> codeNotNull(String ordId) {
		// TODO Auto-generated method stub
		List<EquipmentBean> codeNotNull=equipmentMapper.codeNotNull(ordId);
		return codeNotNull;
	}

	/* (non-Javadoc)
	 * @see hst.service.equipment.EquipmentService#findByOrdName(hst.model.equipment.EquipmentBean)
	 */
	@Override
	public List<EquipmentBean> findByOrdName(EquipmentBean equipmentBean) {
		// TODO Auto-generated method stub
		List<EquipmentBean> findByOrdName=equipmentMapper.findByOrdName(equipmentBean);
		return findByOrdName;
	}

	/* (non-Javadoc)
	 * @see hst.service.equipment.EquipmentService#updateEquipment(hst.model.equipment.EquipmentBean)
	 */
	@Override
	public void updateEquipment(EquipmentBean equipmentBean) {
		// TODO Auto-generated method stub
		equipmentMapper.updateEquipment(equipmentBean);
	}

	/* (non-Javadoc)
	 * @see hst.service.equipment.EquipmentService#updateState(hst.model.equipment.EquipmentBean)
	 */
	@Override
	public void updateState(EquipmentBean equipmentBean) {
		// TODO Auto-generated method stub
		equipmentMapper.updateState(equipmentBean);
		
	}

	/* (non-Javadoc)
	 * @see hst.service.equipment.EquipmentService#findByExpirationTimebyTen(hst.model.equipment.EquipmentBean)
	 */
	@Override
	public List<EquipmentBean> findByExpirationTimebyTen() {
		// TODO Auto-generated method stub
		List<EquipmentBean> findByExpirationTimebyTen=equipmentMapper.findByExpirationTimebyTen();
		return findByExpirationTimebyTen;
	}

	/* (non-Javadoc)
	 * @see hst.service.equipment.EquipmentService#findByExpirationTimebyFour(hst.model.equipment.EquipmentBean)
	 */
	@Override
	public List<EquipmentBean> findByExpirationTimebyFour() {
		// TODO Auto-generated method stub
		List<EquipmentBean> findByExpirationTimebyFour=equipmentMapper.findByExpirationTimebyFour();
		return findByExpirationTimebyFour;
	}

	/* (non-Javadoc)
	 * @see hst.service.equipment.EquipmentService#updateByExpirationTimeByOther(hst.model.equipment.EquipmentBean)
	 */
	@Override
	public void updateByExpirationTimeByOther(EquipmentBean equipmentBean) {
		// TODO Auto-generated method stub
		equipmentMapper.updateByExpirationTimeByOther(equipmentBean);
		
	}

	/* (non-Javadoc)
	 * @see hst.service.equipment.EquipmentService#updateByExpirationTimeByTen(hst.model.equipment.EquipmentBean)
	 */
	@Override
	public void updateByExpirationTimeByTen(EquipmentBean equipmentBean) {
		// TODO Auto-generated method stub
		equipmentMapper.updateByExpirationTimeByTen(equipmentBean);
	}

	/* (non-Javadoc)
	 * @see hst.service.equipment.EquipmentService#updateByExpirationTimeByFourByFalse(hst.model.equipment.EquipmentBean)
	 */
	@Override
	public void updateByExpirationTimeByFourByFalse(EquipmentBean equipmentBean) {
		// TODO Auto-generated method stub
		equipmentMapper.updateByExpirationTimeByFourByFalse(equipmentBean);
	}

	/* (non-Javadoc)
	 * @see hst.service.equipment.EquipmentService#updateByExpirationTimeByFourByTrue(hst.model.equipment.EquipmentBean)
	 */
	@Override
	public void updateByExpirationTimeByFourByTrue(EquipmentBean equipmentBean) {
		// TODO Auto-generated method stub
		equipmentMapper.updateByExpirationTimeByFourByTrue(equipmentBean);
	}

}
