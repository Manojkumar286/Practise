package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\java\\insta\\com\\features",glue="insta.com.stepdefinition",tags = " @Instagram",
dryRun = false,plugin ={"html:target\\report\\Instagram.html","json:target\\report\\Instagram.json"} )
public class Runner extends AbstractTestNGCucumberTests{

}
