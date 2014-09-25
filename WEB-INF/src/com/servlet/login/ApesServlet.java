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
	
	private final static int DIRECTOR=0;
	private final static int WRITER=1;
	private final static int ACTOR=2;
	private final static int TYPE=3;
	private final static int LOCATION=4;
	private final static int LANGUAGE=5;
	private final static int DATE=6;
	private final static int MIN=7;
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
		switch(Integer.parseInt(itemName)){
		case DIRECTOR:
			out.write(URLEncoder.encode("���ء����˹","utf-8"));
			break;
		case WRITER:
			out.write(URLEncoder.encode("��ˡ���ķ���� / ��ˡ��ܷ� / �����˹����","utf-8"));
			break;
		case ACTOR:
			out.write(URLEncoder.encode("���ϡ�ɪ��˹ / ��ɭ�������� / ����µ��� / ������������ / �бȡ������� ","utf-8"));
			break;
		case TYPE:
			out.write(URLEncoder.encode("���� / ���� / �ƻ�","utf-8"));
			break;
		case LOCATION:
			out.write(URLEncoder.encode("����","utf-8"));
			break;
		case LANGUAGE:
			out.write(URLEncoder.encode("Ӣ�� / ��������","utf-8"));
			break;
		case DATE:
			out.write(URLEncoder.encode("2014-08-29(�й���½) / 2014-07-11(����)","utf-8"));
			break;
		case MIN:
			out.write(URLEncoder.encode("130 ����","utf-8"));
			break;
		}
		out.flush();
		out.close();
	}

	
}
