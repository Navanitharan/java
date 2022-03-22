import java.util.*;
public class Reversestring{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String you want to reverse :");
        String s=sc.next();
        int n=s.length();
        char[] chh=new char[n];
        char[] ch = s.toCharArray();
        int a=0;
        for(int j=n-1;j>=0;j--){
            chh[j]=ch[j];
            a++;
        }
         System.out.print(chh);
    }
}