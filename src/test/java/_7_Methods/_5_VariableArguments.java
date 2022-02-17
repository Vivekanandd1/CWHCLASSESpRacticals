package _7_Methods;

public class _5_VariableArguments {
	
	public int sumup(int a,int ...arr) {//the left syntax is for variable argument as we dont have to made method for each expression
		int sum =a;
		for (int el:arr) {
			sum += el;
		}
		return sum;
	}
public static void main(String[] args) {
	_5_VariableArguments ds = new _5_VariableArguments();
	System.out.println(ds.sumup(5,18,32));
}
}
