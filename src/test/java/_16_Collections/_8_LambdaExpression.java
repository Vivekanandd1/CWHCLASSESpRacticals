package _16_Collections;
@FunctionalInterface
interface DemoAno{
    void meth1(int a);
}

public class _8_LambdaExpression  {

	public static void main(String[] args) {
		 DemoAno obj = (a)->{System.out.println("I am method 1 from this lambda " + a);};
	        obj.meth1(6);
	}

}
