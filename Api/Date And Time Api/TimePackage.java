import java.time.*;
public class TimePackage {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);
        LocalTime time=LocalTime.now();
        System.out.println(time);
        int D=date.getDayOfMonth();
        int M=date.getMonthValue();
        int Y=date.getYear();
        System.out.println(D+"/"+M+"/"+Y);
    }
}
