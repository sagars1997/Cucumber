package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/Login/login.feature"}, glue = {"Definition"})
public class Test_Runner extends AbstractTestNGCucumberTests 
{
	


}
