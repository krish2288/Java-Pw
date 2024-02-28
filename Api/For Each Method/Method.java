import java.util.*;
public class Method {
    public static void main(String[] args) {
        List<Integer> ls=Arrays.asList(1,2,3,4,5);
        System.out.println(ls);

//        for (Integer i:ls) {
//            System.out.println(i);
//        }

        ls.forEach(n-> System.out.println(n));
    }
}
