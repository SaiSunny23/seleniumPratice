package sourcecreation;

import org.openqa.selenium.WebDriver;

import PageObjects.homePage;
import methods.Methodsuse;

public class HomePageView {
	Methodsuse method;
	public void HomepageActions(WebDriver driver) {
		Methodsuse method = new Methodsuse();
		method.display(driver, homePage.home);
		method.click(driver, homePage.myAccount);
		method.click(driver, homePage.Register);
	}

	public void backtohome(WebDriver driver) {
		Methodsuse method = new Methodsuse();
		method.click(driver, homePage.home);

	}
	public void HomepageActionsLogin(WebDriver driver) {
		 method = new Methodsuse();
		method.display(driver, homePage.home);
		method.click(driver, homePage.myAccount);
		method.click(driver, homePage.login);
	}
}
