import java.util.Scanner;
public class Leapyear {
  public static void main(String ar[]){
      Scanner sc=new Scanner(System.in);
      int year=sc.nextInt();
      if(year%4==0 || (year%100==0 && year%400==0)){
          System.out.println(year+"is a Leapyear");
      }
      else{
          System.out.println(year+"is not a Leapyear");
      }
  }  
}
