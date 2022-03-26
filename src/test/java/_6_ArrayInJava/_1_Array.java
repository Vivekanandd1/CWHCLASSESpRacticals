
package _6_ArrayInJava;

public class _1_Array {
	public static void main(String[] args) {
		 //There are three method to create array in java
		//1.Declearation and assignment
		int[] marks;
		marks = new int[5];
		//2. declaration  and assignment same time
		int[] class1 = new int[6];
		//3 declaration  and assignment same time and initialisation at same time.
		int[] verson = {67,46,656,345,33};
		verson[2] = 45;
		System.out.println(verson[2]);
		
		
		//checking lenth of an array
		System.out.println(verson.length);
		System.out.println("printing element____________");
		
		for(int element:verson) {
			System.out.println(element);
		}
		
	}
 
}
