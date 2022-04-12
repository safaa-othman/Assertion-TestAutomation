package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage {

		// variables
		WebDriver driver;
		String checkBoxURL = "http://the-internet.herokuapp.com/checkboxes";

		// constructore
		public CheckboxPage(WebDriver driver) {
			this.driver = driver;
		}
		// locator
		By checkBox = By.xpath("//input[@type='checkbox'][1]");
		// keywords / actions
		public void navigateTocheckBoxLInk() {
			driver.navigate().to(checkBoxURL);
		}
		public void clickCheckbox1() {
			 driver.findElement(checkBox).click();
		}
		public boolean checkBoxIsSelected() {
			return driver.findElement(checkBox).isSelected();
		}

}
