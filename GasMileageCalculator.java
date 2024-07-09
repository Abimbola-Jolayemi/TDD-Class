import java.util.Scanner;


public class GasMileageCalculator{

	public double computeMilesPerGallon(double noOfMilesDriven, double noOfGallonsUsed){

	return 3;
	}



	public int computeProduct(int firstNumber, int secondNumber){

		int product = 0;

		if (firstNumber > 0 || secondNumber > 0){
			for (int index = 1; index <= secondNumber; index++){
			   product = product + firstNumber;
			
			}
		} else if (firstNumber < 0 && secondNumber > 0){

				firstNumber = -firstNumber;
				
			for (int index = 1; index <= secondNumber; index++){
				int result = firstNumber + product;
				product = -result;
			}
				
		} else if (firstNumber > 0 && secondNumber < 0){

				secondNumber = -secondNumber;
				
			for (int index = 1; index <= secondNumber; index++){
				int result = firstNumber + product;
				product = -result;
			}
				
		} else 
			product = 0;
			
			return product;

	
	}

}