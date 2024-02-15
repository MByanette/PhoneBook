import java.util.Scanner;
public class PalindromeDetect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Word or Phrase here: ");
        String input = scanner.nextLine();
        
        if (isPalindrome(input)) {
            System.out.println("Yes, \"" + input + "\" is a Palindrome");
        } else {
            System.out.println("No, \"" + input + "\" is not a Palindrome");
        }
        
        scanner.close();
    }
		public static boolean isPalindrome(String str) {
			 str = str.replaceAll("[,\\s]", "").toLowerCase();
			 
			if (str.length() <= 1) {
	            return true;
	        }
	        
	        String reverse = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reverse += str.charAt(i);
	        }
	        
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) != reverse.charAt(i)) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
	}
