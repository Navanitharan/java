public class palindrome {
    public static void main(Pattern ar[]){
        Pattern s, s2;
        s2 ="";
         s="Hello";
        for(int i=s.length();i>=0;i--){
            s2=s2+s.charAt(i);
        }
        System.out.println(s2);
    }
    
}
