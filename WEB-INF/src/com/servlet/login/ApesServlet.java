package com.servlet.login;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ApesServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ApesServlet(){
		super();
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(null==req)
			return;
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String itemName=req.getParameter("itemName");
		
		OutputStreamWriter out=new OutputStreamWriter(resp.getOutputStream());
		switch(itemName){
		case "Director":
			out.write(URLEncoder.encode("���ء����˹","utf-8"));
			break;
		case "Writer":
			out.write(URLEncoder.encode("��ˡ���ķ���� / ��ˡ��ܷ� / �����˹����","utf-8"));
			break;
		case "Actor":
			out.write(URLEncoder.encode("���ϡ�ɪ��˹ / ��ɭ�������� / ����µ��� / ������������ / �бȡ������� ","utf-8"));
			break;
		case "Type":
			out.write(URLEncoder.encode("���� / ���� / �ƻ�","utf-8"));
			break;
		case "Location":
			out.write(URLEncoder.encode("����","utf-8"));
			break;
		case "Language":
			out.write(URLEncoder.encode("Ӣ�� / ��������","utf-8"));
			break;
		case "Date":
			out.write(URLEncoder.encode("2014-08-29(�й���½) / 2014-07-11(����)","utf-8"));
			break;
		case "Min":
			out.write(URLEncoder.encode("130 ����","utf-8"));
			break;
		}
		out.flush();
		out.close();
	}

	
}
