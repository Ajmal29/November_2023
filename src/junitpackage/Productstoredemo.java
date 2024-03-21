package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Productstoredemo {
ChromeDriver driver;
String baseurl="https://www.demoblaze.com/";
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	driver.manage().window().maximize();
}
	@Test
	public void Productlogin() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='navbar-collapse']/ul/li[2]/a")).click();
		WebElement  user= driver.findElement(By.xpath("//input[@class='form-control']"));
		user.sendKeys("ajmal");
		
	}
}

