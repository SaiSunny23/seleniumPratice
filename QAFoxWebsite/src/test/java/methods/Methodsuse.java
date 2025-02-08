package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Methodsuse {
	boolean status = false;

	public boolean display(WebDriver driver, By value) {
		try {
			driver.findElement(value).isDisplayed();
			status = true;
		} catch (Exception e) {

			status = false;
		}
		return status;
	}

	public boolean click(WebDriver driver, By value) {
		try {
			driver.findElement(value).click();
			status = true;
		} catch (Exception e) {

			status = false;
		}
		return status;
	}
	
	public boolean enterValue(WebDriver driver, By value,String data) {
		try {
			driver.findElement(value).sendKeys(data);
			status = true;
		} catch (Exception e) {

			status = false;
		}
		return status;
	}
	public boolean gettext(WebDriver driver, By value) {
		try {
			driver.findElement(value).getText();
			status = true;
		} catch (Exception e) {

			status = false;
		}
		return status;
	}
	public boolean enable(WebDriver driver, By value) {
		try {
			driver.findElement(value).isEnabled();
			status = true;
		} catch (Exception e) {

			status = false;
		}
		return status;
	}
	
}
