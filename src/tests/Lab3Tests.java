package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.lab3tests.*;

@RunWith(Suite.class)
@SuiteClasses(
		{
			EquilateralTriangleTest.class,
			ShowTest.class,
			TriangleTest.class
		}
	)
public class Lab3Tests {
}
