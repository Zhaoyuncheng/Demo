package com.neuedu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/findLnameServlet")
public class FindLnameServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String lname = request.getParameter("lname");
		if("admin".equals(lname) && lname!= null && lname != ""){
			// 返回一个可以标识成功的Json {"msg":true}
			response.getWriter().print("{\"msg\":true}");
		}else {
			// 返回一个可以标识失败的Json {"msg":false}
			response.getWriter().print("{\"msg\":false}");
		}
		System.out.println(lname);
		
		int a = 10;
		byte b = (byte)a;
	}

}
