package multiSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			
					monochrome=true,
					dryRun=false,
					features={"src/main/java/multiFF"},
					glue={"multiSD"},
							//features={"src/main/java/Resources"},
							//glue={"CucumberAutomation"},
			
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report7.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport4.html"
					}
			
			
			
			)
		

	
	public class RunMultiSDTest {

}
