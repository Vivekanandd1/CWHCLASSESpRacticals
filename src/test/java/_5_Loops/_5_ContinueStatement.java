package _5_Loops;

public class _5_ContinueStatement {
	public static void main(String[] args) {
		//1. For loop
//		 for (int i = 0; i<=10;i++)
//		 {
//			 if (i==3) {
//				 
//				 System.out.println("here we used continue statement");
//				 continue;
//			 }
//			 System.out.println(i);
//			 System.out.println("continue statement");
//			 
//			 
//		 }
		
		//2. While Loop
//		int i = 0;
//		while(i<=9) {
//			
//			System.out.println(i);
//			System.out.println("continue statement in while loop");
//			i++;
//			if(i==4) { //if this condition got matched it will not excute last line of code.
//				System.out.println("continue statemenet");
//				continue;
//				
//			}
//			System.out.println("here we are \n");
//			
//			
//		}
		
		//3.Do While
		int i = 0;
		do {
			System.out.println(i);
			System.out.println("do while loop");
			i++;
			if(i==4) {//if this condition got matched it will not excute last line of code.
				System.out.println("loop ends here");
				continue;
			}
			System.out.println("last do while");
			
		}
		while(i<=10);
		
	}

}
