package PageObjects;

import org.openqa.selenium.By;

public class homePage {

	public static By home = By.xpath("//div[@id='logo']");
	public static By searchBar = By.xpath("//input[@name='search']");
	public static By myAccount = By.xpath("//ul[@class='list-inline']//a[@title='My Account']");
	public static By Register = By.xpath("//ul[@class='list-inline']//a[text()='Register']");
	public static By login =By.xpath("//div[@id='top-links']//a[contains(text(),'Login')]");

}
