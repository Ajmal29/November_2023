package programs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Pagesource {

	public static void main(String[] args) {
		String baseurl="https://www.google.com";
		ChromeDriver driver =new ChromeDriver();
		driver.get(baseurl);
		String src=driver.getPageSource();
		
		if(src.contains("Gmail"))
		{
			System.out.println("gmail text is present");
			
		}
		else
		{
			System.out.println("text is not present");
		}
		driver.quit();
		}

}
