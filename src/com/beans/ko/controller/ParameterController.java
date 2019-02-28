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
 * ������
 * @author Frank
 *
 */
@Controller
@RequestMapping("param")
public class ParameterController {
	
	/**
	 * Ĭ�ϲ�������
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
	 * @PathVariableͨ��·�����ղ���
	 * @return
	 */
	@RequestMapping(value="test2/{userName}/{userPassword}",method=RequestMethod.POST)
	public String test2(@PathVariable(value="userName")String userName,
			@PathVariable(value="userPassword")String userPassword) {
		System.out.println(userName+":"+userPassword);
		
		return "sucess";
	}
	
	/**
	 * ����������
	 * @RequestParam 
	 *      value ָ����������
	 * 		required �ò����Ƿ�Ϊ����
	 */
	@RequestMapping(value="test3",method=RequestMethod.POST)
	public String test3(@RequestParam(value="userName",required=false,defaultValue="����")String name, 
			String userPassword) {
		System.out.println(name+":"+userPassword);
		
		return "sucess";
	}
	
	/**
	 * JavaBean��������,ҳ��ؼ���nameҪ��JavaBean��get������һ��
	 */
	@RequestMapping(value="test4",method=RequestMethod.POST)
	public String test4(User user) {
		System.out.println(user.getUserName()+":"+user.getUserPassword()+"-"+user.getTelphone());
		
		return "sucess";
	}
	
	/**
	 * ��װJavaBean��������
	 */
	@RequestMapping(value="test5",method=RequestMethod.POST)
	public String test5(UserVo userVo) {
		System.out.println(userVo.toString());
		
		return "sucess";
	}
	
	/**
	 * �����������
	 */
	@RequestMapping(value="test6",method=RequestMethod.POST)
	public String test6(@RequestParam("lover")Integer[] ids) {
		System.out.println(Arrays.asList(ids));
		
		return "sucess";
	}
	
	/**
	 * �Զ�����������ת����
	 */
	@RequestMapping(value="test7",method=RequestMethod.POST)
	public String test7(Date birth) {
		System.out.println(birth.toString());
		
		return "sucess";
	}
}
