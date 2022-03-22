
import java.util.*;
public class Stringpalindrome{
    public static void main(String ar[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the String");
        String a=sc.nextLine();
       String rev="";
       for(int i=a.length()-1;i>=0;i--){
           rev=rev+a.charAt(i);
           //System.out.println(rev);
       }
       if(a.equals(rev)){
           System.out.println("Palindrome");
       }else{
           System.out.println("Not Palindromema");
       }
    }
}