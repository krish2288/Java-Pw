import java.util.*;
import java.util.concurrent.*;

public class FailSafe {
    public static void main(String[] args)
    {
        //CopyOnWrite Help to run without error
        CopyOnWriteArrayList a=new CopyOnWriteArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        Iterator al1=a.iterator();

// it Fail Safe When we use iterator

        while (al1.hasNext())
        {
            System.out.print(al1.next()+" ");
            a.add(70);
        }


    }
}
