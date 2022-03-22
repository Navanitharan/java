import java.util.Scanner;
public class Pattern{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    for(int i=0;i<a;i++){
        for(int j=1;j<a;j++){
            if(i+j<=2 && i+j>=5){
                System.out.print("*");
            } 
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}    
}
