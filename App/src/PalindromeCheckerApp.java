import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word : ");
        String wrd = sc.nextLine();

        // Basic check using Stack Strategy
        PalindromeStrategy strategy = new StackStrategy();
        boolean isPalindrome = strategy.check(wrd);

        System.out.println("Input : " + wrd);
        System.out.println("Is Palindrome? : " + isPalindrome);

        // Performance Comparison
        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy twoPointerStrategy = new TwoPointerStrategy();

        System.out.println("\n--- Performance Comparison ---");

        long startTimeStack = System.nanoTime();
        boolean res1 = stackStrategy.check(wrd);
        long endTimeStack = System.nanoTime();
        long durationStack = endTimeStack - startTimeStack;

        long startTimeTP = System.nanoTime();
        boolean res2 = twoPointerStrategy.check(wrd);
        long endTimeTP = System.nanoTime();
        long durationTP = endTimeTP - startTimeTP;

        System.out.println("1. Stack Strategy       | Result: " + res1 + " | Time: " + durationStack + " ns");
        System.out.println("2. Two-Pointer Strategy | Result: " + res2 + " | Time: " + durationTP + " ns");

        System.out.println("\nPerformance Gap: " + Math.abs(durationStack - durationTP) + " ns");

        sc.close();
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

        String str = input.toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop())
                return false;
        }

        return true;
    }
}

class TwoPointerStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        if (input == null)
            return false;

        String str = input.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}