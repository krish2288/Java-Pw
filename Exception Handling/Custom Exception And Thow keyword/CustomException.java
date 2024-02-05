class MyException extends Exception
{
    public MyException(){

    }
    public MyException(String msg){
        super(msg);
    }
}
public class CustomException {
    public static void main(String[] args) {
        int num=4;
        int x=-2;
        try {
            if (x < 0) {
                Exception e=new MyException("please inter postive value");
                throw e;
            }
            else {
                int result = num / x;
                System.out.println(result);
            }
        }
        catch(Exception obj){
            System.out.println("Enter Correct number  " +obj);
        }
    }
}
