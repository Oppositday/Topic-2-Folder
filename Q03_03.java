import java.util.Scanner;
import static java.lang.System.out;

public class Q03_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		out.print("Enter a, b, c, d, e, and f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		double adbc = a * d - b * c;
		if (adbc == 0) {
			out.println("The equation has no solution");
		} else {
			double x = (e * d - b * f) / adbc;
			double y = (a * f - e * c) / adbc;
			out.println("x is " + x + " and y is " + y);
		}
			
	}

}
