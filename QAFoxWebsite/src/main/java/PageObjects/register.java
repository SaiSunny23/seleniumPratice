package PageObjects;

import org.openqa.selenium.By;

public class register {

	public static By RegisterName = By.xpath("//h1[contains(text(),'Register Account')]");
	public static By FirstName = By.xpath("//input[@name='firstname']");
	public static By LastName = By.xpath("//input[@name='lastname']");
	public static By Email = By.xpath("//input[@name='email']");
	public static By TelePhone = By.xpath("//input[@name='telephone']");
	public static By Password = By.xpath("//input[@name='password']");
	public static By ConfirmPassword = By.xpath("//input[@name='confirm']");
	public static By CheckBox = By.xpath("//input[@name='agree']");
	public static By coutiune = By.xpath("//input[@value='Continue']");

}
