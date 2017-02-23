import java.util.Scanner;
import static java.lang.System.out;

public class Q03_29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double rad0 = input.nextDouble();
		out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double rad1 = input.nextDouble();
		
		double distance = Math.pow((x0 - x1) * (x0 - x1) + (y0 - y1) * (y0 - y1), 0.5);
		
		if (distance + rad1 <= rad0) {
			out.println("circle 2 is inside circle1");
		} else if (distance <= rad1 + rad0) {
			out.println("circle2 is overlapping circle1");
		} else {
			out.println("Error, Try again");
		}

	}

}
