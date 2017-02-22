import java.util.Scanner;
import static java.lang.System.out;
import java.util.Random;

public class Q03_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random myRandom = new Random();
		int computer = (int) (Math.random() * 3);
		
		out.print("Enter 0 for Rock, 1 for Paper, and 2 for Scissors: ");
		int player = input.nextInt();
		
		out.print("Computer says ");
		switch(computer)
		{
		
		case 0: out.print ("rock"); 
		break;
		
		case 1: out.print("paper");
		break;
		
		case 2: out.print("scissors");
		
		}
		
		out.print(" and Player says ");
		switch(player)
		{
		
		case 0: out.print("rock:");
		break;
		
		case 1: out.print("paper:");
		break;
		
		case 2: out.print("scissors:");
		}
			
		{
		boolean playerWins = (computer == 0 && player == 1) ||
		 				 (computer == 1 && player == 2) ||
		 				 (computer == 2 && player == 0);
		boolean tie = (computer == 0 && player == 0) ||
				      (computer == 1 && player == 1) ||
				      (computer == 2 && player == 2);
		boolean computerWins = (computer == 0 && player == 2) ||
							   (computer == 1 && player == 0) ||
							   (computer == 2 && player == 1);
		
		if(playerWins)
			out.println(" Player Wins!");
		if(tie)
			out.println(" Tie!");
		if(computerWins)
			out.println(" Computer Wins!");
	}	
	}

}