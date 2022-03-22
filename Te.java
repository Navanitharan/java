import java.util.*;
public class Te{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int a[]=new int[a];
        for(int i=0;i<a;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
    
}
