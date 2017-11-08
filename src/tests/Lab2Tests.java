package tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Lab2Tests {

	@Parameters
	public static Collection<Object[]> data()
	{
		return Arrays.asList(new Object[][]{
			{},
		});
	}
	
	private String init;
	private String result;
	
	public Lab2Tests(String init, String result)
	{
		this.init = init;
		this.result = result;
	}
	
	
	@Test
	public void test() {
		
	}

}
