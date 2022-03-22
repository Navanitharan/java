import java.util.*;
public class Maventic{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        int n=str.length();
        char[] charArray = new char[n];
        for(int i=0;i<n;i++){
            char charStr = str.charAt(i) ;
            int adddedascii = charStr + 2;
            if (adddedascii == 47){
                adddedascii = 45;
            }
            charArray[i] = (char)adddedascii;
        }
        System.out.println(charArray);
    }
}