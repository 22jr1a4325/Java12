import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enetr a string");
		String input = scanner.nextLine();
		String cleaned = input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		boolean isPalindrome = true;
		int left =0;
		int right = cleaned.length()-1;
		while(left<right){
		    if(cleaned.charAt(left)  != cleaned.charAt(right)){
		       isPalindrome =false;
		        break;
		    }
		    left++;
		    right--;
		}
		if(isPalindrome){
		    System.out.println("The string is palindrome");
		}
		else{
		 System.out.println("The string is not palindrome");   
		}
		scanner.close();
	}
}
