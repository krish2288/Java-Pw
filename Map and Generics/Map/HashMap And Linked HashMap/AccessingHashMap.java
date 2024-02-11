import java.util.*;
import java.util.Map.*;

public class AccessingHashMap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(1, "Rohan");
        hm.put("Sahrma", "Aman");
        hm.put(6, "Ramu");
        hm.put(4, "Vijay");
        hm.put(5, "Vijay");
        System.out.println(hm.get(4));

        // It is use for accessing only key
        Set sk1=hm.keySet();
        Iterator I2= sk1.iterator();
        while (I2.hasNext()){
            System.out.print(I2.next()+" ");

        }
        System.out.println();


        //collection is use for accessing value
        Collection Cv=hm.values();

        Iterator I3=Cv.iterator();
        while (I3.hasNext()){
            System.out.print(I3.next()+" ");
        }
        System.out.println();

        // entrySet is use for accessing both key and value
        Set s1=hm.entrySet();
        Iterator I1=s1.iterator();
        while (I1.hasNext()){
            //System.out.print(I1.next()+" ");
            Map.Entry Data= (Entry) I1.next();
            System.out.print(Data.getKey()+":"+Data.getValue()+" ");
        }
    }
}
