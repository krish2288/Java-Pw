import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String a=sc.next();
            String b=sc.next();
            String c=sc.next();
            String d=sc.next();
            String e=sc.next();
            String f=sc.next();
            String Wicket="W";
            if(a.equals(b)&&b.equals(c)&&c.equals(Wicket)||b.equals(c)&&c.equals(d)&&d.equals(Wicket)||c.equals(d)&&d.equals(e)&&e.equals(Wicket)||d.equals(e)&&e.equals(f)&&f.equals(Wicket)){
                System.out.print("yes");
            }
            else{
                System.out.print("no");
            }
        }

    }
}
