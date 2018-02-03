package expedia;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import expedia.HomePageFactory;

public class TestNG_TestSuite {
	private WebDriver driver;
	private String baseUrl;
	static Logger log = Logger.getLogger(TestNG_TestSuite.class);
	private HomePageFactory hmPage;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Elaman\\Documents\\workspace\\geckodriver\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//PropertyConfigurator.configure("log4j.properties");
		driver.get(baseUrl);
		hmPage = new HomePageFactory(driver);
	}

	@Test
	public void fillBasicInfo() throws Exception {
		hmPage.navigateToFlightTab();
		log.debug("FlightTabClicked");
		hmPage.setOriginCity("New York");
		log.debug("Set origin city debug");
		hmPage.setDestinationCity("Chicago");
		hmPage.setDepartureDate("12/25/2015");
		Thread.sleep(2000);
		hmPage.setReturnDate("12/31/2015");
	}

	@AfterClass
	public void afterClass() {
		
	}

}
