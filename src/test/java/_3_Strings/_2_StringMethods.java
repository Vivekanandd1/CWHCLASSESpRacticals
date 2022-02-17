package _3_Strings;

public class _2_StringMethods {
public static void main(String[] args) {
	// making a string to lowercase
	String Name = "My Name Is Deshmukh";
	Name = Name.toLowerCase();
	System.out.println(Name);
	
	//replacment of word/whitespace
	String text = "My name Is vivek";
	text = text.replace(" ", "_");
	System.out.println(text);
	
	//printing the length of string
	int value = Name.length();
	System.out.println(value);
	
	//making a string in uppercase
	String Letter = "i am human";
	Letter = Letter.toUpperCase();
	System.out.println(Letter);
	
	//making a String to trim
	String Dash = "    vivek     ";
	System.out.println(Dash);
	Dash = Dash.trim();
	System.out.println(Dash);
	
	//getting susbtring by index
	Name = Name.substring(3);
	System.out.println(Name);
	
	//Getting substring by start index and end index
	Name = Name.substring(3, 12);
	System.out.println(Name);
	
	//Boolean Chekc
	System.out.println(Dash.startsWith("vi"));
	System.out.println(Dash.startsWith("tdd"));
	System.out.println(Dash.endsWith("ek"));
	
	//checking charter at particular index
	String palindrome = "vivekeviv";
	System.out.println(Dash.charAt(0));
	System.out.println(Dash.indexOf('i'));
	System.out.println(palindrome.indexOf("viv"));
	System.out.println(palindrome.indexOf("viv", 6));
	
	//comparison of string
	String Name1 = "Tej";
	System.out.println(Name1.equals("tej"));
	System.out.println(Name1.equalsIgnoreCase("tej"));
	
	//Escape Sequence
	System.out.println("hi i am here \t for you");
	System.out.println("hi i am here \n for you");
	System.out.println("hi i am here \r for you");
}
}
