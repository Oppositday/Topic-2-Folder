import java.util.Scanner;
import static java.lang.System.out;

public class Q03_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		out.print("Enter the weight of the package: ");
		
		double weight = input.nextDouble();
		
		if (weight > 50)
			out.println("The package cannot be shipped");
		
		else {
			double cost = 0;
			if (weight > 0 && weight <= 1)
				cost = 3.5;
			if (weight > 1 && weight <= 3)
				cost = 5.5;
			if (weight > 3 && weight <= 10)
				cost = 8.5;
			if (weight > 10 && weight <= 20)
				cost = 10.5;
			if (weight > 20 && weight <= 35)
				cost = 13.5;
			if (weight > 35 && weight <= 50)
				cost = 15.5;
		out.println("The shipping cost is $" + cost * weight);
		}

	}

}
