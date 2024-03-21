package Textngpackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipcartdemo {
private static final String Search = null;
ChromeDriver driver;
String baseurl="https://www.flipkart.com/account/login?ret=";
@BeforeTest
public void Setup()
{
	driver =new ChromeDriver();
	driver.get(baseurl);
}
	/*@Test
	public void demopage() throws IOException, InterruptedException
	{
	WebElement	request=driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	File src1=request.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src1, new File("./Screenshots/requestbutton.png"));
	
	Thread.sleep(2000);
	}*/
	@Test
	public void flipcart()
	{
	WebElement search=	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		search.sendKeys("mobile",Keys.ENTER);
		String exp="flipcart";
		String acttitle=driver.getTitle();
		if(acttitle.equals(exp))
		{
			System.out.println("title is verified");
		}
		else
		{
			System.out.println("title is not verified");
		}
	}
		@Test
		public void logovisible()
		{
	boolean	logo= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[1]/div[1]/a/picture/img")).isDisplayed();
	if(logo)
	{
		System.out.println("logo displayed");
	}
	else
	{
		System.out.println("logo not displayed");
	}
		}
	}
	
	


