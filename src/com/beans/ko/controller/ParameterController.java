package com.beans.ko.controller;

import java.util.Arrays;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.beans.ko.domain.User;
import com.beans.ko.domain.UserVo;


/**
 * 参数绑定
 * @author Frank
 *
 */
@Controller
@RequestMapping("param")
public class ParameterController {
	
	/**
	 * 默认参数类型
	 * @param request
	 * @return
	 */
	@RequestMapping(value="test1",method=RequestMethod.POST)
	public String test1(HttpServletRequest request) {
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");
		System.out.println(userName+":"+userPassword);
		
		return "sucess";
	}
	
	/**
	 * @PathVariable通过路径接收参数
	 * @return
	 */
	@RequestMapping(value="test2/{userName}/{userPassword}",method=RequestMethod.POST)
	public String test2(@PathVariable(value="userName")String userName,
			@PathVariable(value="userPassword")String userPassword) {
		System.out.println(userName+":"+userPassword);
		
		return "sucess";
	}
	
	/**
	 * 简单数据类型
	 * @RequestParam 
	 *      value 指定参数名称
	 * 		required 该参数是否为必须
	 */
	@RequestMapping(value="test3",method=RequestMethod.POST)
	public String test3(@RequestParam(value="userName",required=false,defaultValue="张三")String name, 
			String userPassword) {
		System.out.println(name+":"+userPassword);
		
		return "sucess";
	}
	
	/**
	 * JavaBean数据类型,页面控件的name要和JavaBean的get方法名一致
	 */
	@RequestMapping(value="test4",method=RequestMethod.POST)
	public String test4(User user) {
		System.out.println(user.getUserName()+":"+user.getUserPassword()+"-"+user.getTelphone());
		
		return "sucess";
	}
	
	/**
	 * 包装JavaBean数据类型
	 */
	@RequestMapping(value="test5",method=RequestMethod.POST)
	public String test5(UserVo userVo) {
		System.out.println(userVo.toString());
		
		return "sucess";
	}
	
	/**
	 * 数组参数类型
	 */
	@RequestMapping(value="test6",method=RequestMethod.POST)
	public String test6(@RequestParam("lover")Integer[] ids) {
		System.out.println(Arrays.asList(ids));
		
		return "sucess";
	}
	
	/**
	 * 自定义数据类型转换器
	 */
	@RequestMapping(value="test7",method=RequestMethod.POST)
	public String test7(Date birth) {
		System.out.println(birth.toString());
		
		return "sucess";
	}
}
