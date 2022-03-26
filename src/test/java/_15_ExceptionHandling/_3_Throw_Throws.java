package _15_ExceptionHandling;
class NegativeRadius extends Exception{//custom exception for area class
	public String  toString() {
		return "Radius can't be Negative";
	}
	public String getMessage() {
		return "cant be negative";
	}
}

public class _3_Throw_Throws {
	public static double area(int r) throws NegativeRadius {
		if(r<0) {
			throw new NegativeRadius();
		}
		double area = Math.PI*r*r;
		System.out.println(area);
		return area;
	}
   public static int divide(int a,int b) throws ArithmeticException {
	   int result = a/b;
	   System.out.println(result);
	   return result;
	   
   }
   public static void main(String[] args) throws NegativeRadius {
//	try {
//		divide(6, 2);
//		System.out.println("this is it");
//	}   
//	catch(Exception e) {
//		System.out.println("we are getting this exception");
//		System.out.println(e);
//	}
	   
		try {
		area(-1);
		System.out.println("this is it");
	}   
	catch(Exception e) {
		System.out.println("we are getting this exception");
		System.out.println(e);
	}
	   
	
}
}
