//We use abstract class when method not have body
// we make a abstract class when 1or more than 1 abstract method is here

 abstract class airplane2
{
   abstract void takeoff();
     abstract void fly();

     public void alert(){
         System.out.println("alert");
     }
}

class cargoplane2 extends airplane2
{
    @Override
    void takeoff(){

        System.out.println("it use medium size runway");
    }
    void fly() {

        System.out.println("cargoplane fly in low height");
    }
}

class passengersplane2 extends airplane2
{
    void takeoff(){
        System.out.println("it use long runway ");
    }
    void fly() {
        System.out.println("passengerPlane fly in medium height");
    }
}



public class Abs {
    public static void main(String[] args) {
        airplane2 cp=new cargoplane2();
        airplane2 pp=new passengersplane2();
        cp.fly();
        cp.takeoff();
        pp.fly();
        pp.takeoff();
        cp.alert();
    }

}
