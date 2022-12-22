package co.jk.prj.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jk.prj.common.Command;

public class MainCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 처음 들어올때 보여줄 페이지
		return "main/homeMain.tiles";
	}

}
