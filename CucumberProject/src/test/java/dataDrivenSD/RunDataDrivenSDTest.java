package dataDrivenSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			
					monochrome=true,
					//dryRun=false,
					features={"src/main/java/dataDrivenFF"},
					glue={"dataDrivenSD"},
							//features={"src/main/java/Resources"},
							//glue={"CucumberAutomation"},
			
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report3.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport10.html"
					}
			
			
			
			)
		

	
	public class RunDataDrivenSDTest {

}
