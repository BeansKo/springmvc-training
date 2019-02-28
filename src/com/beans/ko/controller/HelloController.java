package com.beans.ko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping(value="/hello")
	public ModelAndView sayHello() {
		System.out.println("执行controller的sayhello");
		//把数据保存到ModelAndView（相当于保存request域对象）
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "sayHello");
		//返回物理路径
		mv.setViewName("/WEB-INF/jsp/sucess.jsp");
		return mv;
	}
	
	/**
	 * 采用了视图解析器，返回路径中写逻辑路径
	 */
	@RequestMapping(value="/view")
	public ModelAndView view() {
		System.out.println("执行controller的view");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "view");
		//返回逻辑路径
		mv.setViewName("sucess");
		return mv;
	}
}
