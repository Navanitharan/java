import java.util.Scanner;
public class test {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                if(i==0){
                    System.out.println("*");
                }
                else{
                    System.out.println(" ")
                }
            }
        }
    }
}
