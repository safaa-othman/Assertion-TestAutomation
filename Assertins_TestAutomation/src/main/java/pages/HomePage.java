package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

	// variables
	WebDriver driver;
	String url = "https://www.google.com/?hl=ar";
	String checkBoxURL = "http://the-internet.herokuapp.com/checkboxes";

	// constructore
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// locators
	By logo = By.xpath("//img[@alt='Google']");
	By searchBox = By.xpath("//input[@type='text']");
	By firstresults = By.xpath("(//span[@dir='ltr'])[1]");
	By fourthResults = By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[8]");
	By link = By.xpath("(//span[@dir='ltr'])[53]");
	// keywords / actions
	public void navigateURL() {
		driver.navigate().to(url);
	}
	public String getPageTitle() {
		return driver.getTitle();
	}

	public Boolean getlogo() {
		return driver.findElement(logo).isDisplayed();
	}

	public void PostData(String data) {
		driver.findElement(searchBox).sendKeys(data + Keys.ENTER);
	}

	public String getFirstResults() {
		return driver.findElement(firstresults).getText();
	}
	public String getFourthResults() {
		return driver.findElement(fourthResults).getText();
	}
	public String getLink() {
		return driver.findElement(link).getText();
	}


}
