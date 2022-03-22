import java.util.*;
public class Sumandaverage{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Limit :");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.println("Enter the number "+i);
            int a=sc.nextInt();
           sum+=a;
        }
        System.out.println("The sum of the "+n+" is :"+sum);
        System.out.println("The Average of the "+n+" is :"+sum/n);
    }
}