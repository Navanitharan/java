public class Main{
    public static void main(String ar[]){
    String s="navani";
    System.out.println(s.toUpperCase());
    for(int i=0;i<s.length();i++){
        char temp =s.charAt(i);
        System.out.print(Character.toUpperCase(temp));
        
        }
        System.out.println();
        
        for(int k=0;k<s.length();k++){
            char ch=s.charAt(k);
            if(k%2==0){
                
                System.out.print(Character.toUpperCase(ch));
            }
            else{
                System.out.print(ch);
            }
        }
        for(int l=97;l<122;l++){
            System.out.println();
            System.out.print((char)l+" "+((char)(l-32)));
        }
    }
    
    }
