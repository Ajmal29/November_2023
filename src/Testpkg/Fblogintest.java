package Testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.Fbloginpage;

public class Fblogintest extends Baseclass {


@Test
public void test()  //page class ayi connection cheyyn fblogin page object create cheyyanm
{
	Fbloginpage ob=new Fbloginpage(driver);
	ob.setvalues("abc@gmail.com", "abc123");
	ob.loginclick();
}
}
