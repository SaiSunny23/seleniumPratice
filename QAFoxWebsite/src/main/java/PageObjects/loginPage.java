package PageObjects;

import org.openqa.selenium.By;

public class loginPage {
	
	public static By userEamil= By.xpath("//div[@id='account-login']//input[@id='input-email']");
	public static By UserPassword= By.xpath("//div[@id='account-login']//input[@id='input-password']");
	public static By LoginButton=By.xpath("//div[@id='account-login']//input[@value='Login']");
	public static By loginPage= By.xpath("//div[@id='account-login']//h2[text()='Returning Customer']");

}
