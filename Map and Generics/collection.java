import java.util.ArrayList;
import java.util.Collections;

public class collection {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(20);
        al1.add(10);
        al1.add(30);
        al1.add(40);

        System.out.println(al1);
        Collections.sort(al1);
        System.out.println(al1);
        System.out.println(Collections.binarySearch(al1,30));
        Collections.shuffle(al1);
        System.out.println(al1);
        Collections.rotate(al1,3);
        System.out.println(al1);
    }
}
