import java.util.Scanner;
import static java.lang.System.out;

public class Q03_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		out.print("Enter today's day: ");
		int day = input.nextInt();
		
		out.print("Enter the number of days elapsed since today: ");
		int days = input.nextInt();
		
		int future = (day + days) % 7;
		
		out.print("Today is " );
		
		switch (day){
		case 0: out.print("Sunday");
		break;
		case 1: out.print("Monday");
		break;
		case 2: out.print("Tuesday");
		break;
		case 3: out.print("Wednesday");
		break;
		case 4: out.print("Thursday");
		break;
		case 5: out.print("Friday");
		break;
		case 6: out.print("Saturday");
		break;
		}
		
		out.print(" and the future day is ");
		switch (future) {
		case 0: out.print("Sunday");
		break;
		case 1: out.print("Monday");
		break;
		case 2: out.print("Tuesday");
		break;
		case 3: out.print("Wednesday");
		break;
		case 4: out.print("Thursday");
		break;
		case 5: out.print("Friday");
		break;
		case 6: out.print("Saturday");
		break;
		}
	}

}
