package com.itech.ultimate.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateHelper {

	public static Date getCurrentDate() {
		Date currDate = new Date();
		return currDate;
	}
	
	public static String getCurrentDateTimeString() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String currDate = dateFormat.format(date);
		return currDate;
	}
	
	public static String getCurrentLocalDateTimeString() {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime date = LocalDateTime.now();
		String currDate = dateFormat.format(date);
		return currDate;
	}

}
