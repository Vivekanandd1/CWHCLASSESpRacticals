package _9_ConstrutorC;



class Cylinder {
	int radius;
	int hight;
	public Cylinder(int r,int l) {
		radius = r;
		hight = l;
		System.out.printf("here is data of radius %d and hight %d \n " ,radius,hight );
	}
	public void setradius(int r) {
		radius = r;
		
	}

	public int getradius() {
		return radius;
		
	}
	public void setheight(int l) {
		hight = l;
		
	}
	public int getheight() {
		return hight;
		
	}
	
	public void volume() {
		double v =  (3.14*(radius*radius)*hight);
		System.out.println(v);
	}
	public void surface() {
	double s = (2*(3.14)*radius*hight)+(2*(3.14*(radius*radius)));
	System.out.println(s);
	}
	}

public class _2_PracticeSets {

	
	public static void main(String[] args) {
		
		Cylinder cd = new Cylinder(5,7);
//		cd.setradius(5);
//		cd.setheight(7);
		cd.volume();
		cd.surface();
		System.out.println(cd.getheight());
		System.out.println(cd.getradius());
	}

}
