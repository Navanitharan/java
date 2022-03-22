public class Untitled-2 {
    
}
import java.util.Scanner;
class Main{
    public static void main(String ar[]){
       Scanner sc=new Scanner(System.in);
       String s=sc.nextInt();
       int a=s.indexOf("CES");
       if(a>=0){
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }
    }
}
