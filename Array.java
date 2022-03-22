import java.util.*;
public class Main{
    static void result(int arr1[],int arr2[]){
        int count=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==arr2[i]){
                    count++;
                }
            }
            
        }
        if(count==arr2.length){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr1[]=new int[a];
        for(int i=0;i<a;i++){
            arr1[i]=sc.nextInt();
            
        }
        int b=sc.nextInt();
        int arr2[]=new int[b];
        for(int j=0;j<b;j++){
            arr2[j]=sc.nextInt();
                
        }
        result(arr1,arr2);
    }
}
