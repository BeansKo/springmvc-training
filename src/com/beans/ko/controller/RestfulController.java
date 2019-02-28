package com.beans.ko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beans.ko.domain.User;

@Controller
@RequestMapping("restful")
public class RestfulController {
	@RequestMapping(method=RequestMethod.GET)
	public String getGet() {
		System.out.println("RestfulController-->getGet");
		return "sucess";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String getPost(User user) {
		System.out.println("RestfulController-->getPost");
		System.out.println(user);
		return "sucess";
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public String getPut(User user) {
		System.out.println("RestfulController-->getPut");
		System.out.println(user);
		return "sucess";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public String getDelete(@PathVariable(value="id")String id) {
		System.out.println("RestfulController-->getDelete");
		System.out.println("delete id is "+id);
		return "sucess";
	}
}
