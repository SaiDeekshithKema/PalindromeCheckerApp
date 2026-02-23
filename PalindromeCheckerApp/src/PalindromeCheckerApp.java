import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word : ");
        String wrd=sc.nextLine(),temp = "";
        char[] chars=wrd.toCharArray();
        int start=0;
        int end=chars.length-1;
        while(start<end) {
            if (chars[start] != chars[end]) {
                System.out.println("Not Palindrome");
                System.exit(0);
            }
            start++;
            end--;
        }
        System.out.println("Palindrome");

    }
}