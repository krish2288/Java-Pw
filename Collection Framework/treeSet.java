import java.util.Collection;
import java.util.TreeSet;

public class treeSet {
    // It use binary tree
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(10);
        ts.add(30);
        ts.add(20);
        ts.add(50);
        ts.add(40);
        System.out.println(ts);
        ts.add(40);
        // it not add reapeted
        System.out.println(ts);

    }
}
