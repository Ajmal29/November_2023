package Textngpackage;




	
	

	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class Facebook {


		@Parameters({"username","password"})
		
		@Test
		public void test( String username, String password)
		{
			System.out.println("value=" +username);
			System.out.println("value=" +password);
		}
	}
	