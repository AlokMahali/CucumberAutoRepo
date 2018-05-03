package datatableSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			
					monochrome=true,
					//dryRun=false,
					features={"src/main/java/datatableFF"},
					glue={"datatableSD"},
							//features={"src/main/java/Resources"},
							//glue={"CucumberAutomation"},
			
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report4.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport9.html"
					}
			
			
			
			)
		

	
	public class RunDatatableSDTest {

}
