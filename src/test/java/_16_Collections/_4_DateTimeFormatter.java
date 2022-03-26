package _16_Collections;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _4_DateTimeFormatter {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
	DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");//dd-MM-yyyy keyword are followed from JavaDocs
	DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
	String Mydate  = dt.format(df2);
	System.out.println(Mydate);
	}

}
