package study.jsp.mysite.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.jsp.helper.BaseController;

/**
 * Servlet implementation class Introduce
 */
@WebServlet("/content/introduce.do")
public class Introduce extends BaseController {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4255010281595607698L;

	@Override
	public String doRun(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		return "content/introduce";
	}

}
