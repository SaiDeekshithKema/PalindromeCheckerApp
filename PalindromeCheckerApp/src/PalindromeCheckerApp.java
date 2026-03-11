import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word : ");
        String wrd=sc.nextLine(),temp = "";
        Deque<Character> deque=new ArrayDeque<>();
        for(char c:wrd.toCharArray())
        {
            deque.addLast(c);
        }
        boolean isPalindrome =true;
        while(deque.size()>1)
        {
            if(deque.removeLast()!=deque.removeFirst()) {
                isPalindrome = false;
                System.out.println("Not Palindrome");
                System.exit(0);
            }
        }
        if(isPalindrome)
            System.out.println("Palindrome");


    }
}