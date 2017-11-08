package tests;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.*;
import org.junit.runners.Parameterized.*;

import lab1.Text;

@RunWith(Parameterized.class)
public class Lab1Tests {
	
	@Parameters
	public static Collection<Object[]> data()
	{
		return Arrays.asList(new Object[][]{
			{"a1b2c3d 4efg/6", "abcd efg"},
			{"sf.12o55je///os 99sdf", "sfojeos sdf"}
		});
	}
	
	private String init;
	private String result;
	
	public Lab1Tests(String init, String result)
	{
		this.init = init;
		this.result = result;
	}
	
	@Test
	public void testClear() {
		Text text = new Text();
		text.init(this.init);
		text.clear();
		assertEquals(this.result, text.getText());
	}

}
