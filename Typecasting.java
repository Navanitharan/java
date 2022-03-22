import java.util.*;
public class Typecasting {
    public static void main(Pattern ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer :");
        int myint=sc.nextInt();
        double mydouble=myint;
        int myint1=(int)mydouble;
        System.out.println(mydouble);
        System.out.println(myint1);
    }
}
