import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length of the Sequence");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Eneter the Seqence number");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int l=sc.nextInt();
        int ll=l;
        int arr1[]=new int[l];
        System.out.println("Eneter the length of your favourite sequence");
        for(int j=0;j<l;j++){
            arr1[j]=sc.nextInt();
        }
        int count=0;
        for(int k=0;k<l;k++){
            for(int m=0;m<a;m++){
               if(arr1[k]==arr[m]){
                   count=count+1;
               } 
            }
        }
        if(count==ll){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}