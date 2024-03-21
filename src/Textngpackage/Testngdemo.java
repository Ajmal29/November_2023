package Textngpackage;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {    //@before test kodukkunnath ella test activity munb work aavn
/*@beforesuite
@beforetest
@beforeclass
@beforemethod
@test
@aftermethod
@afterclass
@aftertest
@aftersuite*/
	
	
	@BeforeMethod
	public void setup() {
		System.out.println("browser open");
	}
	@BeforeTest
	public void urlloading()
	{
		System.out.println("url loading");
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	@Test
	public void test3()
	{
		System.out.println("test3");
	}
}


//priority set cheyyan       @test(priority = 1)   ella methodinum ith pole priority kodukkuka