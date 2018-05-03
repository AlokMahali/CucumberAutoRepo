package parameterisationSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			
					monochrome=true,
					//dryRun=false,
					features={"src/main/java/parameterisationFF"},
					glue={"parameterisationSD"},
							//features={"src/main/java/Resources"},
							//glue={"CucumberAutomation"},
			
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report8.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport3.html"
					}
			
			
			
			)
		

	
	public class RunParameterizationSDTest {

}
