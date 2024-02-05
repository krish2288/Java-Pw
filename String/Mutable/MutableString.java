public class MutableString {
    public static void main(String[] args) {
        // StringBuilder/Buffer refers to mutable means we can change string
        StringBuilder name1=new StringBuilder("Krish");
        StringBuffer name2=new StringBuffer("Raj");
        System.out.println(name1);
        System.out.println(name2);
        name1.append(" Singh");
        name2.append(" Singh");

        // append to add
        //it changed
        System.out.println(name1);
        System.out.println(name2);
    }
}
