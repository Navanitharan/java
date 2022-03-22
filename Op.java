import java.util.Scanner;
public class Op{
    public static void main(Pattern ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value :");
        int a=sc.nextInt();
        System.out.println("Enter the value :");
        int b=sc.nextInt();
        System.out.println("Enter the value :");
        int c=sc.nextInt();
        if(a!=b && b!=c && c!=a  && a+b+c==180 && a < 90 && b < 90  && c < 90){
            System.out.println("Prize 1");
        }
        else if((a == 90 || b == 90  || c == 90)  &&  (a+b+c==180)){
            System.out.println("Prize 2");
        }
        else if(a==b && b==c && c==a  &&  (a+b+c==180)){
            System.out.println("prize 3");
        }
        else{
            System.out.println("No prize");
        }
    }
}