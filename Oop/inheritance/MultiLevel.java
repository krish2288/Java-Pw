
class grandfather{
    void need(){
        System.out.println("Child need love");
    }
}

class father extends grandfather
{

}

class son extends father
{

}

public class MultiLevel {
    public static void main(String[] args) {
        son s=new son();
        s.need();
    }
}
