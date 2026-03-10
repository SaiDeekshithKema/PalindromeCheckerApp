import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PalindromeStrategy strategy = new StackStrategy();

        System.out.println("Enter a word : ");
        String wrd = sc.nextLine();

        PalindromeService ps = new PalindromeService(strategy);

        boolean isPalindrome = ps.checkPalindrome(wrd);

        System.out.println("Input : " + wrd);
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}

class PalindromeService {

    private PalindromeStrategy strategy;

    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.check(input);
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        if (input == null)
            return false;

        String cleanedInput = input.toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : cleanedInput.toCharArray()) {
            stack.push(c);
        }

        for (char c : cleanedInput.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}