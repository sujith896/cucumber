package testBase;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class Base {
	
	public static WebDriver driver;
	
	public static Properties prop;
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static final String USERNAME = "sujith.talamanchi140";

	//enter your access key here
	public static final String ACCESS_KEY = "0bf1ff42-bd1b-4398-acb0-3301b0f0922c";
	public static final String SauceLabURL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	
	
	public static void loadPropertiesFile() throws IOException
	{
		prop=new Properties();
		 fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config.properties");
		prop.load(fis);
		
	}
	public static void launchBrowser() 
	{
		String browsername=prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
//		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriverpath"));
//		ChromeOptions co=new ChromeOptions();
//		co.addArguments("headless");
//		driver=new ChromeDriver();
//		
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("version", "74");
			caps.setCapability("name", "cucumber frameworkTesting on chrome 74");
			try {
				driver = new RemoteWebDriver(new URL(SauceLabURL), caps);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxdriverpath"));
			driver=new FirefoxDriver();			
		}
	}
	
	public static void closeBrowser()
	{
		driver.quit();
	}
	@AfterTest
	public void browserchange() throws IOException
	{
		prop.setProperty("browser", "firefox");
		fos=new FileOutputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config.properties");
	prop.store(fos, "browser changes");
	}
//	
	
	
	
}
