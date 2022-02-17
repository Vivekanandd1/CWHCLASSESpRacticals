package _2_Operators;

public class _7_RelationalAndLogicalOperators {
	
	public static void main(String[] args) {
		
		System.out.println("here is example of AND operator");
		boolean x = true;
		boolean y = true;
		boolean z = false;
		//AND operator is symbolize by "&&"
		if (x && y && z)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
		
		System.out.println("here is example of OR operator");
		//OR operator symbolize by ||
		if (x||y||z)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		System.out.println("here is exmaple of NOT operator");
		//NOT operator symbolize by ! here false becomes true and true becomes false
		if (!y)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
	}
	
	

}
