package _7_Methods;

class A{
	
	public String name() {
		return "dom";
	}
	
	public void class1() {
		System.out.println("this is from class1");
	}
}
 class B extends A{
	 @Override //if the child class implements the same method present in the parent class again,it known as method overriding
	public void class1(){
		System.out.println("this is from class2 and B");
	}
	
	}	
 

public class _4_MethodOverriding {
public static void main(String[] args) {
	A a = new A();
	B b = new B();
	a.class1();
	b.class1();
	
	
	
}
}


