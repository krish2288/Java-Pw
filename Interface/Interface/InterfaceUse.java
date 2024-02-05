interface computer{
   void code();
}

class Laptop implements computer {
    public void code(){
        System.out.println("it can run code");
    }
}

class Desktop implements computer
{
    public void code(){
    System.out.println("it Can run code faster");
}
}

class Developer{
    public void buildApp(computer start){
        System.out.println("app build");
        start.code();
    }
}
public class InterfaceUse {
    public static void main(String[] args) {
        Developer Dev=new Developer();
       computer Lap=new Laptop();
       computer Desk=new Desktop();
       Dev.buildApp(Desk);

    }
}