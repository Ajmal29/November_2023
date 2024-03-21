package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbscreatepage {
WebDriver driver;
By createpage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
By signup=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");

public Fbscreatepage(WebDriver driver)
{
	this.driver=driver;
}
public void createpageclick()
{
	driver.findElement(createpage).click();
}
public void signupclick()
{
	driver.findElement(signup).click();
}
public String  titleverification()
{
	String title=driver.getTitle();
	return title;
	}
}
