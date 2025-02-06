package QAFoxWebsite.QAFoxWebsite;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import openBroswer.OpenWindow;
import sourcecreation.HomePageView;

public class Scripts {
	WebDriver driver;

	@Test
	public void Lanch() throws IOException, InterruptedException {
		OpenWindow open = new OpenWindow();
		open.Open(driver);
	}
@Test
	public void Homepagesc(WebDriver driver) throws IOException, InterruptedException {
		Lanch();
		HomePageView page1 = new HomePageView();
		page1.HomepageActions(driver);
		Thread.sleep(10000);

	}

}
