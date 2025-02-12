package PageObjects;

import org.openqa.selenium.By;

public class register {

	public static By RegisterName = By.xpath("//h1[text()='Register']");
	public static By FirstName = By.xpath("//input[@id='FirstName']");
	public static By LastName = By.xpath("//input[@id='LastName']");
	public static By Email = By.xpath("//input[@id='Email']");
	//public static By TelePhone = By.xpath("//input[@name='telephone']");
	public static By Password = By.xpath("//input[@id='Password']");
	public static By ConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
	//public static By CheckBox = By.xpath("//input[@name='agree']");
	public static By coutiune = By.xpath("//div[@class='buttons']//button[@type='submit']");
	//public static By warningmessage= By.xpath("//div[@class='alert alert-danger alert-dismissible']");

}
