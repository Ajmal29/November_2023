package Textngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrolldown {
ChromeDriver driver;
String baseurl="https://www.amazon.in";
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
	@Test
	public void scrolldown()
	{
			
driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")).click();
JavascriptExecutor js=(JavascriptExecutor)driver;js.executeScript("window.scrollBy(0,250)","");  //scroll down defining by pixel

}
}