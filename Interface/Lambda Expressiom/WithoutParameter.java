
@FunctionalInterface
interface car1{
    void drive();
}
public class WithoutParameter {
    public static void main(String[] args) {
        car1 obj= ()->System.out.println("Driving.......");
        obj.drive();
    }
}
