package Textngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
ChromeDriver driver;
String baseurl="https://demo.guru99.com/test/upload/";
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void fileupload()
{
	WebElement fileupload=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
	fileupload.sendKeys("C:\\Users\\ajmal\\OneDrive\\Desktop");
WebElement	checkboses=driver.findElement(By.xpath("//*[@id=\"terms\"]"));

checkboses.click();
checkboses.isSelected();
	
	driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
}
}
