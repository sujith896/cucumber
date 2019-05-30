package runner;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
		features = "src\\main\\java\\featurefiles", //the path of the feature files
		glue={"stepDefinitions"},//the path of the step definition files//
		format= {"pretty","html:test-output","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting//"json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"
		monochrome = true ,//display the console output in a proper readable format
		strict = false, //it will check if any step is not defined in step definition file
		dryRun = false,//to check the mapping is proper between feature file and step def file
		tags= {"@Regression"}
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
		)


public class TestRunner2  extends AbstractTestNGCucumberTests {

}