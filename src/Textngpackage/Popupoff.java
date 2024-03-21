package Textngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Popupoff {
	WebDriver driver;
	//ChromeDriver driver;
	//String baseurl="https://www.justdial.com/";
	@BeforeTest
	public void setUp()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();	}
	@Test
	public void popup()
	{
		driver.get("https://www.justdial.com");
	}
}
