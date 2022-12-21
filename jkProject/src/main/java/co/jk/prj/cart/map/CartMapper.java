package co.jk.prj.cart.map;

import java.util.List;

import co.jk.prj.cart.service.CartVO;

public interface CartMapper {
	List<CartVO> cartSelectList();

	CartVO cartSelect(CartVO vo);

	int cartInsert(CartVO vo);

	int cartDelete(CartVO vo);

	int cartUpdate(CartVO vo);
}
