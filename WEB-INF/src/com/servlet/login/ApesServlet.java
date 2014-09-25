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
			out.write(URLEncoder.encode("马特·里夫斯","utf-8"));
			break;
		case "Writer":
			out.write(URLEncoder.encode("马克·鲍姆贝克 / 里克·杰法 / 阿曼达·斯尔沃","utf-8"));
			break;
		case "Actor":
			out.write(URLEncoder.encode("安迪·瑟金斯 / 杰森·克拉科 / 加里·奥德曼 / 凯丽·拉塞尔 / 托比·凯贝尔 ","utf-8"));
			break;
		case "Type":
			out.write(URLEncoder.encode("剧情 / 动作 / 科幻","utf-8"));
			break;
		case "Location":
			out.write(URLEncoder.encode("美国","utf-8"));
			break;
		case "Language":
			out.write(URLEncoder.encode("英语 / 美国手语","utf-8"));
			break;
		case "Date":
			out.write(URLEncoder.encode("2014-08-29(中国大陆) / 2014-07-11(美国)","utf-8"));
			break;
		case "Min":
			out.write(URLEncoder.encode("130 分钟","utf-8"));
			break;
		}
		out.flush();
		out.close();
	}

	
}
