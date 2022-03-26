package _14_MultiThreading;
class runs1 implements Runnable{
    public void run(){
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
        System.out.println("thread 1 loading............");
     
    }
}
class runs2 implements Runnable{
    public void run(){
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
        System.out.println("thread 2 loading............");
    }
}

public class _1_ThreadByRunableInterface  {
    public static void main(String[] args) {
        runs1 R1 = new runs1();
        Thread t1 = new Thread(R1);
        runs2 R2 = new runs2();
        Thread t2 = new Thread(R2);
        t1.start();
        t2.start();


    }
}
