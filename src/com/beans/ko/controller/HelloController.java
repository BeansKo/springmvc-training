package com.beans.ko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping(value="/hello")
	public ModelAndView sayHello() {
		System.out.println("ִ��controller��sayhello");
		//�����ݱ��浽ModelAndView���൱�ڱ���request�����
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "sayHello");
		//��������·��
		mv.setViewName("/WEB-INF/jsp/sucess.jsp");
		return mv;
	}
	
	/**
	 * ��������ͼ������������·����д�߼�·��
	 */
	@RequestMapping(value="/view")
	public ModelAndView view() {
		System.out.println("ִ��controller��view");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "view");
		//�����߼�·��
		mv.setViewName("sucess");
		return mv;
	}
}
