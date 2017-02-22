import java.util.Scanner;
import static java.lang.System.out;

public class Q03_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char c1, c2, c3;
		
		out.print("Enter a three digit number");
		
		c1 = input.findWithinHorizon(".", 0).charAt(0);
		c2 = input.findWithinHorizon(".", 0).charAt(0);
		c3 = input.findWithinHorizon(".", 0).charAt(0);
		
		input.close();
		
		if (c1 == c3) {
			out.println("This is a palindrome");
		} else {
			out.println("This is not a palindrome");
		}
	
	}

}
