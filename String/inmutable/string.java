public class string {
    public static void main(String[] args) {
        // String refers to inmutable means unchanged
        String name="Krish";
        System.out.println(name);
        name.concat("Singh");
        //it cann't changed
        System.out.println(name);

        // StringBuilder refers to mutable means we can change string
        StringBuilder name1=new StringBuilder("Krish");
        System.out.println(name1);
        name1.append(" Singh");
        // append to add
        //it changed
        System.out.println(name1);
    }
}
