package tests.lab2tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import lab2.Complex;

@RunWith(Parameterized.class)
public class ExponentationTest {

	@Parameters
	public static Collection<Object[]> data()
	{
		return Arrays.asList(new Object[][]{
			{new Complex(3,-2), new Complex(5, -12), 2},
			{new Complex(3,4), new Complex(1, 0), 0}
		});
	}
	
	private Complex complex;
	private Complex result;
	private int exp;
	
	public ExponentationTest(Complex complex, Complex result, int exp) {
		this.complex = complex;
		this.result  = result;
		this.exp = exp;
	}
	
	@Test
	public void testCalculateExponentation() {
		assertTrue(Complex.equals(result, complex.exponentiation(exp)));
	}
}
