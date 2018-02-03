package flightbooking;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_BeforeClass2 {
	
	@BeforeClass
	public void setUp() {
		System.out.println("\nClass 2 This runs once before class");
	}

	@AfterClass
	public void tearUp() {
		System.out.println("\nClass 2 This runs once after class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nClass 2 This runs before every method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nClass 2 This runs after every method");
	}

	@Test
	public void testMethod1() {
		System.out.println("\n Running Test ->> TestNG_TestClass2 -> Method1");
	}

	@Test
	public void testMethod2() {
		System.out.println("\n Running Test ->> TestNG_TestClass2 -> Method2");
	}

	@Test
	public void testMethod3() {
		System.out.println("\n Running Test ->> TestNG_TestClass2 -> Method3");
	}
	
}
