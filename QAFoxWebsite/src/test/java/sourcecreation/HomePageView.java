package sourcecreation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.homePage;
import methods.Methodsuse;
import resourcesfileget.GetResource;

public class HomePageView {
	Methodsuse method;
	GetResource prop;
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
	
	public void search(WebDriver driver) throws IOException {
		method.enterValue(driver, homePage.searchBar,prop.getProperty("search") );
		
	}
}
