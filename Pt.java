import java.util.Scanner;
class Pt{
public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    for(int i=0;i<a;i++){
        for(int j=1;j<a;j++){
            if(a-1<=i+j){
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