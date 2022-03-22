import java.util.Scanner;
public class Reverse {
    public static void main(String ar[]){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int i=0;
            while(i=<a.length()){
                int b=a%10;
                a=a/10;
                i++;
            } 
            System.out.println(a);     
    }
}
