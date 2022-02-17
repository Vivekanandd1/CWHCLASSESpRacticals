package _7_Methods;

public class _2_MethodWithVariables {
	
	static int a = 5;//static variable
	 public void sup() {
		 int b = 8;//local variable
		 System.out.println(b);
	 }
	 static void change(int[] arr) {
		 arr[0] = 94;
	 }
	 public static void main(String[] args) {
		int c=15;//instance variable
		System.out.println(c);
		System.out.println(a);
		_2_MethodWithVariables ds = new _2_MethodWithVariables();
		ds.sup();
		
		int[] marks = {67,56,54,94,91};
		change(marks);
		System.out.println(marks[0]);
	}

}
