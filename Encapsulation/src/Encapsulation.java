class Student100 {
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void show (){
        System.out.println(age+" "+name);
    }
}

public class Encapsulation {
    public static void main(String[] args)
    {
        Student100 obj1=new Student100();
        Student100 obj2=new Student100();
        obj1.setAge(25);
        obj2.setAge(18);
        obj1.setName("Rahul");
        obj2.setName("Vinod");
       int st1= obj1.getAge();
       System.out.println(st1);
      //  obj1.show();
       // obj2.show();
    }
}