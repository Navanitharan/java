import java.util.*;

/**
 * palindrome
 */
public class palindrome {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String();
    }

    static void String() {
        System.out.println("enter your input");
        String str = sc.next();
        String a = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            a = a + c;
            // System.out.println(a);
        }
        System.out.println(a);
        if (str.equals(a)) {
            System.out.println(str + "n is a palindrome");
        } else if (str != a) {
            System.out.println(str + "n is not a palindrome");
        }

    }
}