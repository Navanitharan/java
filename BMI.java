import java.util.*;
public class BMI {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        double h=sc.nextDouble();
        double w=sc.nextDouble();
        bmi(h,w);
        
    }
    static void bmi(double h,double w){
        double height=h*h;
        String str="";
        double res=(w/height)*10000;
        if(res<18.5){
            str="lean";
        }
        else if(res>=18.5 && res<=24.9){
            str="Healthy";
        }
        else if(res>=25.0 && res<=29.9){
            str="overweight";
        }
        else{
            str="obese";
        }
        System.out.printf("%.2f",res);
        System.out.println("\nThe person is "+str);
    }
}
