package tagsSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			
					monochrome=true,
					//dryRun=false,
					// tags={"@Important"}, //All scenario will be executed if it is tagged to feature file
					//tags={"@Smoke"}, Only tags with @Smoke
					//tags={"@Smoke","@Regression"},//And condition
					tags={"@Smoke,@Regression"}, //OR condition
					
					features={"src/main/java/tagsFF"},
					glue={"tagsSD"},
							//features={"src/main/java/Resources"},
							//glue={"CucumberAutomation"},
			
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report10.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
					}
			
			
			
			)
		

	
	public class RunTagsSDTest {

}
