package _10_InheritanceOOPS;

class parents{
	
	parents(){
		System.out.println("this is parent class constructor");
	}
	parents(int x){
		System.out.println("this is parent class constrctor with value : " + x);
			}
	}
class childs extends parents{
	childs(){
		System.out.println("this is child classs constructor");
	}
	childs(int x,int y)
	{
		super(x);
		System.out.println("this is child class constructor with value :" + y);
	}
}

class grands extends childs{
	grands(){
		System.out.println("this is grand classs constructor");
	}
	grands(int x,int y,int z)
	{
	   super(x,y);
		System.out.println("this is grand class constructor with value :" + z);
	}
}
public class _2_SuperKeyword {
	public static void main(String[] args) {
//		childs  c = new childs(45,67);
		grands g = new grands(56,78,93);
		
	}

}
