package tests.lab3tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import lab3.EquilateralTriangle;
import lab3.Show;

@RunWith(Parameterized.class)
public class ShowTest {

	@Parameters
	public static Collection<Object[]> data()
	{
		return Arrays.asList(new Object[][]{
			{
				new Show(new EquilateralTriangle[]{
					new EquilateralTriangle(0, 0, 3, 0, 1.5, 2.598076),
					new EquilateralTriangle(0, 0, 0.5, Math.sqrt(3)/2, 1, 0),
				}),
				0.87
			}
		});
	}
	
	private Show show;
	private double minEquilateral;
	
	public ShowTest(Show show, double minEquilateral) {
		this.show = show;
		this.minEquilateral = minEquilateral;
	}
	
	@Test
	public void minEquilateralTest(){
		assertEquals(minEquilateral, show.minEquilateral(), 0.001);
	}
}
