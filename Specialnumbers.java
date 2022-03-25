import java.util.*;

public class Specialnumbers {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < str.length() - 1; i++) {
            arr.add(str.substring(i, i + 2));
        }
        for (int i = 0; i < arr.size(); i++) {
            int a = Integer.parseInt(arr.get(i));
            // System.out.println(a);
            for (int j = 1; j <= a; j++) {
                if (a % j == 0) {
                    System.out.println(j);
                }
            }
            System.out.println("------------");

        }

    }
}
