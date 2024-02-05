//In Java 8 we can bulid method in inteface
//before java 8 we cann't make method in interface

interface C{
    void show();

    default void dis (){
        System.out.println("Dis");
    }
// We call Static method directly we not need a obj of class
    static void Print(){
        System.out.println("Print");
    }
}

class D implements C
{
    public void show(){
        System.out.println("Show");
    }
}

public class Java8Features {
    public static void main(String[] args) {
        C obj=new D();
        obj.show();
        obj.dis();
        C.Print();
    }
}
