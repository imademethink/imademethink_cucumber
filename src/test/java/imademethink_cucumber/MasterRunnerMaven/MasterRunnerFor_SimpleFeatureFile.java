package imademethink_cucumber.MasterRunnerMaven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		// to run individual feature file
		features = "src/test/resources/SimpleFeatureFile.feature",
//		features = "src/test/resources/SimpleFeatureFile2_ScenarioOutline.feature",
//		features = "src/test/resources/SimpleFeatureFile3_CucumberOptions.feature",
		// to run list of feature files
//		features = {"src/test/resources/SimpleFeatureFile.feature","src/test/resources/SimpleFeatureFile2_ScenarioOutline.feature"},
		// to run all feature files under a particular folder
//		features = "src/test/resources",
		// to run all feature files under a list of folder
//		features = {"src/test/resources/module1","src/test/resources/module2"},

		
		// true  = To fail test case if step is not implemented
		// false = To pass test case if step is not implemented
//		strict = false,

		
		// Colored output in CI/ CD environment e.g. Jenkins
		monochrome = true,


        plugin = {
//                    "pretty",										//  see console output difference
                       "html:target/cucumber",             //  to see execution report in html format : open index.html file
                       "json:target/cucumber/cucumber.json",      // to pass on json output to next bild
        },
        
				// tag are used to filter specific tests
//				tags 			= {"@tag1"},						                 // single tag
//				tags 			= {"~@tag1"},                                     // everything else (with or without tag) but not @tag1
//				tags 			= {"@tag1,@tag22,@tag6"},            // @tag1 OR @tag22 OR @tag6
//				tags 			= {"@tag11","@tag22"},                   // @tag11 AND @tag22
//				tags 			= {"@tag1","@tag22","@tag6"},      // @tag1 AND @tag3 AND @tag6

        glue = "imademethink_cucumber.StepDefinitions"
        
        )


public class MasterRunnerFor_SimpleFeatureFile {
	
}

