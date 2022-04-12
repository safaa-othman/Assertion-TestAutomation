package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DraganbDropPage {

	// variable
	WebDriver driver;
	String dragURL = "https://jqueryui.com/resources/demos/droppable/default.html";

	// constractore
	public DraganbDropPage(WebDriver driver) {
		this.driver = driver;
	}

	// locatores
	By drag = By.id("draggable");
	By drop = By.id("droppable");

	// keywords / actions
	public void navigateURL() {
		driver.navigate().to(dragURL);
	}

	public void DrabAndDrop() {
		WebElement dragg = driver.findElement(drag);
		WebElement dropp = driver.findElement(drag);
		Actions action = new Actions(driver);
		action.dragAndDrop(dragg, dropp).moveToElement(dropp).release().build().perform();

	}
}
