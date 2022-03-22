import java.util.Scanner;
public class Insurance {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Marital Status M/U :");
        char a=sc.next();
        if(a=="M" || a=="m") {
            System.out.println("You Are Eligible For Insurance :");
        }
        else if(a=="U" || a=="u"){
            System.out.println("Enter You Gander :");
            char gender=next().charAt(0);
            System.out.println("Enter You Age :");
            int age=nextInt();
            if(gender=="M" || gender=="m" && age>=30){
                System.out.println("You Are Eligible For Insurance");
            }
            else // if(gender=="F" || gender=="f" && age>=25)
                {
                System.out.Println("You Are Eligible For Insurance");
            }
        }
        else{
            System.out.println("Invalied Input");
        }
    }
}
