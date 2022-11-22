package _6_ArrayInJava;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
	
	public static void main(String[] args) {
		
		String[] Friends = new String[4];
		
		String[] Friends1 = {"Nitin","javed","RaviGota","chang","Eleni"};
		
		ArrayList<Integer> List = new ArrayList<>();
		ArrayList<String> List1 = new ArrayList<>(Arrays.asList("Nitin","javed","RaviGota","chang","Eleni"));
		
		System.out.println("Getting data from Array and ArrayList");
		System.out.println(Friends1[3]);
		System.out.println(List1.get(1));
		
		System.out.println("Getting length of Array and ArrayList");
		System.out.println(Friends1.length);
		System.out.println(List1.size());
		System.out.println("Adding data on ArrayList");
		List1.add("Peter");
		System.out.println(List1.get(5));
		System.out.println("Setting data on Array");
		Friends1[0] = "Namdev";
		System.out.println(Friends1[0]);
		
		
	}

}
