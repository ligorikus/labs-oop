package tests;

import static org.junit.Assert.*;

import org.junit.*;

import lab1.Text;

public class Lab1Tests {

	private Text text;
	
	@Before
	public void init() 
	{
		text = new Text();
	}
	
	@After
	public void tearDown()
	{
		text = null;
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
