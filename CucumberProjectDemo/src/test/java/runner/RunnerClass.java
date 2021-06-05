package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "featureFiles", 
		glue = {"stepDefinitions","hooks"},
		dryRun = false,
//		strict = true,
//		monochrome = true,
//		plugin= {"html:report/webreport","json:report/jsonreport.json","junit:report/xmlreport.xml" },  //Format is deprecated then only we use plugin
		tags = {"@Hooks"} // Ignore the tests using tag - ~
		
		
		)



public class RunnerClass {
	
		//it should combine the feature file and the step definition
		//Runner define

}
