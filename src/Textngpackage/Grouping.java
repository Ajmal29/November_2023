GROUPINGpackage Textngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Grouping {
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get(baseurl);
	}
	@Test
	public void contentverification()
	{
		String src=driver.getPageSource(By.xpath("//input[@type='text']"));
		if(src.contains("full name"))
		{
			System.out.println("full name label is presnt");
		}
		else
		{
			System.out.println("full name label is not presnt");
		}
	}
	@Test
public void titleverification()
{
	String actualtitle =driver.getTitle();
	String expectedtitle="reddiffmail";
	if(actualtitle.equalsIgnoreCase(expectedtitle))
	{
		System.out.println("pass");
	}
	
else
{
	System.out.println("fail");
}
}
@Test
public void logodisplay()
{
	boolean logo =driver.findElement(By.xpath("//div[@id='wrapper']/table[1]/tbody/tr[1]/td/img"));
	if(logo)
	{
		System.out.println("logo is present");
	}
	else
	{
		System.out.println("logo is absent");
	}
}
	@Test
	public void createacount()
	{
		boolean createacount=driver.findElement(By.xpath("//*[@id=\"register\"]")).isEnabled();
		if(createacount)	
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("disabled");
		}
	
}
	
}







// oru file matram run cheyyn xml file create cheyyunnu
//xml tags  ,    group,run,include

//clss right click-tstng-converttstng