import java.util.*;
import java.util.stream.*;

public class Basic {
    public static void main(String[] args) {
        List<Integer> ls1=Arrays.asList(1,2,3,4,5,6,7);
        Stream<Integer> st1=ls1.stream();
        //We can only do one operation in one stream
        st1.forEach( i-> System.out.print(i+" "));
        //st1.forEach( f-> System.out.print(f+" "));
    }
}
