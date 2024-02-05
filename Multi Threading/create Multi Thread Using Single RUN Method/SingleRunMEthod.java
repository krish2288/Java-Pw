import java.util.Scanner;

class SingleRun extends Thread{
    public void run() {
        String tName= currentThread().getName();
       // System.out.println(tName);
        if (tName=="calc"){
            calc();
        }else {
            mess();
        }
    }

public void calc() {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    try {
        int res = n1 / n2;
        System.out.println(res);
    } catch (ArithmeticException obj) {
        System.out.println("Inter Valid Number");
    }
}

    public void mess() {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Focus on your study");
                sleep(2700);
            }
        }
        catch (Exception obj)
        {

        }
    }
}




public class SingleRunMEthod {
    public static void main(String[] args) {
      SingleRun t1=new SingleRun();
      SingleRun t2=new SingleRun();
      t1.setName("calc");
      t2.setName("mess");
        t1.start();
        t2.start();


    }
}
