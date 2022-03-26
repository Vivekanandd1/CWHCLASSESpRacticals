package _0_GenralPracticeSets;

class A{
//	public static void Meth1() {
		public  void Meth1() {
		System.out.println("this is from main class");
	}
}

class B extends A{
	
//	public static void Meth1() {
		public void Meth1() {
		super.Meth1();
		System.out.println("this is from child class");
	}
}
public class _6_StringReverse { 
	public static void main(String[] args) {
		B b = new B();
		b.Meth1();
		
	}
}
