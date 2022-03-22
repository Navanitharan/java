import java.util.Scanner;
public class Ac {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<15){
            System.out.println("Children Ticket");
        }
        else{System.out.println("Adult Ticket");}
    }
}
