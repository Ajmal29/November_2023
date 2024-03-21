//23/2/2024
package Textngpackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exefileupload {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		
	}
	@Test
	public void main () throws IOException ,Exception
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\\\"pickfiles\\\"]/span")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\seliniam\\Autoit\\T1.exe");
		Thread.sleep(3000);
	}

}
