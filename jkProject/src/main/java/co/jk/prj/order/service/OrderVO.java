package co.jk.prj.order.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderVO {
	private int orderId;
	private String memberId;
	private Date orderDate;
	private int orderState;
}
