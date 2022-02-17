package _7_Methods;

public class _3_MethodOverloading {
	//two or more methods can have same name but diffrent parameters.such methods are called
	//overloaded methods. below we having examples of this methods
	
	static void Mo() {
		System.out.println("this one is first method");
	}
	
	static void Mo(int x) {
		System.out.println("this one is second method :" + x);
	}
	static void Mo(int a,int b) {
		System.out.println("this one is third method:" + a);
		System.out.println("this one is third method:" + b);
	}
	public static void main(String[] args) {
		Mo();
		Mo(2);
		Mo(3,4);
	}
	

}
