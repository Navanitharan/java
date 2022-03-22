import java.util.*;
public class Lettercount {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        char arr[]=new char[n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=str.charAt(i);
            if(arr[i]=='l'){
                count++;
            }
        }
        System.out.println(count);
        }
}
import java.util.*;
public class Lettercount {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int arr[]=new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i);
        }
        for(int j=0;j<str.length();j++){
            for(int k=0;k<str.length();k++){
            if(arr[j]<arr[k]){
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
            }
        }
        }
        for(int l=0;l<str.length();l++){
           System.out.print((char)arr[l]+" ");
        }
        }
}
