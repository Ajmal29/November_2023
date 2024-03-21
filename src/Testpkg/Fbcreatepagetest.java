package Testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.Fbscreatepage;


public class Fbcreatepagetest extends Baseclass {
	
	@Test
	public void test2()
	{
		Fbscreatepage ob=new Fbscreatepage(driver);
		ob.createpageclick();
	String actualtitle	=ob.titleverification();
	Assert.assertEquals(actualtitle, "createpage");
		ob.signupclick();
	}
}
