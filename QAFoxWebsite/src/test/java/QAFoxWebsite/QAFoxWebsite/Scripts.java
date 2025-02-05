package QAFoxWebsite.QAFoxWebsite;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import openBroswer.OpenWindow;

public class Scripts {
	WebDriver driver;
	@Test
	public void Lanch() throws IOException {
	 OpenWindow open = new OpenWindow();
	 open.Open(driver);
}

}
