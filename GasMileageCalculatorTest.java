import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasMileageCalculatorTest{
	
	@Test
	public void testThatCalculatorCanCalculateMilesPerGallon(){

		//given
		GasMileageCalculator calculator = new GasMileageCalculator();

		//when
		double numberOfMilesDriven = 30.00;
		double numberOfGallonsUsed = 10;

		double milesPerGallon = calculator.computeMilesPerGallon(numberOfMilesDriven, numberOfGallonsUsed);

		//assert
		assertEquals(3, milesPerGallon);
	}

	@Test
	public void testThatMultipliesWithoutTheMultiplicationOperator(){
		
		//given 
		GasMileageCalculator calculator = new GasMileageCalculator();

		//when
		int firstNumber = 3;
		int secondNumber = -5;

		int product = calculator.computeProduct(firstNumber, secondNumber);

		//assert
		assertEquals(-15, product);


	}

	
}