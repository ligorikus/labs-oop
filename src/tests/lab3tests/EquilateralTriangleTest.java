package tests.lab3tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import lab3.EquilateralTriangle;

@RunWith(Parameterized.class)
public class EquilateralTriangleTest {

	@Parameters
	public static Collection<Object[]> data()
	{
		return Arrays.asList(new Object[][]{
			{
				new EquilateralTriangle(0, 0, 3, 0, 1.5, 2.598076),
				2.6
			},
			{
				new EquilateralTriangle(0, 0, 0.5, Math.sqrt(3)/2, 1, 0),
				0.87
			}
		});
	}
	
	
	private EquilateralTriangle triangle;
	private double median;
	
	public EquilateralTriangleTest(EquilateralTriangle triangle, double median) {
		this.triangle = triangle;
		this.median = median;
	}
	
	@Test 
	public void testIsEquilateral(){
		assertTrue(this.triangle.isEquilateral());
	}
	
	@Test
	public void testLengthOfMedian(){
		assertEquals(this.median, this.triangle.lengthOfMedian(), 0.001);
	}
}
