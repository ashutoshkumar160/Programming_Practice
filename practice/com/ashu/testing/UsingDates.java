package com.ashu.testing;

import java.util.Calendar;
import java.util.Date;

class UsingDates {
	public static void main(String[] args) {
		 Date now = new Date();
		 //Calendar cal= new Calendar();
		 Calendar cal=Calendar.getInstance();
		String s = String.format("%ta %tb %td", now,now,now);
		System.out.println(cal.getTime());
		
		//System.out.println(s);
	}
}