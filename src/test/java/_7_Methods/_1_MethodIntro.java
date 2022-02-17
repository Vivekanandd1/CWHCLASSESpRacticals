package _7_Methods;

public class _1_MethodIntro {
	int a;
	int b;
	int c;
	
	public void add(int a,int b) {//1.this is default method so inovking this you must need object
		c = a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		_1_MethodIntro d = new _1_MethodIntro();//2. here we making object of "add" class 
		d.add(6, 7);
		d.add(27, 45);
		
	}

}
