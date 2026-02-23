import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word : ");
        String wrd=sc.nextLine(),temp = "";
        Stack<Character> stack=new Stack<>();
        for(char c:wrd.toCharArray())
        {
            stack.push(c);
        }
        boolean isPalindrome =true;
        for(char c:wrd.toCharArray())
        {
            if(c!=stack.pop()) {
                isPalindrome = false;
                System.out.println("Not Palindrome");
                System.exit(0);
            }
        }
        if(isPalindrome)
            System.out.println("Palindrome");


    }
}