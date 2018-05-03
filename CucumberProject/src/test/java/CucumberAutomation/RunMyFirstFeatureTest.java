package CucumberAutomation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			
					monochrome=true,
					dryRun=true,
					features={"src/main/java/Resources"},
					glue={"CucumberAutomation"},
			
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report2.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport11.html"
					}
			
			
			
			)
		
	
	
	
	public class RunMyFirstFeatureTest {

}
