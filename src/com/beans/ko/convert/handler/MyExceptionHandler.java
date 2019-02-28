package com.beans.ko.convert.handler;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyExceptionHandler {
	@ExceptionHandler(value={java.lang.NullPointerException.class})
	public ModelAndView exceptionHandler(Exception ex) {
		ModelAndView mv = new ModelAndView();
		StringWriter stringWriter = new StringWriter();
		PrintWriter pWriter = new PrintWriter(stringWriter);
		ex.printStackTrace(pWriter);
		mv.addObject("error", stringWriter.toString());
		mv.setViewName("error");
		return mv;
	}
}
