package datatableSD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DatatableSD {
	
	WebDriver driver =null;
	
	@Given("^User need to be on Facebook login page$")
	public void User_need_to_be_on_Facebook_login_page(){
		System.setProperty("webdriver.gecko.driver", "C:\\Cucumber SetUp\\resources-driver\\geckodriver64bit.exe");
	  //System.setProperty("Webdriver.gecko.driver", "C:\\Cucumber SetUp\\resources-driver\\geckodriver64bit.exe");
		driver=new FirefoxDriver();
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
		
		String ActualValue= driver.findElement(By.xpath("//input[@name='reg_email__']")).getText();
		System.out.println(ActualValue);
		Assert.assertEquals("", ActualValue);
		Thread.sleep(2000);
		
	}
	
	@Then("^close browser$")
	public void close_browser(){
		driver.quit();
		driver = null;
	}
	
	@When("^Entered following data$")
	public void Entered_following_data(DataTable table){
		
		List<List<String>> data = table.raw();
		
		String Values1 = data.get(0).get(0);
		String Values2 = data.get(0).get(1);
		String Values3 = data.get(0).get(2);
		
		String Values4 = data.get(1).get(0);
		String Values5 = data.get(1).get(1);
		String Values6 = data.get(1).get(2);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(Values4);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Values5);
	}

}
