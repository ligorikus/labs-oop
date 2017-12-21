package tests.lab3tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import lab3.Triangle;

@RunWith(Parameterized.class)
public class TriangleTest {

	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{
				new Triangle(0, 0, 0, 3, 4, 0),   // Triangle
				new double[]{ 3, 5, 4 },          // Length of Sides
				new double[]{ 36.87, 90.0, 53.13 }, // Angles
				12,                               // Perimeter
				6                                 // Area
			}
		});
	}
	
	
	private Triangle triangle;
	private double[] lengthOfSides;
	private double[] angles;
	private double perimeter;
	private double area;
	
	public TriangleTest(Triangle triangle, double[] lengthOfSides, double[] angles, double perimeter, double area) {
		this.triangle = triangle;
		this.lengthOfSides = lengthOfSides;
		this.angles = angles;
		this.perimeter = perimeter;
		this.area = area;
	}
	
	@Test
	public void testLengthOfSide() {
		assertTrue(Triangle.equalDoubleInTriangle(lengthOfSides, triangle.lengthOfSide()));
	}
	@Test 
	public void testAngles(){
		assertTrue(Triangle.equalDoubleInTriangle(angles, triangle.angles()));
	}
	@Test
	public void testPerimeter(){
		assertEquals(perimeter, triangle.perimeter(),0.001);
	}
	@Test
	public void testArea(){
		assertEquals(area, triangle.area(), 0.001);
	}
	@Test
	public void equalTrianglesTest(){
		assertTrue(triangle.equalTriangles(new Triangle(0, 0, 0, 3, 4, 0)));
		assertFalse(triangle.equalTriangles(new Triangle(7, 8, 4, -1, 55, 10)));
	}

}
