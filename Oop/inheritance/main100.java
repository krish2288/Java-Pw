class Human100
{
   // private String name ;
     int age;
    void sleep()
    {
        age=20;
       // name="sdfnhsbv";
        System.out.println(age);
        System.out.println("Six Hour");
    }
     Human100(){
         System.out.println("hh");
     }

}
class Student90 extends Human100
{
        void dis() {
            System.out.println(age);
            // System.out.println(name);
    }
}


public class main100 {
    public static void main(String[] args) {

        Student90 st=new Student90();
        st.sleep();
    }
}
