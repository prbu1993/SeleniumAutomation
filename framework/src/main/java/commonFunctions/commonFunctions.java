package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pageObjects.LoginPageObjects;

public class commonFunctions {

	public static Properties properties = null;
	public static WebDriver driver = null;

	public Properties loadPropertyFile() {

		try {
			
			FileInputStream inputStream = new FileInputStream("src\\main\\resources\\config.properties");
			properties = new Properties();
			properties.load(inputStream);

		} catch (IOException e) {

			e.printStackTrace();

		}

		return properties;

	}

	public void login() {

		LoginPageObjects.usernameTextbox.sendKeys(properties.getProperty("username"));
		LoginPageObjects.passwordTextbox.sendKeys(properties.getProperty("password"));
		LoginPageObjects.loginButton.click();

	}

	@BeforeSuite
	public void launchBrowser() {

		loadPropertyFile();
		String url = properties.getProperty("url");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		login();

	}

	@AfterSuite
	public void tearDown() {

		driver.quit();

	}

}
