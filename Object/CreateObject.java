public class CreateObject {
    int a;
    String name;
    public static void main(String[] args) {
        // Declare Object
        // Create Object
        int num =9; //primitive
        CreateObject obj1 = new CreateObject(); // reference
       CreateObject obj2=new CreateObject();
       obj1.name="Rahul";
        System.out.println(obj1.name);
        System.out.println(obj1.a);
        System.out.println(obj2.name);
        System.out.println(obj2.a);
    }
}