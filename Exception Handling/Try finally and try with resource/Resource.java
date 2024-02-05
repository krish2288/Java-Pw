import java.util.InputMismatchException;
import java.util.Scanner;

public class Resource {
    public static void main(String[] args) {
        int num=0;

        try(Scanner sc=new Scanner(System.in);) {
            num = sc.nextInt();
        }
        catch (InputMismatchException obj){
            System.out.println("give input only number");
        }
        System.out.println(num);
    }
}
