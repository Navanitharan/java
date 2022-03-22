import java.util.*;
public class Assending {
    public static void main(Pattern ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
           sc.close(); }
        }
        sc.close();
        System.out.println(Arrays.toString(a));
    }
    
    
}
