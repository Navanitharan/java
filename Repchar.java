import java.util.*;
public class Main{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int a[]=new int[26];
        for(int i=0;i<str.length();i++){
            int b=str.charAt(i)-97;
            a[b]+=1;
            
        }
        System.out.println(Arrays.toString(a));
    }
}
