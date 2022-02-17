package _9_ConstrutorC;

public class _1_Constructor {
	
	int id;
	String Name;
//	public _1_Constructor() {
//		id = 45;
//		Name = "jdjf";
//		System.out.println(id);
//	System.out.println(Name);
//		
//	}
	public _1_Constructor(String ax,int y) {
		Name = ax;
		id =  y;
		System.out.printf("here is String %s and integer %d \n",Name,id);
		
	}
//	public void setid(int a) { this.id=a;}
//	public int getid() {return id;}
//	public void setName(String ab) { Name = ab;}
//	public String getName() {return Name;}
	
public static void main(String[] args) {
	_1_Constructor DD = new _1_Constructor("Rony",54);//this is callig the constructor 
	_1_Constructor KD = new _1_Constructor("Name",8);
	DD.Name="moad";
	DD.id=56;
	System.out.println();
	
	
	
//	System.out.println(DD.getid());//this is calling the local variable that we set here
//	System.out.println(DD.getName());
//	System.out.println(KD.getid());//this is calling the local variable that we set here
//	System.out.println(KD.getName());
}
}
