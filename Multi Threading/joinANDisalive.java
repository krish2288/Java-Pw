class output implements java.lang.Runnable {

    public void run()  {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("it start Printing");
                Thread.sleep(2500);
            }
        }
        catch (Exception obj){}
    }
}
public class joinANDisalive {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread Start");
        output o1=new output();
        Thread t1=new Thread(o1);
       t1.start();
        //iaAlive use to check the status of thread is alive or not
        // t1 is in process than it show true.  when t1 is not in process then it show false
        System.out.println(t1.isAlive());
        //t1.start();
        //1st main thread excute then other theard excute
        //when we use join
        t1.join();


        System.out.println("Main Thread End");

    }
}
