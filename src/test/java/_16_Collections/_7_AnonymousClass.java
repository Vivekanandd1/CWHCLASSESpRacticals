package _16_Collections;
interface Andemo{
	public void meth();
	}
class AnyDemo implements Andemo{ 
	public void meth() {
		System.out.println("this is method");
		}
	}
public class _7_AnonymousClass {
	public static void main(String[] args) {
		AnyDemo Dm = new AnyDemo();
//		Andemo Dm = new AnyDemo();
//		Andemo Dm = new Andemo() {
//			
//			@Override
//			public void meth() {
//				System.out.println("this is method");
//			}
//		};
		Dm.meth();
	}

}
