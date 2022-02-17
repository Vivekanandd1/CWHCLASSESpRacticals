package _5_Loops;

public class _3_ForLoops {
	public static void main(String[] args) {
		// printing odd number through for loop
		// 2n  for  even numbers where n can be 0,1,2,3,
		//2n+1 for odd numbers where n can be 0,1,2,3
		
		//incrementing the loop
		
		int n = 5;
		
		for (int i=1;i<=n;i++)
		{
			System.out.println(2*i+1);
		}
		System.out.println("decrement the loop \n");
		//decrementing the loop
		
		int m = 0;
		for(int j=10;j>=m;j--)
		{
			System.out.println(j);
		}
	}

}
