import java.util.Arrays;

public class Pangram {
    public static void main(String[] args) {
        int T=0;
        String s1 = "he Quick Fox Brown JUmps Over Lazy Dog";

        s1 = s1.replace(" ", "");

        s1=s1.toUpperCase();

        char arr1[]=s1.toCharArray();
        int arr2[]=new int[26];
        for(char a:arr1){
            arr2[a-65]++;
        }
       for (int b:arr2) {
            if ( b== 0) {
                T++;
            }
        }
        if (T>0){
            System.out.println("it is not pangram");
        }else {
            System.out.println("it is pangram");
        }

    }
}
