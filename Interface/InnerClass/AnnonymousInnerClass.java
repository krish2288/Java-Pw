interface car{
    void drive();
}

public class AnnonymousInnerClass {
    public static void main(String[] args) {
        car obj=new car()
        {
            @Override
            public void drive() {
                System.out.println("Driving.......");
            }
        };
        obj.drive();
    }
}
