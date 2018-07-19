package hst.service.orderMain.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hst.mapper.orderMain.OrderMainMapper;
import hst.model.orderMain.OrderMainBean;
import hst.service.orderMain.OrderMainService;
@Service("orderMainService")
public class OrderMainServiceImpl implements OrderMainService {
	@Resource
	private OrderMainMapper orderMainMapper;
	
	public List<OrderMainBean> findOrderMain() {
		// TODO Auto-generated method stub
		List<OrderMainBean> findOrderMain=orderMainMapper.findOrderMain();
		return findOrderMain;
	}

	@Override
	public List<OrderMainBean> select(OrderMainBean orderMain) {
		// TODO Auto-generated method stub
		List<OrderMainBean> select=orderMainMapper.select(orderMain);
		return select;
	}

}
