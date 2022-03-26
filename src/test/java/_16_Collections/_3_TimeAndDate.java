package _16_Collections;

import java.util.Date;

public class _3_TimeAndDate {
	public static void main(String[] args) {
		//this will print year from1970
		System.out.println(System.currentTimeMillis()/1000/3600/24/365);
		
		Date d = new Date();
	System.out.println(d);
	}

}
