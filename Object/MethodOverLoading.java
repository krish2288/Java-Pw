class cal{
    public  int add (int a,int b) {
        int result=a+b;
       return result;
    }
    public  int add (int a,int b,int c) {
        int result=a+b;
        return result;
    }
    public  double add (double a,double b) {
        double result=a+b;
        return result;
    }

}

public class MethodOverLoading {
    public static void main(String[] args) {
        cal obj=new cal();
      int result= obj.add(2,3);
      int res1 = obj.add(7,8,7);
      double res2= obj.add(4.2,3.2);
        System.out.println(result);
        System.out.println(res1);
        System.out.println(res2);
    }
}
