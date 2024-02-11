import java.util.*;
import java.util.Map.*;


class Student{
    private String name;
    private int age;
    private String city;

    Student(String name,int age,String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
    public String toString(){
        return name+" "+age+" "+city;
    }

}

public class Hasmap {
    public static void main(String[] args) {
        Student st1=new Student("Rohan",20,"Bhopal");
        Student st2=new Student("Ramesh",18,"Mumbai");
        Student st3=new Student("Rakesh",24,"Pune");

        HashMap hm=new HashMap();
        hm.put(1,st1);
        hm.put(2,st2);
        hm.put(3,st3);

        System.out.println(hm);
        Set s1=hm.entrySet();
        Iterator I1=s1.iterator();
        while (I1.hasNext()) {
            //System.out.print(I1.next()+" ");
            Map.Entry Data = (Entry) I1.next();
            System.out.print(Data.getKey() + ":" + Data.getValue() + " ");
        }

    }
}
