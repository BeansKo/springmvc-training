package com.beans.ko.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor{

	//Controller方法执行之前被执行
	//该方法的返回值，代表是否继续执行Controller方法
	// false,代表不执行
	// true,代表执行
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("执行MyInterceptor的preHandle方法");
		return true;
	}

	//Controller方法执行之后被执行
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("执行MyInterceptor的postHandle方法");
	}

	//Controller方完成之后被执行
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("执行MyInterceptor的afterCompletion方法");
	}
}
