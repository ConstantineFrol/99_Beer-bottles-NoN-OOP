package Week1;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class BeerBottles { 

	public static void main(String[] args) {

		// Initialize variables
		int 	bottlesQty = 99;
		String 	songText = " bottles of beer on the wall";

		// [Do - While] Loop, the value of parameter 'totalBeer' will be changing from 99 to 0 by 1
		do
		{
			if(bottlesQty > 1)
			{
				// While bottlesQty > 1 on console will be displayed this code
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

	}

}
