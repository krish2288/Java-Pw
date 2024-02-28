import java.util.*;
import java.util.stream.*;
public class More {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(2, 4, 6, 8, 10, 12, 14);
        Stream<Integer> st1 = l1.stream();
        Stream<Integer> st2 = st1.filter(n -> n % 2 == 0).
                sorted()
                .map(n -> n * 2);
        st2.forEach(n-> System.out.print(n+" "));

    }

}
