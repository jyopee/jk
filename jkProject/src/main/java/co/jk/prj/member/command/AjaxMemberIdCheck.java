package co.jk.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jk.prj.member.service.MemberService;
import co.jk.prj.member.serviceImpl.MemberServiceImpl;
import co.micol.prj.common.Command;


public class AjaxMemberIdCheck implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		MemberService dao = new MemberServiceImpl();
		String id =request.getParameter("id");
		String result = "1"; //존재하지 않으면 1
		boolean b = dao.isIdCheck(id);
		if(!b) {
			result = "0"; //존재하면 0
		}
		return "Ajax:" + result;
	}

}
