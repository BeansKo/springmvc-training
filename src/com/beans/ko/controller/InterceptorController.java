package com.beans.ko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Ê¹ÓÃÀ¹½ØÆ÷µÄController
 * @author Frank
 *
 */
@Controller
@RequestMapping("interceptor")
public class InterceptorController {
	@RequestMapping("test1")
	public String test1() {
		System.out.println("InterceptorController->test1()");
		return "sucess";
	}
}
