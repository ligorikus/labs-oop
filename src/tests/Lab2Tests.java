package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.lab2tests.*;

@RunWith(Suite.class)
@SuiteClasses(
		{
			AbsValueTest.class,
			ArgumentTest.class,
			ExponentationTest.class,
			MathComplexTest.class,
			FunctionTest.class
		}
	)
public class Lab2Tests {
}
