package flightbooking;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_BeforeClass {
	@BeforeClass
	public void setUp() {
		System.out.println("\nThis runs once before class");
	}

	@AfterClass
	public void tearUp() {
		System.out.println("\n This runs once after class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\n This runs before every method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\n This runs after every method");
	}

	@Test
	public void testMethod1() {
		System.out.println("\n Running Test ->> TestNG_TestClass -> Method1");
	}

	@Test
	public void testMethod2() {
		System.out.println("\n Running Test ->> TestNG_TestClass -> Method2");
	}

	@Test
	public void testMethod3() {
		System.out.println("\n Running Test ->> TestNG_TestClass -> Method3");
	}

}
