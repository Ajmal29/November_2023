package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitself {
	ChromeDriver driver;
	String baseurl="http://facebook.com";
	@Before
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void Titleverification()
	{
		String exp="facabook";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(exp))
		{
			
			System.out.println("pass");
	}
		else
		{
			System.out.println("fail");
		}

}
}