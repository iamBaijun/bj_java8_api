package com.bai.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Time implements Servlet {

	@Override
	public void destroy() {
		System.out.println("destroy销毁");

	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig获取config");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init初始化");

	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service请求开始");
		System.out.println(request.getServletContext());

		//1.3读取实体内容
		//本案例浏览器没有向服务器传递任何业务数据,所以实体内容为空
		//2.使用response写响应数据
		//2.1写状态行: 由服务器自动写
		//2.2写消息头
		//告诉浏览器给它输出的是什么格式的内容
		response.setContentType("text/html");
		
		//获取输出流，该流指向的目标就是浏览器
		PrintWriter out = response.getWriter();
		//省略代码N行
		Date date = new Date();
		SimpleDateFormat sdf = 
			new SimpleDateFormat("HH:mm:ss");
		String now = sdf.format(date);
		//2.3写实体内容	
		out.println("<!DOCTYPE HTML>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>TimeServlet</title>");
		out.println("<meta charset='utf-8'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+now+"</p>");
		out.println("</body>");
		out.println("</html>");
		out.close();

	}

}
