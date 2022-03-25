import java.util.*;
public class Printingletters {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ;
        char alp=' ';
        String num="";
        for(int i=0;i<str.length();i++){
            //res[i]=str.charAt(i);
            char c=str.charAt(i);
            if(!(c>=0 && c<=9)){
                alp=c;
                System.out.println(alp);
            }else{
                num=c+"";
                System.out.println(num);
            }
            int n=Integer.parseInt(num);
            for(int j=0;j<n;j++){
               // System.out.println(alp);
            }
            n=0;
        }
    }
}
