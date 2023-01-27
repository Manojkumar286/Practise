package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\insta\\com\\features",glue="insta.com.stepdefinition",tags = " @Instagram",
dryRun = false,stepNotifications = true,plugin ={"html:target\\report\\Instagram.html","json:target\\report\\Instagram.json"} )
public class Runner {

}
