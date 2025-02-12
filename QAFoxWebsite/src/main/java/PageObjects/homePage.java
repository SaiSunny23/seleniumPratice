package PageObjects;

import org.openqa.selenium.By;

public class homePage {

	public static By home = By.xpath("//div[@class='header-logo']");
	public static By searchBar = By.xpath("//input[@placeholder='Search store']");
	//public static By myAccount = By.xpath("//ul[@class='list-inline']//a[@title='My Account']");
	public static By Register = By.xpath("//div[@class='header-links-wrapper']//a[contains(text(),'Register')]");
	public static By login =By.xpath("//div[@class='header-links-wrapper']//a[@class='ico-login']");
	

}
