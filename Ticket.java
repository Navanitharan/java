import java.util.Scanner;
public class Ticket {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(b<=50){
            System.out.println( a * b );
        }
        else if(b>=50 && b<=100){
            System.out.println((a*b) - (b*10));
        }
        else if(b>=101 && b<=200){
            System.out.println((a*b) - (b*20));
        }
        else if(b>=201 && b<=400){
            System.out.println((a*b) - (b*30));
        }
        else if(b>=401 && b<=500){
            System.out.println((a*b) -(b*40));
        }
        else if(b>500){
            System.out.println((a*b) - (b*50));
        }
    }    
}
