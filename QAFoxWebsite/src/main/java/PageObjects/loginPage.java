package PageObjects;

import org.openqa.selenium.By;

public class loginPage {
	
	public static By userEamil= By.xpath("//div[@class='form-fields']//input[@class='email']");
	public static By UserPassword= By.xpath("//div[@class='form-fields']//input[@class='password']");
	public static By LoginButton=By.xpath("//div[@class='buttons']//button[@type='submit']");
	public static By loginPage= By.xpath("//div[@class='title']//strong[contains(text(),'Returning Customer')]");

}
