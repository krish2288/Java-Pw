

class Student {
    private int age;
    private String name;

    Student(int age,String name){
        this.age=age;
        this.name=name;
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }
}

public class Constructor {
    public static void main(String[] args)
    {
        Student st1=new Student(18,"rahul");
        int age=st1.getAge();
        System.out.println(age);
    }
}