package tests.lab2tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import lab2.Calculator;
import lab2.Complex;

@RunWith(Parameterized.class)
public class MathComplexTest {

	@Parameters
	public static Collection<Object[]> data()
	{
		return Arrays.asList(new Object[][]{
			{
				new Complex(7,  -4),
				new Complex(3,   2),
				new Complex(10, -2),
				new Complex(4,  -6),
				new Complex(29,  2),
				new Complex(1,   2)
			}
		});
	}
	
	private Complex first;
	private Complex second;
	private Complex addition;
	private Complex subtraction;
	private Complex multiplication;
	private Complex division;
	
	public MathComplexTest(
			Complex first,
			Complex second,
			Complex addition,
			Complex subtraction,
			Complex multiplication,
			Complex division
		)
	{
		this.first = first;
		this.second = second;
		this.addition = addition;
		this.subtraction = subtraction;
		this.multiplication = multiplication;
		this.division = division;
	}
	
	@Test
	public void testAddition() {
		Complex result = Calculator.addition(first, second); 
		assertTrue(Complex.equals(result, addition));
	}
	
	@Test
	public void testSubtraction(){
		assertTrue(Complex.equals(
				Calculator.subtraction(first, second),
				subtraction
			)
		);
	}
	
	@Test 
	public void testMultiplication(){
		assertTrue(Complex.equals(
				Calculator.multiplication(first, second),
				multiplication
			)
		);
	}
	
	@Test
	public void testDivision(){
		assertTrue(Complex.equals(
				Calculator.division(first, second),
				division
			)
		);
	}

}
