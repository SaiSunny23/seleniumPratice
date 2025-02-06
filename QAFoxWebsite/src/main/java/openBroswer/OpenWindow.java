package openBroswer;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import resourcesfileget.GetResource;

public class OpenWindow {
	
	String broswer = "firefox";
	WebDriver driver;

	public WebDriver Open(WebDriver driver) throws IOException {

		GetResource prop = new GetResource();
		try {
			driver = selectbroswer(prop.getProperty("window"));
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			return driver;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}

	}

	private WebDriver selectbroswer(String broswer) {
		switch (broswer) {
		case "chrome":
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.addArguments("--incognito");
		chromeOptions.addArguments("--disable-extensions");
		chromeOptions.addArguments("--remote-allow-origins=*");
		chromeOptions.addArguments("--force-device-scale-factor=0.8");
		//WebDriverManager.chromiumdriver().setup();
		System.setProperty("Webdriver.chrome.driver","D:\\seleniumPratice\\QAFoxWebsite\\src\\main\\java\\webdrivers\\Drivers\\chromedriver.exe");
		 ChromeDriver chrome = new ChromeDriver(chromeOptions);
		break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			break;
		case"firefox":
			WebDriverManager.firefoxdriver().setup();
			
			default:
				System.out.println("Invalid Browser. Please try again !");
				break;
		
		
		}
		
		return driver;
	}

}
