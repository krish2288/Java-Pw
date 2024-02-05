class burger {
    public void a() throws Exception
    {
        b();
    }

    public void b()throws Exception {
        int a = 4;
        int b = 0;
        int reslut = a / b;
        System.out.println(reslut);
    }
}
public class throwException {
    public static void main(String[] args) {
        burger obj =new burger();
        try {
            obj.a();
        }
        catch (Exception e ){
            System.out.println("wrong");
        }
    }
}
