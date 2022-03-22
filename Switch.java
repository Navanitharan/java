import java.util.*;
public class Switch {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int a, b, c, ch;
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choice :");
        ch=sc.nextInt();
        System.out.println("Enter 2 Nos :");
        a=sc.nextInt();
        b=sc.nextInt();
        switch (ch)
        {
         case 1:
         	c=a+b;
             System.out.println("Addition :"+c);
             break;
         case 2:
         	c=a-b;
             System.out.println("Subtraction :"+c);
             break;
         case 3:
         	c=a*b;
             System.out.println("Multiplication :"+c);
             break;
         case 4:
         	c=a/b;
             System.out.println("division :"+c);
        }
    }
}

