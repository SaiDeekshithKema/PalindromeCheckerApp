import java.util.*;

public class PalindromeCheckerApp {

    // Recursive method
    private static boolean check(String s, int start, int end) {
        if (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            else
                return check(s, start + 1, end - 1);
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");

        String wrd = sc.nextLine();

        // LinkedList method
        LinkedList<Character> list = new LinkedList<>();

        for (char c : wrd.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("LinkedList Method: Word is Palindrome");
        else
            System.out.println("LinkedList Method: Word is not Palindrome");

        // Recursive method
        boolean recursiveResult = check(wrd, 0, wrd.length() - 1);

        if (recursiveResult)
            System.out.println("Recursive Method: Word is Palindrome");
        else
            System.out.println("Recursive Method: Word is not Palindrome");

        sc.close();
    }
}