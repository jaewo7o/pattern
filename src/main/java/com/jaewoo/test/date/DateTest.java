package com.jaewoo.test.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
	public static void main(String[] args) throws ParseException {	
		Date currentDate = new Date();
		System.out.println("current Date : " + currentDate);
		
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(currentDate);
		System.out.println("calendar day : " + calendar.get(Calendar.DATE));
		
		calendar.add(Calendar.DATE, 1);
		System.out.println("next day : " + calendar.get(Calendar.DATE));
	
		String strCurrentDate;
		strCurrentDate = new SimpleDateFormat("yyyy-MM-dd").format(currentDate);
		System.out.println("format string date : " + strCurrentDate);
		
		Date firstJanuary = new SimpleDateFormat("yyyy-MM-dd").parse("2015-01-01");
		System.out.println("first january : " + firstJanuary);
	}
}
