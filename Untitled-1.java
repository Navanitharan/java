public class Untitled-1 {
    
}
import java.util.*;
import java.text.*;

class Main{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.YEAR,y);
        cal.set(Calendar.MONTH,00);
        cal.set(Calendar.DAY_OF_MONTH,01);
        Date df = cal.getTime();
        DateFormat diff = new SimpleDateFormat("EEEEEEEE");
        String day= diff.format(df);
        System.out.println(day);
    }
}
