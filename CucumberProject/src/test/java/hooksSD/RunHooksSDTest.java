package hooksSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			
					monochrome=true,
					//dryRun=false,
					features={"src/main/java/hooksFF"},
					glue={"hooksSD"},
							//features={"src/main/java/Resources"},
							//glue={"CucumberAutomation"},
			
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report5.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport8.html"
					}
			
			
			
			)
		

	
	public class RunHooksSDTest {

}
