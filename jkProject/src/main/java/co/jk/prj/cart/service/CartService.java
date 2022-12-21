package co.jk.prj.cart.service;

import java.util.List;

public interface CartService {
	List<CartVO> cartSelectList();

	CartVO cartSelect(CartVO vo);

	int cartInsert(CartVO vo);

	int cartDelete(CartVO vo);

	int cartUpdate(CartVO vo);

}
