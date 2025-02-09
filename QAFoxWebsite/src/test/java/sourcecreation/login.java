package sourcecreation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.loginPage;
import methods.Methodsuse;
import resourcesfileget.GetResource;

public class login {
	
	Methodsuse use;
	GetResource prop;
	public void LoginPage(WebDriver driver) throws IOException {
		 use = new Methodsuse();
		 prop = new  GetResource();
		 use.display(driver, loginPage.loginPage);
		 use.enterValue(driver, loginPage.userEamil, prop.getProperty("email"));
		 use.enterValue(driver, loginPage.UserPassword, prop.getProperty("password"));
		 use.click(driver, loginPage.LoginButton);
		 
		
	}

}
