package Generics;

public class Printer <T,V> {
	
	T ThingToPrint;
	V OtherThings;
	public Printer(T ThingToPrint, V OtherThings ) {
		this.ThingToPrint=ThingToPrint;
		this.OtherThings=OtherThings;
	}

	
	public void Print() {
		System.out.println(ThingToPrint);
	}
}
