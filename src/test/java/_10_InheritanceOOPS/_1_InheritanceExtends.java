package _10_InheritanceOOPS;

import _7_Methods._7_PrivateClass;

class parent extends _7_PrivateClass{
	int x;

	public int getX() {
		System.out.println("this is parent class subordinates");
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
}
class child extends parent{
	int y;

	public int getY() {
		System.out.println("this is child class");
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}

public class _1_InheritanceExtends {
	public static void main(String[] args) {
		parent P = new parent();
		child C = new child();
		grand G = new grand();
		P.setX(45);
		System.out.println(P.getX());
		C.setX(46);
		System.out.println(C.getX());
		//P.setY(56);//here we'll get error cos parent class cant inherite.
		C.setY(47);
		System.out.println(C.getY());
		G.setX(48);
		System.out.println(G.getX());
		G.setY(49);
		System.out.println(G.getY());
		G.setZ(50);
		System.out.println(G.getZ());
	}

}
