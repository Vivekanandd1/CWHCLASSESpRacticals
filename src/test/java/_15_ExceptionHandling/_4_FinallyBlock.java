package _15_ExceptionHandling;

public class _4_FinallyBlock {
	
//	public static int meth() {
//		try {
//			int a = 50;
//			int b = 10;
//			int c = a/b;
//			return c;
//		}
//		catch(Exception e) {System.out.println("this is exception "+e);}
//		finally{
//		System.out.println("this need to be execute");
//			
//		}
//		return -1;
//	}
	public static void main(String[] args) {
//		int k = meth();
//		System.out.println(k);
		int a = 18;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }

        try{
            System.out.println(50.0/3);
        }
        finally {
            System.out.println("Yes this is finally");
        }
	}

}
