//23/2/2024   Robort class fileupload

package Textngpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadrobortclass {
	ChromeDriver driver;
	String baseurl="https://www.ilovepdf.com/word_to_pdf";
	@BeforeTest
	public void Setup()
	{
		driver =new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void fileupload()throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();  //button click
		fileUpload("C:\\Users\\ajmal\\OneDrive\\Desktop\\ajmalcv.pdf");
	}
public void fileUpload(String p) throws AWTException
{
	StringSelection strSelection = new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
	
Robot robot = new Robot();

robot.delay(3000);

robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);

robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);

robot.delay(2000);

	}
}
