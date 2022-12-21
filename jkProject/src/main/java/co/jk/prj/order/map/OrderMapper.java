package co.jk.prj.order.map;

import java.util.List;

import co.jk.prj.order.service.OrderVO;

public interface OrderMapper {
	List<OrderVO> orderSelectList();

	OrderVO orderSelect(OrderVO vo);

	int orderInsert(OrderVO vo);

	int orderDelete(OrderVO vo);

	int orderUpdate(OrderVO vo);
}
