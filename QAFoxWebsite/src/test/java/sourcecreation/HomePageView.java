package sourcecreation;

import org.openqa.selenium.WebDriver;

import PageObjects.homePage;
import methods.Methodsuse;

public class HomePageView {
	
	public void HomepageActions(WebDriver driver) {
		Methodsuse method = new Methodsuse();
		method.display(driver, homePage.home);
		method.click(driver, homePage.myAccount);
		method.click(driver, homePage.Register);
	}

}
