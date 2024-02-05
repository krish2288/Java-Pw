public class main {
    public static void main(String[] args) {
        int a=6;
        int b=0;
        int result=0;
        try
        {
            result=a/b;
        }
        catch (Exception obj){
            System.out.println("Something Wrong "+obj);
        }
        System.out.println(result);
        System.out.println("All thing is right");

    }
}
