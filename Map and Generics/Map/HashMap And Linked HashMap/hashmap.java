import java.util.HashMap;
// In Hashmap order of insertion not prevent
// Key should be  unique
// key can be any type
public class hashmap {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put(1 ,"Rohan");
        hm.put("Sahrma","Aman");
        hm.put(6,"Ramu");
        hm.put(2,"Vijay");
        hm.put(5,"Vijay");

        System.out.println(hm);
    }
}
