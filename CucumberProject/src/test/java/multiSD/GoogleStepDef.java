package multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GoogleStepDef {
	
WebDriver driver =null;
	
	@Given("^User need to be on google page$")
	public void User_need_to_be_on_google_page(){
		System.setProperty("webdriver.gecko.driver", "C:\\Cucumber SetUp\\resources-driver\\geckodriver64bit.exe");
	  //System.setProperty("Webdriver.gecko.driver", "C:\\Cucumber SetUp\\resources-driver\\geckodriver64bit.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		
		}
	@When("^User enters search string$")
	public void User_enters_search_string() throws InterruptedException{
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
		Thread.sleep(2000);
	}

}
