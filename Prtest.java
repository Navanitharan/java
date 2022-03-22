import java.util.*;
class Main{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextIn();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b+c=180){
            System.out.println("Prize 1");
        }
        else if(a || b || c==90){
            System.out.println("Prize 2");
        }
        else if(a == b == c){
            System.out.println("Prize 3");
        }
        else((a+b)==130||(b+c)==130){
            System.out.Println("No Prize");
        }
    }
}
