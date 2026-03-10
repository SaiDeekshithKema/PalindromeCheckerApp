import java.util.*;

public class PalindromeCheckerApp {

    private static boolean check(String s, int start, int end) {
        if (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            else
                return check(s, start + 1, end - 1);
        }
        else
            return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");

        String wrd = sc.nextLine();
        String normalized = wrd.replaceAll(" ", "").toLowerCase();

        boolean isPalindrome = check(normalized, 0, normalized.length() - 1);

        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("word is Palindrome");
        else
            System.out.println("word is not Palindrome");

        sc.close();
    }
}