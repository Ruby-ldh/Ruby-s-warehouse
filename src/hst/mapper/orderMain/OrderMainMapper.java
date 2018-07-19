package hst.mapper.orderMain;

import java.util.List;

import hst.model.orderMain.OrderMainBean;

public interface OrderMainMapper {
	public List<OrderMainBean> findOrderMain();
	
	//组合查询
	public List<OrderMainBean> select(OrderMainBean orderMain);
	
	
}
