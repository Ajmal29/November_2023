package Textngpackage;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	public class Reddif {
	String basrurl="https://register.rediff.com/register/register.php?FormName=user_details";
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
	driver.get(basrurl);
	}
	@Test
	public void titleverification()
	{
	String exp="rediffmail.com";
	String actualtitle=driver.getTitle();
	if(actualtitle.equals(exp))
	{
	System.out.println("Pass");
	}

	else
	{
	System.out.println("Fail");
	}
	}
	@Test
	public void logo()
	{
	boolean logoPresent = driver.findElement(By.xpath("//*[@id=\"Register\"]")).isDisplayed();
	if(logoPresent)
	{
	System.out.println("Pass");
	}
	else
	{
	System.out.println("Fail");
	}
	}
	@Test
	public void createaccountenable()
	{
	boolean createaccount=driver.findElement(By.xpath("//*[@id=\"Register\"]")).isEnabled();
	if(createaccount)
	{
	System.out.println("Enabled");
	}
	else
	{
	System.out.println("Disabled");
	}
	}

	@Test
	public void buttontextverification()
	{
	String buttontext=driver.findElement(By.xpath("//*[@id=\"Register\"]")).getAttribute("value");
	if(buttontext.equals("Create my Account"))
	{
	System.out.println("Enabled");
	}
	else
	{
	System.out.println("Disabled");
	}
	}
	@Test
	public void contentverification()
	{
	String str=driver.getPageSource() ;
	if(str.contains("Full Name"))
	{
	System.out.println("Enabled");
	}
	else
	{
	System.out.println("Disabled");
	}
	}
	}

