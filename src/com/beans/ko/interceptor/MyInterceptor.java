package com.beans.ko.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor{

	//Controller����ִ��֮ǰ��ִ��
	//�÷����ķ���ֵ�������Ƿ����ִ��Controller����
	// false,����ִ��
	// true,����ִ��
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("ִ��MyInterceptor��preHandle����");
		return true;
	}

	//Controller����ִ��֮��ִ��
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("ִ��MyInterceptor��postHandle����");
	}

	//Controller�����֮��ִ��
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("ִ��MyInterceptor��afterCompletion����");
	}
}
