



class Humans
{
    int age;

    void sleep(){
        System.out.println("Good sleep is important");
        System.out.println(age);
    }
}

class Student1 extends Humans
{

}


public class CombinetwoclassUsingExtends {

        public static void main(String[] args)
        {
            Student1 st=new Student1();
            st.age=18;
            st.sleep();

        }
    }

