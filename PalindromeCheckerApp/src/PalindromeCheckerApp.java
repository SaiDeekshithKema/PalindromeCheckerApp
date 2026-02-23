import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("Welcome to the PalindromeChecker Management System");
        System.out.println("Version : 2.0");

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        boolean isPalindrome = true;

        // Loop till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        scanner.close();
    }
}