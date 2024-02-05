import java.util.*;
class guessergame{

    void umpire22 (){
         Scanner sc=new Scanner(System.in);
        System.out.println("Start");
         int guesser=sc.nextInt();

        System.out.println("Player 1");
        int Player1=sc.nextInt();
        System.out.println("Player 2");
        int Player2=sc.nextInt();
        System.out.println("Player 3");
        int Player3= sc.nextInt();
        if(guesser==Player1){
            System.out.println("Player1 won");
        }
        else if(guesser==Player2) {
            System.out.println("Player2 won");
        }
        else if(guesser==Player3){
            System.out.println("Player3 won");
        }
        else {
            System.out.println("game over");
        }
    }
}
public class Main1 {

    public static void main(String[] args) {
       guessergame obj= new guessergame();
        obj.umpire22();
    }
}