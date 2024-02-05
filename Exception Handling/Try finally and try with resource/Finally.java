import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        int num=0;
        Scanner sc=new Scanner(System.in);
        try {
            num = sc.nextInt();
        }
        catch (InputMismatchException obj){
            System.out.println("give input only number");
        }
        finally {
            sc.close();
        }
        System.out.println(num);
    }
}
