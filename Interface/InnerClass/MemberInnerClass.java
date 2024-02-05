class outer{
    public void show(){
        System.out.println("Show");
    }

    class inner{
        public void dis(){
            System.out.println("Display");
        }
    }
}
public class MemberInnerClass {
    public static void main(String[] args) {
        outer obj=new outer();
        outer.inner obj1=obj.new inner();
        obj.show();
        obj1.dis();

    }
}
