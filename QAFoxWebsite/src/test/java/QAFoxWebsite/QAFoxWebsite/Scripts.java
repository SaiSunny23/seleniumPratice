package QAFoxWebsite.QAFoxWebsite;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import openBroswer.OpenWindow;
import sourcecreation.HomePageView;
import sourcecreation.Registercreate;

public class Scripts {
	WebDriver driver;

	@BeforeMethod
	public void Lanch() throws IOException, InterruptedException {
		OpenWindow open = new OpenWindow();
		driver = open.Open();
	}

	@Test
	public void Homepagesc() throws IOException, InterruptedException {
		HomePageView page1 = new HomePageView();
		page1.HomepageActions(driver);
	}
	@Test
	public void registerusertodimain() throws IOException, InterruptedException {
		Homepagesc();
		Registercreate register = new Registercreate();
		register.usercreation(driver);
		register.confrimuser(driver);
		Thread.sleep(5000);
	}
	

	@AfterMethod
	public void exitchromeDriver() {
		CloseWindowall close = new CloseWindowall();
		close.closewindowallb(driver);
	}

}
