package _18_MapHashMap;

import java.util.HashMap;

public class Maps {
	
	public static void main(String[] args) {
		HashMap<String, Integer> empid = new HashMap<>();
		empid.put("Vivek", 1201);
		empid.put("Desh",1202);
		empid.put("Sam", 1203);
		
		System.out.println(empid);
		
		System.out.println(empid.get("Sam"));
		
		empid.remove("Desh");
		
		System.out.println(empid);
	}

}
