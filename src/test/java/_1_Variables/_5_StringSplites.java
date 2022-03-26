package _1_Variables;

public class _5_StringSplites {
	
	public static void main(String[] args) {
		 String S1 = "james bond 007";
		 String S = "     james";
		 String M = "vivekanand";
//		 String[] splits = S.split(" ");
//		 System.out.println(splits[2]);
//		 System.out.println(splits[1]);
//		 System.out.println(splits[0]);
		 System.out.println(S.trim());//to remove whitespace
		 System.out.println(S.length());
		 for(int i = 0;i<S.length();i++) {System.out.println(S.charAt(i));}
		 for(int i = M.length()-1;i>=0;i--) {System.out.println(M.charAt(i));}//reversing a String
 	}

}
