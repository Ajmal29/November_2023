package junitpackage;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {

		ChromeDriver driver;
		String baseurl="https://www.facebook.com";
		@Before
		public void setup()    //method
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
		@Test     //annotation
		public void titleverification()    //oro test case inum oro method describe cheyyuka
		{
			String exp="facebook";
			
			String actualtitle=driver.getTitle();
			if(actualtitle.equals(exp))   //2 string compare cheyyuka
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
		}
		@After
		public void tearDown()    //browser quit tearDown
		{
			driver.quit();
		}
	}
