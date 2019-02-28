package com.beans.ko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="exceprion")
public class ExceptionController {
	@RequestMapping(value="test1",method=RequestMethod.GET)
	public String test1() {
		System.out.println("ExceptionController->test1()");
		//模拟异常
		String name = null;
		@SuppressWarnings({ "unused", "null" })
		String subName = name.substring(0);
		return "sucess";
	}
	
	@RequestMapping(value="test2",method=RequestMethod.GET)
	public String test2() {
		System.out.println("ExceptionController->test2()");
		//模拟异常
		@SuppressWarnings("unused")
		int i = 100/0;
		return "sucess";
	}
	
	@RequestMapping(value="test3",method=RequestMethod.GET)
	public String test3() {
		System.out.println("ExceptionController->test3()");
		//模拟异常
		int[] arrs = new int[3];
		arrs[3] = 100;
		return "sucess";
	}
}
