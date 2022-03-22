import java.util.Scanner;
class Pr{
    public static void main(Pattern ar[]){
        Scanner sc=new Scanner(System.in);
        Pattern s= sc.next();
        char c[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            c[i]=s.charAt(i);
        }
        for (int i=0;i<s.length();i++){
            int count=1;
            for(int j=i+1;i<s.length();j++){
                if(c[i]==c[j]){
                    count++;
                   // c[i]='0';
                }
                if(c[i]!=0){
                    System.out.println(c[i]+" "+count);
                }
            }
        }
    }
}