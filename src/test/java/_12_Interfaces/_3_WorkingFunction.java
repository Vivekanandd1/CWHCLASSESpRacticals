package _12_Interfaces;

class CycBrand{
	CycBrand(){
		System.out.println("this is parent class");
	}
}

public class _3_WorkingFunction extends CycBrand implements _1_Bycycle,_2_BycycleHorn{
	public void speedup(int increment) {
		System.out.printf("incread speed by %d \n",+increment);
	}
	 public void Break(int decrement) {
		 System.out.printf("decreas speed by %d and slow the speed",+decrement);
		 }

	 public void hornbike() 
	 {System.out.println("put horn");
	 }
	public void cyclehorn() {System.out.println("put horn for bike");}
	
	 public static void main(String[] args) {
		_3_WorkingFunction WF = new _3_WorkingFunction();
		WF.speedup(7);
//		WF.a = 56;//it cant be changed as it is interface varibale and it is final by default
		System.out.println(a);
	}
}
