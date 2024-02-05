interface car3{
    void drive(int avg,int ts);
}
public class MultipleParameter {
    public static void main(String[] args) {
        car3 obj= (avg,ts) ->System.out.println("Driving......."+avg+" "+ts);
        obj.drive(47,98);
    }
}