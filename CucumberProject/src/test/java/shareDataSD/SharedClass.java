package shareDataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {
	
	WebDriver driver=null;
	
	@Before
	public WebDriver Setup(){
		
		if (driver==null){
			System.setProperty("webdriver.gecko.driver", "C:\\Cucumber SetUp\\resources-driver\\geckodriver64bit.exe");
			driver=new FirefoxDriver();
		}
		
		return driver;
		
	}
	
	@After
	public void TearDown(){
		
		driver.quit();
		driver=null;
		
	}

	
}
