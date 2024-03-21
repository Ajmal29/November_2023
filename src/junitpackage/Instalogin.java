package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


public class Instalogin {

      ChromeDriver driver;
	String baseurl="https://www.instagram.com/";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void instalogin() throws InterruptedException
	{
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("aju@gmail.com");
		driver.findElement(By.xpath("//form[@type='password']/div/div[2]/div/label/input")).sendKeys("fdss");
	
		
	}
}
