package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
WebDriver driver=null;
	@Test
	public void m1()
	{
		System.out.println("Hello");
		String BROWSER =System.getProperty("browser");
		 String URL = System.getProperty("url");
		
		  if(BROWSER.equalsIgnoreCase("chrome"))
		   {
			   WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		   }
		  else if(BROWSER.equalsIgnoreCase("firefox"))
	      {
	    	  WebDriverManager.firefoxdriver().setup();
	      driver=new FirefoxDriver(); 
	      }
	     else 
	     {
	     driver=new ChromeDriver();
	    	  
	      }
		  driver.get(URL);
		  //first push
		  //second push
	}
}
