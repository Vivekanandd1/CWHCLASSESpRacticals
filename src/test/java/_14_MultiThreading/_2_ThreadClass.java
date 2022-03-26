package _14_MultiThreading;

class tst1 extends Thread{
        int r = 50;
    public void run() {
        while(true){
            System.out.println("thread 1 by class 1");
    }
}

}
class tst2 extends Thread{
int c = 50;
    public void run() {
        while(true){
            System.out.println("thread 2 by class 2");
        }

    }
}

public class _2_ThreadClass {
    public static void main(String[] args) {
        tst1 g1 = new tst1();
        tst2 g2 = new tst2();
        g1.start();
        g2.start();
    }
}
