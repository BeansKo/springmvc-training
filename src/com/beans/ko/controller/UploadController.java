package com.beans.ko.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.beans.ko.domain.User;

@Controller
@RequestMapping("upload")
public class UploadController {
	
	@RequestMapping(value="test1", method=RequestMethod.POST)
	public String test1(HttpServletRequest request, User user, MultipartFile heaIcon) throws IOException {
		System.out.println(user);
		//±£´æÎÄ¼þ
		String uploadPath = request.getServletContext().getRealPath("/upload");
		uploadPath = uploadPath+"/"+heaIcon.getOriginalFilename();
		heaIcon.transferTo(new File(uploadPath));
		
		return "sucess";
	}
}
