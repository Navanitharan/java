import java.util.Scanner;
public class prime {
    public static void main(Pattern ar[]){
        int  even=0;
        int odd =0;

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++){ 
        a[i] =sc.nextInt();
        if(i%2==0){
            even=even+a[i];
            System.out.print(even);
        }    
        else{
           odd=odd+a[i];
           System.out.print(odd);
        }
    }

    }
    
}
