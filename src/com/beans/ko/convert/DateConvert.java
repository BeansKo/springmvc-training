package com.beans.ko.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * ÈÕÆÚ×ª»»Æ÷
 * @author Frank
 */
public class DateConvert implements Converter<String, Date>{
	@Override
	public Date convert(String strDate) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		try {
			return format.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
