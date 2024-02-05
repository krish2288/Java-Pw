// "this() method" call other constuctor of same child class
// "super() method" call parents class constructor
class Demo1
{
    Demo1(){

        System.out.println("Parents Class Constructor");
    }
    Demo1(int x, int y){
        this();
        System.out.println("Parameter Parent class");
    }
}
class Demo2 extends Demo1
{
    Demo2(){
        this(10,20);
        System.out.println("Child class Constructor");
    }
    Demo2(int x,int y){
        super(10,20);
        System.out.println("Child class parameter Constructor");
    }

}
public class ThisOrSuper {
    public static void main(String[] args) {
        Demo2 d=new Demo2();
    }
}
