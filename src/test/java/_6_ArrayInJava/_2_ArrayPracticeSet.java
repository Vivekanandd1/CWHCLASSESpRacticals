package _6_ArrayInJava;

import java.util.Iterator;

import javax.swing.text.Element;

public class _2_ArrayPracticeSet {
	public static void main(String[] args) {
		//1.Create an array of 5 floats and calculate their sum.
//		float[] degree = {5.1f,6.2f,11.5f,9.2f,11.2f};
//		float sum  = 0.0f;
//		for(float elements :degree) {
//			sum = sum+elements;
//		}
//		System.out.println(sum);
		
		//2.Write a program to find out whether a given integer is present in an array or not.
//		int[] arr = {7,11,66,8,92};
//		int num = 65;
//		boolean isinarr = false;
//		for(int element:arr) {
//			if(num==element) {
//				isinarr = true;
//				break;
//			}
//		}
//		if(isinarr==true) {
//			System.out.println("arry in list");
//		}
//		else {
//			System.out.println("arr is not in list");
//		}
		
		//3.Calculate the average marks from an array containing marks of all students in physics using a for-each loop
		
//		int[] physics = {67,88,92,57,62};
//		int sum = 0;
//		for (int elemnt:physics) {
//			sum = sum + elemnt;
//		}
//		System.out.println("the sum is "+sum);
//		float avrage = sum/physics.length;
//		System.out.println("avrage is :" + avrage);
		
//		//4.Create a Java program to add two matrices of size 2x3.
//		int[][] mat1 = {{1,2,3},{8,7,6}};
//		int[][] mat2 = {{4,5,6},{2,5,7}};
//		int[][] resulting = {{0,0,0},{0,0,0}};
//		
//		for(int i =0;i<mat1.length;i++) {//row number of times
//			for(int j =0;j<mat1[i].length;j++) {//column number of times
//				System.out.printf("setting value of %d and %d \n",i,j);
//				resulting[i][j] = mat1[i][j]+mat2[i][j];
//				
//			}
//			
//		}
//		for(int i =0;i<mat1.length;i++) {//row number of times
//			for(int j =0;j<mat1[i].length;j++) {//column number of times
//				System.out.print(resulting[i][j]+" ");
//				resulting[i][j] = mat1[i][j]+mat2[i][j];
//			}
//			
//		System.out.println("");
//	     }
//		
		//Write a Java program to reverse an array.
//		int[] marks = {67,34,35,62,73};
//		int l = marks.length;
//		int n = Math.floorDiv(l, 2);
//		int temp;
//		for(int i=0;i<n;i++) {
//			temp = marks[i];
//			marks[i] = marks[l-i-1];
//			marks[l-i-1]  = temp;
//			}
//		for(int element:marks) {
//			System.out.println(element);
//		}
		
		//6.Write a Java program to find the maximum element in an array.
//		int[] marks = {67,34,335,62,73};
//		int max = 0;
//		for(int e:marks) {
//			if(e>max) {
//				max = e;
//			}
//		}System.out.println(max);
		
		//6.Write a Java program to find the minimum element in an array.
		int[] marks = {67,34,335,62,73,6};
		int min=Integer.MAX_VALUE;
		//System.out.println(min);
		for(int e:marks) {
			if(e<min) {
				min = e;
			}
		}
		System.out.println(min);
 }
}
