package shareDataSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ShareDataSD {
	
	WebDriver driver;
	public ShareDataSD(SharedClass share){
		driver=share.Setup();
	}
	
	
	/*@Before
	public void beforeSetup(){
		System.out.println("Before execution");
		//System.setProperty("webdriver.gecko.driver", "C:\\Cucumber SetUp\\resources-driver\\geckodriver64bit.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Cucumber SetUp\\resources-driver\\geckodriver64bit.exe");
		driver=new FirefoxDriver();
	}*/
	
	@Given("^User need to be on Facebook login page$")
	public void User_need_to_be_on_Facebook_login_page(){
		
		driver.get("https://www.facebook.com/");
		
		}
	@When("^User enters user \"([^\"]*)\" first name$")
	public void User_enters_user_first_name(String UserName) throws InterruptedException{
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(UserName);
		Thread.sleep(2000);
	}
	

}
