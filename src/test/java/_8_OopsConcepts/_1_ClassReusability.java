package _8_OopsConcepts;

class recta{
	int width;
	int length;
	String name;
	
	
	public int area() {
		return width*length;
	}
	 public int perimetr() {
		 return 2*(length+width);
	 }
	 
	 public void setName(String n) {
		  name = n;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 
}


public class _1_ClassReusability {
	public static void main(String[] args) {
		recta a = new recta();
		a.width=5;
		a.length =7;
		a.setName("sony Vaio");
		//a.name = "den";
		System.out.println(a.getName());
		System.out.println(a.area());
		System.out.println(a.perimetr());
	}

}
