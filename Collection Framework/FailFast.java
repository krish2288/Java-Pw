

    import java.util.*;

    public class FailFast {
        public static void main(String[] args)
        {
            ArrayList a=new ArrayList();
            a.add(10);
            a.add(20);
            a.add(30);
            a.add(40);
            a.add(50);

            Iterator al1=a.iterator();

// it fail fast When we use iterator
            // when we use loop then loop is infinite
            while (al1.hasNext())
            {
                System.out.print(al1.next()+" ");
                a.add(70);
            }


        }
    }


