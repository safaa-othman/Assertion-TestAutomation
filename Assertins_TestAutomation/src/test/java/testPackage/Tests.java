package testPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CheckboxPage;
import pages.DraganbDropPage;
import pages.HomePage;
import pages.uploadPage;

public class Tests {
	WebDriver driver;
	HomePage home;
	uploadPage upload ;
	CheckboxPage checkbox ;
	DraganbDropPage draganddrop ;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	}

	@BeforeMethod
	public void beforemethod() {
		driver = new ChromeDriver();
		home = new HomePage(driver);
		checkbox= new CheckboxPage(driver);
		upload = new uploadPage(driver);
		draganddrop = new DraganbDropPage(driver);
	}

	@Test(description = "Assert pageTitle is displayed ")
	public void AssertPageTitleIsDisplayed() {
		home.navigateURL();
		String getTitle = home.getPageTitle();
		System.out.println(getTitle);
		Assert.assertEquals(getTitle, "Google");
	}

	@Test(description = "Assert that the Google logo is displayed")
	public void AssertLogoIsDisplayed() {
		home.navigateURL();
		boolean logo = home.getlogo();
		Assert.assertTrue(logo);
	}

	@Test(description = " Assert that enter data in searchbox then click enter then assert the first is webdriver - selenium.dev")
	public void AssertTheFirstsearch() {
		home.navigateURL();
		home.PostData("Selenium WebDriver");
		String firstresult = home.getFirstResults();
		Assert.assertEquals(firstresult, "WebDriver - Selenium.dev");
	}

	@Test(description = "get fourth search results then assert is result is matched ")
	public void assertTheFourthsearchResultsisDisaplayed() {
		home.navigateURL();
		home.PostData("Selenium WebDriver");
		String forthresult = home.getFourthResults();
		Assert.assertEquals(forthresult, "selenium-webdriver - npm");
	}

	@Test(description = "open chrome then search about Cucumber IO then assert the second contain the link")
	public void assertThesecondresultsContainLink() {
		home.navigateURL();
		home.PostData("Cucumber IO");
		String matchLink = home.getLink();
		Assert.assertEquals(matchLink, "https://en.wikipedia.org");
	}

	@Test(description = "click on checkBox 1")
	public void assertcheckBox() {
		checkbox.navigateTocheckBoxLInk();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		checkbox.clickCheckbox1();
		boolean checkboxSelected = checkbox.checkBoxIsSelected();
		Assert.assertTrue(checkboxSelected);
	}
	@Test
	public void uploadFile() {
		upload.navigateURL();
		upload.clickChooseFile();
		upload.clickUploadFile();
	}
	@Test
	public void navigateDragPage() {
		draganddrop.navigateURL();
		draganddrop.DrabAndDrop();
	}

	@AfterMethod
	public void closeDriver() {
	 driver.quit();
	}

}
