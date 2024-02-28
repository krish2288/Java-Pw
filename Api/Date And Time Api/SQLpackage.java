import java.sql.Date;
public class SQLpackage {
    public static void main(String[] args) {
        java.util.Date date=new java.util.Date();
        long inmils=date.getTime();
       Date d2=new Date(inmils);
        System.out.println(d2);
    }
}
