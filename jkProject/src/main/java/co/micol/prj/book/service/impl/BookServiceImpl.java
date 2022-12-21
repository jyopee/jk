package co.micol.prj.book.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.book.mapper.BookMapper;
import co.micol.prj.book.service.BookService;
import co.micol.prj.book.vo.BookVO;
import co.micol.prj.common.DataSource;

public class BookServiceImpl implements BookService {

	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private BookMapper map = sqlSession.getMapper(BookMapper.class);

	@Override
	public List<BookVO> bookSelectList() {
		// 북 전체리스트
		return map.bookSelectList();
	}

	@Override
	public int bookInsert(BookVO vo) {
		// 책을 입력하는 곳
		return map.bookInsert(vo);
	}

	@Override
	public int bookDelete(BookVO vo) {
		// 책 삭제
		return 0;
	}

}
