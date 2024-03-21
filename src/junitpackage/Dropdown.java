package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
ChromeDriver driver;
String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
@Before
public void setup() {
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void drop()throws InterruptedException
{
	driver.findElement(By.xpath(""))
}

}
