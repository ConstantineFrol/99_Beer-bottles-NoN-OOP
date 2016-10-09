package Week1;

import java.util.Scanner;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class BeerBottles_AND_userInput {

	public static void main(String[] args) {

		// Creating Object of the class Scanner
		Scanner userInput = new Scanner(System.in);	

		// Initialize variables
		int 	bottlesQty = 0;
		String 	songText = " bottles of beer on the wall";

		// asking user to input number of bottles
		System.out.print("Please enter number of bottles: ");

		// Validate user input,make sure it's an integer.Or display an error
		while(!userInput.hasNextInt())
		{
			System.out.println("Oops wrong input! please enter an integer");
			userInput.next();
		}

		// Store input from user in to variable bottlesQty
		bottlesQty = userInput.nextInt();

		// [Do - While] Loop, the value of parameter 'totalBeer' will be changing from 99 to 0 by 1
		do
		{
			if(bottlesQty > 1)
			{
				System.out.println
				(		bottlesQty + songText + "\n" +
						bottlesQty + " bottles of beer\n" +
						"Take one down\n" +
						"Pass it around\n"
				);

				// This means after this line, whatever value was assigned to bottles QTY will be on one less
				bottlesQty--;
				// IF method, when parameter will be equals 1 on console will be displayed this:
				if(bottlesQty == 1)
				{
					System.out.println(bottlesQty + " bottle of beer on the wall\n");
				}
				else
				{
					System.out.println(bottlesQty + songText + "\n");
				}

			}
			// When bottlesQty will be equals 1 on console will be displayed this:
			else
			{
				System.out.println
				(		bottlesQty + " bottle of beer on the wall" + "\n" +
						bottlesQty + " bottle of beer\n" +
						"Take one down\n" +
						"Pass it around\n"
				);

				bottlesQty--;
				// IF method, when parameter will be equals 0 on console will be displayed this:
				System.out.println
				(
						"No more bottles of beer on the wall\n"
				);
			}
		}while(bottlesQty!=0);

		// Close Scanner
		userInput.close();
	}

}
