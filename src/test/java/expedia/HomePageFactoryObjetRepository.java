package expedia;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFactoryObjetRepository {
	
	@FindBy(id="header-history")
	WebElement headerHistory;
	
	@FindBy(id="tab-flight-tab-hp")
	static WebElement flightTab;
	
	@FindBy(id="flight-origin-hp-flight")
	WebElement originCity;
	
	@FindBy(id="flight-destination-hp-flight")
	WebElement destinationCity;
	
	@FindBy(id="flight-departing-hp-flight")
	WebElement departureDate;
	
	@FindBy(id="flight-returning-hp-flight")
	WebElement returnDate;
	
	@FindBy(xpath="(//caption)[1]")
	WebElement calendarMonth;
	
	@FindBy(xpath="//button[contains(@class,'btn-secondary next')]")
	WebElement nextMonthButton;
	
//	public void clickFlightTab() {
//		flightTab.click();
//	}
//	
//	public void clickroundTrip() {
//		roundTrip.click();
//	}
//	
//	public void clickMultipleDestination() {
//		multipleDestination.click();
//	}
}

