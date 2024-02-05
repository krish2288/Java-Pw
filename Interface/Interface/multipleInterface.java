
interface A{
    void show();
}

interface B{
    void dis();
}

class X implements A,B
{
   public void show()
    {
        System.out.println("in Show");
    }
    public void dis(){
        System.out.println("In dis");
   }
}


public class multipleInterface {
    public static void main(String[] args) {
        X obj=new X();
        obj.dis();
    }
}
