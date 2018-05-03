package shareDataSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			
					monochrome=true,
					//dryRun=false,
					features={"src/main/java/shareDataFF"},
					glue={"shareDataSD"},
							//features={"src/main/java/Resources"},
							//glue={"CucumberAutomation"},
			
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report9.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport2.html",
					}
			
			
			
			)
		

	
	public class RunShareDataSDTest {

}
