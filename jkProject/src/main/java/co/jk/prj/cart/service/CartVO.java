package co.jk.prj.cart.service;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CartVO {
	private int productCartId;
	private int productId;
	private String memberID;
	private int productAmount;
}
