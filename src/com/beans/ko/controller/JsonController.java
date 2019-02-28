package com.beans.ko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beans.ko.domain.User;

@Controller
@RequestMapping("json")
public class JsonController {
	//@RequestBody�������ҳ���json����
	//@ResponseBody������ҳ���json����
	@RequestMapping(value="test1",method=RequestMethod.POST)
	@ResponseBody
	public User test1(@RequestBody User user) {
		System.out.println(user);
		
		return user;
	}
}
