package backgroundSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			
					monochrome=true,
					//dryRun=false,
					features={"src/main/java/backgroundFF"},
					glue={"backgroundSD"},
							//features={"src/main/java/Resources"},
							//glue={"CucumberAutomation"},
			
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report1.json",
					}
			
			
			
			)
		

	
	public class RunBackgroundSDTest {

}
