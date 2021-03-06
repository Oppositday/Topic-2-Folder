import java.util.Scanner;
import static java.lang.System.out;

public class Q03_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		out.print("0-single filer, 1-married jointly or " +
		"qualified widow(er), 2-married seperately, 3-head of " +
				"household) Enter the filing status: ");
		
		int status = input.nextInt();
		
		out.print("Enter the taxable income: ");
		double income = input.nextDouble();
		
		double tax = 0;
		
		 if (status == 0) { 
	            if (income <= 8350) {
	                tax = income * 0.10;
	            } else if (income <= 33950) {
	                tax = 8350 * 0.10 + (income - 8350) * 0.15;
	            } else if (income <= 82250) {
	                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
	            } else if (income <= 171550) {
	                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
	                        (income - 82250) * 0.28;
	            } else if (income <= 372950) {
	                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
	                        (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
	            } else {
	                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
	                        (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 +
	                        (income - 372950) * 0.35;
	            }
	        } else if (status == 1) {
	            if (income <= 16700.0) {
	                tax = income * 0.1;
	            } else if (income <= 67900.0) {
	                tax = 1670.0 + (income - 16700.0) * 0.15;
	            } else if (income <= 137050.0) {
	                tax = 9350.0 + (income - 67900.0) * 0.25;
	            } else if (income <= 208850.0) {
	                tax = 26637.5 + (income - 137050.0) * 0.28;
	            } else if (income <= 372950.0) {
	                tax = 46741.5 + (income - 208850.0) * 0.33;
	            } else {
	                tax = 90562.5 + (income - 372950.0) * 0.35;
	            }

	        } else if (status == 2) {
	            if (income <= 8350.0) {
	                tax = income * 0.1;
	            } else if (income <= 33950.0) {
	                tax = 835.0 + (income - 8350.0) * 0.15;
	            } else if (income <= 68525.0) {
	                tax = 4675.0 + (income - 33950.0) * 0.25;
	            } else if (income <= 104425.0) {
	                tax = 13318.75 + (income - 68525.0) * 0.28;
	            } else if (income <= 186475.0) {
	                tax = 23370.75 + (income - 104425.0) * 0.33;
	            } else {
	                tax = 50447.25 + (income - 186475.0) * 0.35;
	            }

	        } else if (status == 3) {
	            if (income <= 11950.0) {
	                tax = income * 0.1;
	            } else if (income <= 45500.0) {
	                tax = 1195.0 + (income - 11950.0) * 0.15;
	            } else if (income <= 117450.0) {
	                tax = 6227.5 + (income - 45500.0) * 0.25;
	            } else if (income <= 190200.0) {
	                tax = 24215.0 + (income - 117450.0) * 0.28;
	            } else if (income <= 372950.0) {
	                tax = 44585.0 + (income - 190200.0) * 0.33;
	            } else {
	                tax = 104892.5 + (income - 372950.0) * 0.35;
	            }

	        } else {
	            out.println("Invalid status...");
	            System.exit(1);
	        }

	        out.println("Tax is " + (int) (tax * 100) / 100.0);
	    }
	}