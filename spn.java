import java.util.*;
 class First{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<str.length()-1;i++){
            arr.add(str.substring(i, i+2));
            System.out.println(arr);
        }
        int b=0;
        int count=0;
        for(int i=0;i<arr.size();i++){
            int a=Integer.parseInt(arr.get(i)+"");
            System.out.println(a);
            for(int j=1;j<=a;j++){
                if(a%j==0){
                    b=j;
                    System.out.println(b);
                }
                if(str.contains(b+"")){
                    count++;
                   
                }
                
            }
            System.out.println(count);
            System.out.println("===============");
           
        }
        
    }
}