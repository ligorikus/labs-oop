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
public class ArgumentTest {

	@Parameters
	public static Collection<Object[]> data()
	{
		return Arrays.asList(new Object[][]{
			{new Complex(2,3.1151), 1},
			{new Complex(0,1), Math.PI/2}
		});
	}
	
	private Complex complex;
	private double result;
	
	public ArgumentTest(Complex complex, double result) {
		this.complex = complex;
		this.result  = result;
	}
	
	@Test
	public void testCalculateAbsValue() throws Exception {
		assertEquals(result, complex.argument(), 0.001);
	}
}
