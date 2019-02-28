package com.beans.ko.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ҳ����ת
 * @author Frank
 *
 */
@Controller
@RequestMapping("/view")
public class ViewController {
	/**
	 * ��������������void,ҳ����ת
	 * @throws IOException 
	 * @throws  
	 */
	@RequestMapping("/test1")
	public void test1(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
		System.out.println("ViewController--->test1()");
		//ת��
		request.getRequestDispatcher("/WEB-INF/jsp/sucess.jsp").forward(request, response);
	}
	
	/**
	 * ��������������void,�ض���
	 * @throws IOException 
	 * @throws  
	 */
	@RequestMapping("/test2")
	public void test2(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
		System.out.println("ViewController--->test2()");
		//�ض���,ֻ���ض���WEB-INF����
		response.sendRedirect(request.getContextPath()+"/index.jsp");
	}
	
	/**
	 * ��������������ModelAndView  
	 */
	@RequestMapping("/test3")
	public ModelAndView test3() throws Exception {
		System.out.println("ViewController--->test3()");
		ModelAndView mv = new ModelAndView("sucess");
		//�����������ͼ����������ôViewName�����߼����ƣ������� ����·��
		mv.addObject("name", "ViewController--->test3()");
		//mv.setViewName("sucess");
		return mv;
	}
	
	/**
	 * ��������������String (ת��) 
	 */
	@RequestMapping("/test4")
	public String test4() throws Exception {
		System.out.println("ViewController--->test4()");
		return "sucess";
	}
	
	/**
	 * ��������������String (ת��) 
	 */
	@RequestMapping("/test5")
	public String test5(Model model) throws Exception {
		System.out.println("ViewController--->test5()");
		model.addAttribute("name", "ViewController--->test5()");
		return "sucess";
	}
	
	/**
	 * ��������������String (�ض���) 
	 */
	@RequestMapping("/test6")
	public String test6(Model model) throws Exception {
		System.out.println("ViewController--->test6()");
		return "redirect:/index.jsp";
	}
}
