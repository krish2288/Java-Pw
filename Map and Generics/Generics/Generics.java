import java.util.ArrayList;

public class Generics {
    //type saftey achive by using generics
    public static void main(String[] args) {
        ArrayList <String>al1=new ArrayList<String>();
        al1.add("Rohan");
        al1.add("Tusha");
        al1.add("Atul");
        al1.add("Sakshi");

        System.out.println(al1);

        String name1= al1.get(0);
        System.out.println(name1);
    }
}
