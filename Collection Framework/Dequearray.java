import java.util.ArrayDeque;

public class Dequearray {
    public static void main(String[] args) {
        ArrayDeque al1=new ArrayDeque();

        al1.add(100);
        al1.add(20);
        al1.add(40);
        al1.add(60);
        al1.add(30);
        al1.add(50);
        System.out.println(al1);
        al1.addFirst(5);
        System.out.println(al1);
        al1.addLast(70);

        System.out.println(al1);
        System.out.println( al1.getFirst()+" "+ al1.getLast());
    }
}
