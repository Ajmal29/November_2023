package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	ChromeDriver driver;
	String baseurl="http://www.Amazon.in";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	@Test
	public void Amazonlogin()throws InterruptedException
	{
		Thread.sleep(1000);
	
	//	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("MOBILE");/*
	WebElement 	search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("mobiles");
		search.submit();
		
		driver.findElement(By.xpath("//div[@id='nav-xshop'/a[4]")).click();
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-main']/div/a']")).click();		

		
	}
	//@After
}
