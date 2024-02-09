import java.util.*;

public class Listiterator {
    public static void main(String[] args)
    {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        ListIterator al1=a.listIterator(a.size());
        while (al1.hasPrevious())
        {
            Integer I=(Integer) al1.previous();
            System.out.print(I+" ");
        }


    }
}
