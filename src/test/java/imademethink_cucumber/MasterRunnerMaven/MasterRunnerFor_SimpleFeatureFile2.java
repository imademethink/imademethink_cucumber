package imademethink_cucumber.MasterRunnerMaven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		// to run individual feature file
		features = "src/test/resources/SimpleFeatureFile3_CucumberOptions.feature",
		
		// Colored output in CI/ CD environment e.g. Jenkins
		monochrome = true,

        plugin = {
//                    "pretty",										//  see console output difference
                     "html:target/cucumber2",             //  to see execution report in html format : open index.html file
                    "json:target/cucumber2/cucumber2.json",      // to pass on json output to next bild
        },

        
        glue = "imademethink_cucumber.StepDefinitions"
        
        )


public class MasterRunnerFor_SimpleFeatureFile2 {
	
}

