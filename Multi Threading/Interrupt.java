class output1 implements java.lang.Runnable {

    public void run()  {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("it start Printing");
                Thread.sleep(2500);
            }
        }
        catch (Exception obj){
            System.out.println("code is intruppted");
        }
    }
}
public class Interrupt {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread Start");
        output o1=new output();
        Thread t1=new Thread(o1);
        t1.start();
       t1.interrupt();

        System.out.println("Main Thread End");
    }
}
