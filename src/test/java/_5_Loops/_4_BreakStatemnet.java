package _5_Loops;

public class _4_BreakStatemnet {
	public static void main(String[] args) {
		
	
	
	//Break
	//1.For Loop
//	for(int i=0;i<=10;i++) {
//		System.out.println(i);
//		System.out.println("java learning");
//		if (i==3) //here if condtion got match it will break the loop
//		{
//			break;
//		}
//	}	
	
//		//2.While Loop
//		int i = 0;
//		while(i<=9) {//here it will run till the value of i is equal or greater than than 0
//			
//			System.out.println(i);
//			System.out.println("java learning");
//			
//			if(i==3) {//in between if i value is equal to 3 it will print bel0w loop
//				System.out.println("loop end");
//				break;
//			}
//			i++;
//			
//		}
//		
		//3.Do While Loop
		int i = 0;
		do {
			System.out.println(i);
			System.out.println("do while loop");
			i++;
			if(i==4) {
				System.out.println("loop ends here");
				break;
			}
		}
		while(i<=10);

		
	
	}
}
