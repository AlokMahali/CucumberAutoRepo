package hooksSD;

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

public class HooksSD {
	
	WebDriver driver =null;
	
	@Before
	public void beforeSetup(){
		System.out.println("Before execution");
		//System.setProperty("webdriver.gecko.driver", "C:\\Cucumber SetUp\\resources-driver\\geckodriver64bit.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Cucumber SetUp\\resources-driver\\geckodriver64bit.exe");
		driver=new FirefoxDriver();
	}
	
	@Given("^User need to be on Facebook login page$")
	public void User_need_to_be_on_Facebook_login_page(){
		
		driver.get("https://www.facebook.com/");
		
		}
	@When("^User enters user \"([^\"]*)\" first name$")
	public void User_enters_user_first_name(String UserName) throws InterruptedException{
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(UserName);
		Thread.sleep(2000);
	}
	
	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void User_checks_user_first_name_is_present(String UserName){
		String UserActual = driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
		
		Assert.assertEquals(UserName, UserActual);
	}
	
	@And("^User enters user \"([^\"]*)\" surname$")
	public void user_enters_user_surname(String Sname) throws InterruptedException{
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Sname);
		Thread.sleep(2000);
		
	}
	@Then("^User Mobile field should be blank$")
	public void user_Mobile_field_should_be_blank() throws InterruptedException{
		
		String ActualValue= driver.findElement(By.xpath("//input[@name='reg_email__']")).getAttribute("value");
		Assert.assertEquals("", ActualValue);
		Thread.sleep(2000);
		
	}
	
	/*@Then("^close browser$")
	public void close_browser(){
		driver.quit();
		driver = null;
	}
*/
	
	@After
	public void tearDown(){
		System.out.println("After execution");
		driver.quit();
		driver = null;
	}
}
