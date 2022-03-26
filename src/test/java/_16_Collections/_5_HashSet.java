package _16_Collections;

import java.util.HashSet;

public class _5_HashSet {
public static void main(String[] args) {
	
	HashSet<Integer> marks = new HashSet<>();
	HashSet<String> country= new HashSet<>();
	marks.add(55);
	marks.add(1);
	marks.add(9);
	marks.add(44);
	marks.add(33);
	marks.add(12);
	country.add("mona");
	country.add("sona");
	country.add("Aona");
	country.add("lona");
	country.add("dona");
	country.add("nona");
	
	
	
	System.out.println(marks);
	System.out.println(country);
	for(int e : marks) {
		System.out.print(e%7);
		System.out.print(",");
	}
	
}
}
