package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class uploadPage {

	// variables
	WebDriver driver;
	String url = "http://the-internet.herokuapp.com/upload";

	// constructore
	public uploadPage(WebDriver driver) {
		this.driver = driver;
	}

	// locators
	By chooseFile = By.id("file-upload");
	By uploadfile = By.id("file-submit");
	// keywords / actions
	public void navigateURL() {
		driver.navigate().to(url);
	}
	public void clickChooseFile() {
		 driver.findElement(chooseFile).sendKeys("C:\\Users\\ADMIN\\Pictures\\perf2.png");
	}
	public void clickUploadFile() {
		driver.findElement(uploadfile).click();
	}
}
