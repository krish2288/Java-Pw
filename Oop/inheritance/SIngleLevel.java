
class Animal
{
    void water(){
        System.out.println("Without water animal not survie");
    }
}

class Monkey extends Animal
{

}

public class SIngleLevel {
    public static void main(String[] args) {
        Monkey m=new Monkey();
        m.water();
    }
}
