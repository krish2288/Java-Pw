import java.util.*;
import static java.lang.Thread.*;



class Addition1 implements java.lang.Runnable {
        public void run() {
            Scanner sc = new Scanner(System.in);
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            try {
                int res = n1 / n2;
                System.out.println(res);
            }
            catch (ArithmeticException obj){
                System.out.println("Inter Valid Number");
            }

        }

    }

    class print1 implements java.lang.Runnable {
        public void run() {
            try {
                for (int i = 0; i < 4; i++) {
                    System.out.println("Focus on your study");
                    sleep(2000);
                }
            }
            catch(Exception obj){
            }
        }
    }

public class Runnable {
        public static void main(String[] args) {
            Addition1 n1=new Addition1();
            print1 p1=new print1();
            Thread t1=new Thread(n1);
            Thread t2=new Thread(p1);
            t1.start();
            t2.start();

    }

}
