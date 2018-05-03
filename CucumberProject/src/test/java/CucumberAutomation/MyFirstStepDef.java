package CucumberAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MyFirstStepDef {
	
	WebDriver driver;
	@Given("^User need to be on Facebook login page$")
	public void User_need_to_be_on_Facebook_login_page(){
		System.setProperty("webdriver.gecko.driver", "C:\\Cucumber SetUp\\resources-driver\\geckodriver64bit.exe");
		//System.setProperty("Webdriver.gecko.driver", "C:\\Cucumber SetUp\\resources-driver\\geckodriver64bit.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		}
	@When("^User enters the first name$")
	public void User_enters_the_first_name(){
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("David");
		
	}
	
	@Then("^User checks user first name is present$")
	public void User_checks_user_first_name_is_present(){
		String Value = driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
		
		Assert.assertEquals("David", Value);
	}

}
