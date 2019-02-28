package com.beans.ko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @RequestMapping注解的使用
 * @author Frank
 *
 */
@Controller
@RequestMapping(value="requestmapping")
public class RequestMappingController {
	/**
	 * value属性演示
	 * @return
	 */
	@RequestMapping(value="test1",method=RequestMethod.GET)
	public ModelAndView test1() {
		System.out.println("RequestMappingController->test1()");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "RequestMappingController->tes1");
		
		mv.setViewName("sucess");
		return mv;
	}
	
	/**
	 * method属性演示
	 * @return
	 */
	@RequestMapping(value="test2",method=RequestMethod.POST)
	public ModelAndView test2() {
		System.out.println("RequestMappingController->test2()");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "RequestMappingController->tes2");
		
		mv.setViewName("sucess");
		return mv;
	}
	
	/**
	 * params属性演示
	 * @return
	 */
	@RequestMapping(value="test3",method=RequestMethod.GET,params={"name"})
	public ModelAndView test3() {
		System.out.println("RequestMappingController->test3()");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "RequestMappingController->tes3");
		
		mv.setViewName("sucess");
		return mv;
	}
}
