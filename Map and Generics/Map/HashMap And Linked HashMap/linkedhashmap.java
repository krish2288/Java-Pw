import java.util.*;
//It prevent order of insertion
public class linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap lhm=new LinkedHashMap();
        lhm.put(1 ,"Rohan");
        lhm.put("Sharma","Aman");
        lhm.put(6,"Ramu");
        lhm.put(4,"Vijay");
        lhm.put(5,"Vijay");

        System.out.println(lhm);
    }
}
