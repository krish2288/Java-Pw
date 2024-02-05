
class outer1{
    public void show(){
        System.out.println("Show");
    }

  static class inner1{
        public void dis(){
            System.out.println("Display");
        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {

        outer1 obj = new outer1();
        outer1.inner1 obj1 = new outer1.inner1();
        obj.show();
        obj1.dis();
    }
}
