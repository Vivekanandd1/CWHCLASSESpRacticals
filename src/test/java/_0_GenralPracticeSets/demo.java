package _0_GenralPracticeSets;

public class demo {
	public int a = 2;
	protected int b = 3;
	 int c = 4;
	private int d =5;
	public demo(){//this is constrcutor
		System.out.println("this one for cnstctr classss");
	}
	
	public void demo1() {//this is method
		System.out.println("this is for method");
		
	}
	public static void main(String[] args) {
		demo a = new demo();//this will print for constructor
		a.demo1();//this will print for method
		System.out.println(1/10);
	}
 
}
class demo1 extends demo{
	
}