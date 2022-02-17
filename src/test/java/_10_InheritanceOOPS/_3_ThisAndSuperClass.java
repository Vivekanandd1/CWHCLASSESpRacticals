package _10_InheritanceOOPS;

class A{
	int a = 10;
}
 class B extends A{
	 int a=20;
	 public void show(int a) {
		 System.out.println(a);
		 System.out.println(this.a);//this keyword will call own class variable
		 System.out.println(super.a);//super keyword will call parent class variable
	 }
 }
public class _3_ThisAndSuperClass {
	public static void main(String[] args) {
		B b = new B();
		b.show(45);
	}
}
