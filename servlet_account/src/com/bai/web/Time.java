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
		System.out.println("destroy����");

	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig��ȡconfig");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init��ʼ��");

	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service����ʼ");
		System.out.println(request.getServletContext());

		//1.3��ȡʵ������
		//�����������û��������������κ�ҵ������,����ʵ������Ϊ��
		//2.ʹ��responseд��Ӧ����
		//2.1д״̬��: �ɷ������Զ�д
		//2.2д��Ϣͷ
		//��������������������ʲô��ʽ������
		response.setContentType("text/html");
		
		//��ȡ�����������ָ���Ŀ����������
		PrintWriter out = response.getWriter();
		//ʡ�Դ���N��
		Date date = new Date();
		SimpleDateFormat sdf = 
			new SimpleDateFormat("HH:mm:ss");
		String now = sdf.format(date);
		//2.3дʵ������	
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
