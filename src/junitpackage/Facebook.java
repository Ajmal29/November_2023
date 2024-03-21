package junitpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

ChromeDriver driver;
String baseurl="http://www.facebook.com";
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	
}
@Test
public void fblogin()
{
	/*driver.findElement(By.id("email")).sendKeys("ajmal@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("Ajmal12");
	driver.findElement(By.name("login")).click();*/
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("fsd23");
	driver.findElement(By.xpath("//button[@name='login']")).click();
}
//@After
//public void tearDown()    //browser quit tearDown
//{
	//driver.quit();
//}
}

