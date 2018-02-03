package expedia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {
	WebDriver driver;
	

	
	@FindBy(id="header-history")
	static WebElement headerHistory;
	
	@FindBy(id="tab-flight-tab-hp")
	static WebElement flightsTab;
	
	@FindBy(id="flight-origin-hp-flight")
	static WebElement originCity;
	
	@FindBy(id="flight-destination-hp-flight")
	static WebElement destinationCity;
	
	@FindBy(id="flight-departing-hp-flight")
	static WebElement departureDate;
	
	@FindBy(id="flight-returning-hp-flight")
	static WebElement returnDate;
	
	@FindBy(xpath="(//caption)[1]")
	static WebElement calendarMonth;
	
	@FindBy(xpath="//button[contains(@class,'btn-secondary next')]")
	static WebElement nextMonthButton;
	
	public HomePageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public  void navigateToFlightTab(){
		//driver.findElement(By.id("tab-flight-tab-hp")).click();
		flightsTab.click();
	}
	public   void clickFlightsTab(){
		//headerHistory.click();
		flightsTab.click();
	}
	
	public void setOriginCity(String origin){
		originCity.sendKeys(origin);
	}
	
	public  void setDestinationCity(String destination){
		destinationCity.sendKeys(destination);
	}
	
	public  void clickOnDepartureDateTextBox(){
		departureDate.click();
	}
	public  void clickOnReturnDateTextBox(){
		returnDate.click();
	}
	public  void setDepartureDate(String date){
		departureDate.sendKeys(date);
	}
	
	public  void setReturnDate(String date){
		returnDate.clear();
		returnDate.sendKeys(date);
	}
	
	public WebElement getADate(int month, int day, int year){
		return driver.findElement(By.xpath("//button[@data-year='"+year+"' and @data-month='"+month+"' and @data-day='"+day+"']"));
	}
	
	public void clickOnADate(int month, int day, int year){
		System.out.println(calendarMonth.getText());
		while(!calendarMonth.getText().equals("Jul 2018")){
			nextMonthButton.click();
		}
		
			WebElement element = getADate(month, day, year);
			element.click();
		
	}
	
}
