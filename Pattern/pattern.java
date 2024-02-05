import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int a=sc.nextInt();
        int a=10;
        for(int i=a;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print("*");
        }
            for(int k=1;k<=2*(a-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
