package com.ashu.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateAndTime {
	public static void main(String[] args) throws Exception {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String strDate = sdf.format(cal.getTime());
		System.out.println("Current day and time is: " + strDate);
	}
}
