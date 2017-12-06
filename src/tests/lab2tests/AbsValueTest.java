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
public class AbsValueTest {

	@Parameters
	public static Collection<Object[]> data()
	{
		return Arrays.asList(new Object[][]{
			{new Complex(3,4), 5}
		});
	}
	
	private Complex complex;
	private double result;
	
	public AbsValueTest(Complex complex, double result) {
		this.complex = complex;
		this.result  = result;
	}
	
	@Test
	public void testCalculateAbsValue() {
		assertEquals(result, complex.absoluteValueOfNumber(), 0.001);
	}

}
