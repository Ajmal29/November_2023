package junitpackage;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
ChromeDriver driver;
String baseurl="https://www.facebook.com";
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	
}
@Test
public void linkcount()
{
List<WebElement> linklist	=   driver.findElements(By.tagName("a"));         //return list of element details store list il type webelent list name link list
System.out.println(linklist.size());

}

	
	
	
	
	
	
}








//List<Webelent> l=driver.findelements (By.tagname("a"));                    l=name findelement =multipleelemnt details
// sop(l.size());
//a = link this tag name
//img count edukkan   right click inspect img tag