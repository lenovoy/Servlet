package com.servlet.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends HttpServlet{

	public LoginAction(){
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		
		PrintWriter out=resp.getWriter();
		out.write("步步高音乐手机");
//		out.println("hello brave new world");
		out.close();
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(null==req)
			return;
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		PrintWriter out=resp.getWriter();
		String username=req.getParameter("user_name");
		String password=req.getParameter("password");
		if(username.equals("admin")){
			if(password.equals("123"))
				out.println("0");
			else
				out.println("2");
		}else
			out.println("1");
		out.flush();
		out.close();
	}
	
	
}
