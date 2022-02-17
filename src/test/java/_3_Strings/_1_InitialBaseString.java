package _3_Strings;

public class _1_InitialBaseString {
	
	public static void main(String[] args) {
		String name;
		String name1;
		name1 = new String("brian");
		name = "dom";
		String name2 = new String("lita");
		System.out.println(name + "  "+name1 +" " + name2);
		System.out.printf("the name of 1st person is %s and 2nd is %s", name,name1);//it is formated printing
		System.out.println("");
		System.out.format("the name of 1st person is %s and 3rd is %s", name,name2);//the printf and format works in same way
		
	}

}
