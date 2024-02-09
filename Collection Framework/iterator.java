import java.util.*;

public class iterator {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        Iterator al1=a.iterator();
        while (al1.hasNext())
        {
            Integer I=(Integer) al1.next();
            System.out.print(I+" ");
        }

    }
}
