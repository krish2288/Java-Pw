import java.util.HashMap;
import java.lang.*;
import java.util.WeakHashMap;

class Student1{
    private String name;
    private int age;
    public Student1(String name,int age){
        this.name=name;
        this.age=18;
    }
    public String toString(){
        return age+"";
    }
    @Override
    public void finalize(){
        System.out.println("Working");
    }
}
public class WeakHashMapVSHashMap {
    public static void main(String[] args) {
        Student1 st1=new Student1("Rohan",18);

        // Hashmap deminating grabage collector

//        HashMap hm1=new HashMap();
//        hm1.put(st1,"Rohan");
//        System.out.println(hm1);
//        st1=null;
//        System.gc();
//        System.out.println(hm1);



        // Weak hash map not demonating grabage collector
        WeakHashMap whm1=new WeakHashMap();
        whm1.put(st1,"Rhohan");
        System.out.println(whm1);
        st1=null;
        System.gc();// invoking grabage collector
        System.out.println(whm1);

    }
}
