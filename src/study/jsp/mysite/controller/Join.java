package study.jsp.mysite.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.jsp.helper.BaseController;

/**
 * Servlet implementation class Join
 */
@WebServlet("/member/join.do")
public class Join extends BaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1980965670118598852L;

	@Override
	public String doRun(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		return "member/join";
	}

}
