package _16_Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class _2_LinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> L = new LinkedList<>();
		LinkedList<Integer> L1 = new LinkedList<>();
		L1.add(55);
		L1.add(44);
		L1.add(33);
		L.add(2);
		L.add(3);
		L.add(4);
		L.add(5);
		L.add(6);
		L.add(0,1);
		L.set(2, 111);
		L.remove(3);
		L.addAll(0, L1);
		L.addFirst(101);
		L.addLast(1001);
//		L.indexOf(44);
		System.out.println(L.indexOf(44));
		System.out.println(L.contains(55));
//		L.retain(44,55);
		
		for (int i=0;i<L.size();i++) {
			System.out.print(L.get(i));
			System.out.print(" , ");
		}
	}

}
