package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExamples {
	
	public static void main(String[] args) {
		Printer<Integer,Integer> printer = new Printer<>(23,23);
		printer.Print();
		
		
		Printer<Double,Double> Doubleprinter = new Printer<>(23.23,23.33);
		Doubleprinter.Print();
		
		Printer<String,String> StringDoubleprinter = new Printer<>("Twenty Three","Twenty Three");
		StringDoubleprinter.Print();
		
		shout(23,23);
		shout(23.3,23.3);
		shout("Twenty Three","Twenty Three");
		
		List<Integer> IntList = new ArrayList<>();
		IntList.add(5);
		IntList.add(7);
		PrintList(IntList);
		
		List<String> CatList = new ArrayList<>();
		CatList.add("Puss");
		CatList.add("Daisy");
		PrintList(CatList);
 
		
	}
	
//	@SuppressWarnings("unused")
	private static <T,V> void shout (T ThingsToShout ,V OtherThings) {
		System.out.println(ThingsToShout + "  !!!!!!!!!!!!!!");
		System.out.println(OtherThings + "  ??????/");
	}
	
	private static  void PrintList (List<?> MyList) {
	System.out.println(MyList);	
	}

}
