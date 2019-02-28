package com.beans.ko.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 页面跳转
 * @author Frank
 *
 */
@Controller
@RequestMapping("/view")
public class ViewController {
	/**
	 * 控制器方法返回void,页面跳转
	 * @throws IOException 
	 * @throws  
	 */
	@RequestMapping("/test1")
	public void test1(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
		System.out.println("ViewController--->test1()");
		//转发
		request.getRequestDispatcher("/WEB-INF/jsp/sucess.jsp").forward(request, response);
	}
	
	/**
	 * 控制器方法返回void,重定向
	 * @throws IOException 
	 * @throws  
	 */
	@RequestMapping("/test2")
	public void test2(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
		System.out.println("ViewController--->test2()");
		//重定向,只能重定向到WEB-INF外面
		response.sendRedirect(request.getContextPath()+"/index.jsp");
	}
	
	/**
	 * 控制器方法返回ModelAndView  
	 */
	@RequestMapping("/test3")
	public ModelAndView test3() throws Exception {
		System.out.println("ViewController--->test3()");
		ModelAndView mv = new ModelAndView("sucess");
		//如果配置了视图解析器，那么ViewName就是逻辑名称，否则是 物理路径
		mv.addObject("name", "ViewController--->test3()");
		//mv.setViewName("sucess");
		return mv;
	}
	
	/**
	 * 控制器方法返回String (转发) 
	 */
	@RequestMapping("/test4")
	public String test4() throws Exception {
		System.out.println("ViewController--->test4()");
		return "sucess";
	}
	
	/**
	 * 控制器方法返回String (转发) 
	 */
	@RequestMapping("/test5")
	public String test5(Model model) throws Exception {
		System.out.println("ViewController--->test5()");
		model.addAttribute("name", "ViewController--->test5()");
		return "sucess";
	}
	
	/**
	 * 控制器方法返回String (重定向) 
	 */
	@RequestMapping("/test6")
	public String test6(Model model) throws Exception {
		System.out.println("ViewController--->test6()");
		return "redirect:/index.jsp";
	}
}
