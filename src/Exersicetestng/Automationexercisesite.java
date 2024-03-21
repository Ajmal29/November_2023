package Exersicetestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationexercisesite<select> {
	ChromeDriver driver;
	String baseurl="https://automationexercise.com/";
	@BeforeTest
	public void setup() {
		driver =new ChromeDriver();
		driver.get(baseurl);
	}
		@Test
		public void exercise() throws InterruptedException
		{
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("Ajmal");
			driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("ajmalnk2000@gmail.com");
			driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();	
			
		WebElement	mrradiobutton =driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
		  WebElement           mrsradiobutton  = driver.findElement(By.xpath("//*[@id=\"id_gender2\"]"));
		mrradiobutton.click()	;
		if(mrradiobutton.isSelected())
		{
			System.out.println("male radio button is selected");
		}
			else
			{
				System.out.println("male radio button is not selected");
			}
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ajmal123");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,250)","");
			
	WebElement  day=	driver.findElement(By.xpath("//*[@id=\"days\"]"));
	Select daydetails=new Select(day);
	daydetails.selectByValue("15");
Select month=new Select(driver.findElement(By.xpath("//*[@id=\"months\"]")));
month.selectByValue("5");

   Select year= new Select ( driver.findElement(By.xpath("//*[@id=\"years\"]")));
 year.selectByValue("2000");
   
 

driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Ajmal");




    
          driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("N K");
          driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("luminar");
          driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("abc");
          js.executeScript("window.scrollBy(250,750)");
          driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("abc");
          
        driver.findElement(By.xpath("//input[@data-qa='state']")).sendKeys("kerala");
        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("idukki");
        driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("685511");
        driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("7025762916");
        
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click() ; 
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
        
        Thread.sleep(2000);

		}
		@Test
		public void login()
		{
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("ajmalnk2000@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("Ajmal123");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		}
		
		
		}
		
	



