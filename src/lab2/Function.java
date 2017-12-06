package lab2;

public class Function {

	public double func(Complex first, Complex second, Complex third)
	{
		Complex secondIn4pow = second.exponentiation(4);
		Complex resultOfDivision = Calculator.division( Calculator.subtraction(first, second),
				Calculator.multiplication(third, first)
			);
		Complex result = Calculator.addition(secondIn4pow, resultOfDivision);
		
		return Math.round(result.absoluteValueOfNumber()*100.0)/100.0;
	}
}
