package programs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Fistprogram {

	public static void main(String[] args) {
		//object create cheyyanam first //to launch chrome browser
		//import cheyyuka chrome driver ine
		//url acess cheyyan get method kodukkuka kodukkuka 
		
		EdgeDriver driver = new EdgeDriver ();
		driver.get("https://www.google.com"); //to launch browser
		String exp="Google";
		String actualtitle=driver.getTitle();
		if(exp.equals(actualtitle))//return title of the application
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
		
driver.quit();	}

}
