// Three methods is here
// inherited , overridden , specialized
// When child class take method form parent class is called inherited
// when we rebuild method of parent class in child class is called overridden
// when we make new method in child class whick not present in parent class


class airplane
{
    void takeoff(){
        System.out.println("airplane takeoff");
    }
    void fly(){
        System.out.println("airplane fly ");
    }
}

class cargoplane extends airplane
{
    // it is example of overridden
    @Override
    void fly() {
        System.out.println("cargoplane fly in low height");
    }
// it is example of specilaized
    void carry(){
        System.out.println(" Cp carry Goods");
    }
}

class passengersplane extends airplane
{
    void fly() {
        System.out.println("cargoplane fly in medium height");
    }

    void carry(){
        System.out.println("Pp carry passenger");
    }

}

public class TypeOfMethod {
    public static void main(String[] args) {
        cargoplane cp=new cargoplane();
        passengersplane pp=new passengersplane();
        cp.fly();
        cp.takeoff();
        pp.fly();
        pp.takeoff();
        cp.carry();
        pp.carry();


    }
}
