package _11_AbstractClass;

 abstract class dog{
	dog(){
		System.out.println("is barking");
	}

	//public String walk() 
		
	
	//abstract String walk();
		
	
}

 class wlk extends dog{
	public String walk() {
		return "walking slow";
		
	}
	
	
	}

public class _1_AbstractClasses_1 {
	public static void main(String[] args) {
		wlk w = new wlk();
		System.out.println(w.walk());
	}

}
