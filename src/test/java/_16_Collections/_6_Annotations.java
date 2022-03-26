package _16_Collections;

class cls{
	@Deprecated
	public int sum(int a,int b) {
		System.out.println(a+b);
		return a+b;
	}
}

public class _6_Annotations {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		cls c = new cls();
		c.sum(5, 6);
	}

}
