package co.micol.prj.book.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.micol.prj.book.service.BookService;
import co.micol.prj.book.service.impl.BookServiceImpl;
import co.micol.prj.book.vo.BookVO;
import co.micol.prj.common.Command;

public class AjaxBookAdd implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
	
		System.out.println("여기까지만 와라...");
		BookVO vo = new BookVO();

		vo.setBookCode(request.getParameter("bookCode"));
		vo.setBookTitle(request.getParameter("bookTitle"));
		vo.setBookAuthor(request.getParameter("bookAuthor"));
		vo.setBookPress(request.getParameter("bookPress"));
		vo.setBookPrice(Integer.parseInt(request.getParameter("bookPrice")));
		
		System.out.println("과연");
	
		BookService dao = new BookServiceImpl();
		dao.bookInsert(vo);
		
		String json = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			json = mapper.writeValueAsString(vo);
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}

		return "ajax:" + json;

	}

}
