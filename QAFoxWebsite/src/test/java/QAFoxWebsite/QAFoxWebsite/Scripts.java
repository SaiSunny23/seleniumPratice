package QAFoxWebsite.QAFoxWebsite;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import openBroswer.OpenWindow;
import sourcecreation.HomePageView;
import sourcecreation.Registercreate;
import sourcecreation.login;

public class Scripts {
	WebDriver driver;
	HomePageView page1 = new HomePageView();;

	@BeforeMethod
	public void Lanch() throws IOException, InterruptedException {
		OpenWindow open = new OpenWindow();
		driver = open.Open();
	}

	@Test
	public void Homepagesc() throws IOException, InterruptedException {
		page1.HomepageActions(driver);
	}

	@Test
	public void registerusertodimain() throws IOException, InterruptedException {
		Homepagesc();
		Registercreate register = new Registercreate();
		register.usercreation(driver);
	/*	boolean warn = register.warnigmessage(driver);
		if (warn == true) {
			page1.backtohome(driver);
			Thread.sleep(5000);
		} else if (warn != true) {
			register.confrimuser(driver);
			Thread.sleep(5000);
		}*/
		Thread.sleep(5000);
	}

	@Test
	public void loginapll() throws IOException, InterruptedException {
		page1.HomepageActionsLogin(driver);
		login login = new login();
		login.LoginPage(driver);
		
	}
	
	public void selectproduct() {
		
	}



	@AfterMethod
	public void exitchromeDriver() {
		CloseWindowall close = new CloseWindowall();
		close.closewindowallb(driver);
	}

}
