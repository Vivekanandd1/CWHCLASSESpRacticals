package _7_Methods;

class Phone{
	public void Greet() {
		System.out.println("hello!");
	}
	
	public void TurnOn() {
		System.out.println("Booting Up the Phone");
	}
}

class SmartPhone extends Phone{
	public void WCScreen() {
		System.out.println("WelCome Home Sir");		
	}
	
	public void TurnOn() {
		System.out.println("Booting Up The SmartPhone");
	}
}

public class _8_DynamicMethods {
	public static void main(String[] args) {
		Phone ph = new Phone();
		Phone sp = new SmartPhone();//this is the dynamic method object
		SmartPhone ap = new SmartPhone();
		
		//SmartPhone dc = new Phone();//not possible due to superclass and subclass inherintance
		sp.Greet();
		ph.TurnOn();
		sp.TurnOn();
		ap.WCScreen();
	}

}
