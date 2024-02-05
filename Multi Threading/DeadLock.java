//import static java.lang.Thread.currentThread;

import static java.lang.Thread.*;

class Libary implements java.lang.Runnable {
    String res1=new String("Java");
    String res2=new String("Dsa");
    String res3=new String("sql");
    public void run() {
        String name = currentThread().getName();
        try {

            if (name.equals("student1"))
            {
                sleep(3000);
                synchronized (res1)
                {
                    System.out.println("Student1 acc "+res1);
                    sleep(3000);
                    synchronized (res2)
                    {
                        System.out.println("Student1 acc "+res2);
                        sleep(3000);
                        synchronized (res3)
                        {
                            System.out.println("Student1 acc "+res3);
                            sleep(3000);
                        }
                    }
                }

            }
            else
            {
                sleep(3000);
                synchronized (res3)
                {
                    System.out.println("Student2 acc "+res3);
                    sleep(3000);
                    synchronized (res2)
                    {
                        System.out.println("Student2 acc "+res2);
                        sleep(3000);
                        synchronized (res1)
                        {
                            System.out.println("Student2 acc "+res1);
                            sleep(3000);
                        }
                    }
                }
            }
        }
        catch (Exception obj){
            System.out.println("Some problem");
        }
    }
}

public class DeadLock {
    public static void main(String[] args) {
        Libary obj=new Libary();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        t1.setName("student1");
        t2.setName("Student2");
        t1.start();
        t2.start();

    }
}
