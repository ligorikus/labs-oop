package tests.lab2tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import lab2.Complex;
import lab2.Function;

@RunWith(Parameterized.class)
public class FunctionTest {

	@Parameters
	public static Collection<Object[]> data()
	{
		return Arrays.asList(new Object[][]{
			{
				new Complex(1, 1),
				new Complex(1, 1),
				new Complex(1, 1),
				4
			},
			{
				new Complex(1, -2),
				new Complex(-2, -1),
				new Complex(0.5, -1),
				23.97
			}
		});
	}
	
	private Complex first;
	private Complex second;
	private Complex third;
	private double result;
	
	public FunctionTest(Complex first, Complex second, Complex third, double result) {
		this.first = first;
		this.second  = second;
		this.third = third;
		this.result = result;
	}
	
	@Test
	public void testFunc() {
		assertEquals(result, new Function().func(first, second, third), 0.001);
	}
}
