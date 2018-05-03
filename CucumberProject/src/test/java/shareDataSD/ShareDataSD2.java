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

public class ShareDataSD2 {
	
	WebDriver driver;
	
	public ShareDataSD2(SharedClass share){
		driver=share.Setup();
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
	
		
	/*@After
	public void tearDown(){
		System.out.println("After execution");
		driver.quit();
		driver = null;
	}*/
}
