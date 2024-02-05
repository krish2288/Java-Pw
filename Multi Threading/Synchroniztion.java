
class car100 implements java.lang.Runnable
{
     public void run() {
         //synchronized keyword use to prevent when multiple treads use single resource
         //at a time single resource use by any one thread
        try {
            System.out.println(Thread.currentThread().getName() + " enter in parking lot");
            Thread.sleep(2000);
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " start a car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " drive a car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " get back to parking lot");
            }
        }
        catch (Exception obj){

        }
    }
}
public class Synchroniztion {
    public static void main(String[] args) {
        car100 c =new car100();
        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);
        t1.setName("Son-1");
        t2.setName("Son-2");
        t3.setName("Son-3");
        t1.start();
        t2.start();
        t3.start();
    }
}
