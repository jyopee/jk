package co.jk.prj.cart.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.jk.prj.cart.map.CartMapper;
import co.jk.prj.cart.service.CartService;
import co.jk.prj.cart.service.CartVO;
import co.jk.prj.common.DataSource;

public class CartServiceImpl implements CartService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private CartMapper map = sqlSession.getMapper(CartMapper.class);
	@Override
	public List<CartVO> cartSelectList() {
		// TODO Auto-generated method stub
		return map.cartSelectList();
	}

	@Override
	public CartVO cartSelect(CartVO vo) {
		// TODO Auto-generated method stub
		return map.cartSelect(vo);
	}

	@Override
	public int cartInsert(CartVO vo) {
		// TODO Auto-generated method stub
		return map.cartInsert(vo);
	}

	@Override
	public int cartDelete(CartVO vo) {
		// TODO Auto-generated method stub
		return map.cartDelete(vo);
	}

	@Override
	public int cartUpdate(CartVO vo) {
		// TODO Auto-generated method stub
		return map.cartUpdate(vo);
	}

}
