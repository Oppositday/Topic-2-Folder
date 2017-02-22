import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;

public class Q03_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random myRandom = new Random();
		int randomNumber;
		
		randomNumber = myRandom.nextInt(12) + 1;
		
		switch(randomNumber) {
		case 1:
			out.println("January");
			break;
			
		case 2:
			out.println("February");
			break;
			
		case 3:
			out.println("March");
			break;
			
		case 4:
			out.println("April");
			break;
			
		case 5:
			out.println("May");
			break;
			
		case 6:
			out.println("June");
			break;
			
		case 7:
			out.println("July");
			break;
			
		case 8:
			out.println("August");
			break;
			
		case 9:
			out.println("September");
			break;
			
		case 10:
			out.println("October");
			break;
			
		case 11:
			out.println("November");
			break;
			
		case 12:
			out.println("December");
			break;
		}
		input.close();
	}

}
