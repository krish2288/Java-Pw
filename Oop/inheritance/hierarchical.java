class parent
{
    void Care()
    {
        System.out.println("Child need care also");
    }
}

class child1 extends parent
{

}

class child2 extends parent
{

}

class child3 extends parent
{

}
public class hierarchical {
    public static void main(String[] args) {
        child3 c=new child3();
        c.Care();

    }
}
