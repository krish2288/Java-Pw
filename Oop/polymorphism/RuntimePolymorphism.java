

 class airplane1
{
    void takeoff(){
        System.out.println("airplane takeoff");
    }
    void fly(){
        System.out.println("airplane fly ");
    }
}

 class cargoplane1 extends airplane1
{
    @Override
    void takeoff(){

        System.out.println("it use medium size runway");
    }
    void fly() {

        System.out.println("cargoplane fly in low height");
    }
}

class passengersplane1 extends airplane1
{
    void takeoff(){
        System.out.println("it use long runway ");
    }
    void fly() {
        System.out.println("passengerPlane fly in medium height");
    }
}


class fighterplane1 extends airplane1
{
    void takeoff(){
        System.out.println("it use short size runway");
    }
    void fly(){
        System.out.println("Fighter Plane fly in high height");
    }
}

class airport extends airplane1
{
    void poly(airplane1 ref){
        ref.fly();
        ref.takeoff();
        System.out.println("______________________________________________________________________________");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        cargoplane1 cp=new cargoplane1();
        passengersplane1 pp=new passengersplane1();
        fighterplane1 fp=new fighterplane1();
        airport a=new airport();
       a.poly(cp);
       a.poly(pp);
       a.poly(fp);
    }
}
