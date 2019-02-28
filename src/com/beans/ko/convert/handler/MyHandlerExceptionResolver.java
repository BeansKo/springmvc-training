package com.beans.ko.convert.handler;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * Spring“Ï≥£¥¶¿ÌHandlerExceptionResolver
 * @author Frank
 *
 */
public class MyHandlerExceptionResolver implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		ModelAndView mv = new ModelAndView();
		StringWriter w = new StringWriter();
		PrintWriter s = new PrintWriter(w);
		ex.printStackTrace(s);
		mv.addObject("error", w.toString());
		mv.setViewName("error");
		return mv;
	}
}
