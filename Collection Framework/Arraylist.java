

import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(100);
        al1.add(3);
        al1.add(2);
        al1.add(1);
        System.out.println(al1);
        ArrayList al2=new ArrayList();
        al2.addAll(al1);
        al2.add(20);
        al2.add(4,10);
        System.out.println(al2.get(2));
        System.out.println(al2);

    }
}
