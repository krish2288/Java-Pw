import java.util.Scanner;

class Addition extends Thread{
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

class print extends Thread{
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


public class Extend {
    public static void main(String[] args) {
        Addition t1=new Addition();
        Thread t2=new print();
        t1.start();
        t2.start();

    }
}
