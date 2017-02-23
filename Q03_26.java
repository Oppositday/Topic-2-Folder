import java.util.Scanner;
import static java.lang.System.out;

public class Q03_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		out.print("Enter an integer: ");
		int number = input.nextInt();
		
		boolean and = (number % 5 == 0) && (number % 6 == 0);
		out.println("Is " + number + " divisible by 5 and 6? " + and);
		
		boolean or = (number % 5 == 0) || (number % 6 == 0);
		out.println("Is " + number + " divisible by 5 or 6? " + or);
		
		boolean both = (number % 5 == 0) ^ (number % 6 == 0);
		out.println("Is " + number + " divisible by 5 or 6, but not both? " + both);

	}

}
