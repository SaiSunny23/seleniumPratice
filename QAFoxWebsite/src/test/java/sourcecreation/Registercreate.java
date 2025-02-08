package sourcecreation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.confirmmregisterprocess;
import PageObjects.register;
import methods.Methodsuse;
import resourcesfileget.GetResource;

public class Registercreate {
	GetResource prop;

	public void usercreation(WebDriver driver) throws IOException {
		prop = new GetResource();
		Methodsuse use = new Methodsuse();
		use.display(driver, register.RegisterName);
		use.enterValue(driver, register.FirstName, prop.getProperty("frist"));
		use.enterValue(driver, register.LastName, prop.getProperty("last"));
		use.enterValue(driver, register.Email, prop.getProperty("email"));
		use.enterValue(driver, register.TelePhone, prop.getProperty("telephone"));
		use.enterValue(driver, register.Password, prop.getProperty("password"));
		use.enterValue(driver, register.ConfirmPassword, prop.getProperty("password"));
		use.click(driver, register.CheckBox);
		use.click(driver, register.coutiune);
	}
	
	public void confrimuser(WebDriver driver) {
		Methodsuse use = new Methodsuse();
		use.display(driver, confirmmregisterprocess.confirmuserregister);
		use.click(driver, confirmmregisterprocess.coutiube);
		use.enable(driver, confirmmregisterprocess.myaccount);
		
	}
}
