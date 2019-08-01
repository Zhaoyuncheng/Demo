package com.neuedu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AjaxServlet")
public class AjaxServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 设置字符集
		
		// 2. 获取用户数据
		String lname = request.getParameter("lname");
		System.out.println(lname);
		// 3. 调用业务层进行处理
		
		// 响应前：睡一会
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// 4. 响应（3种，直接响应，请求转发，请求重定向）
		// Java 对象  可以转换为JSON对象    jsonlib jackson ......
		response.getWriter().write("{\"welcom\":\"lname\"}");
		
	}

}
