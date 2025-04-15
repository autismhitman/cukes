package cukes.runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import net.bytebuddy.implementation.bind.annotation.Super;

@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json"}, 	 
		glue = {"cukes"},
	    features = {"src/test/resources/cukes/features"},
	    dryRun= false
		)
//"stepdefinitions","pages","pojos","drivers","constants","customType","util"
public class RunnerTest extends AbstractTestNGCucumberTests{
	
	 @Override
	 @DataProvider(parallel= true)
	 public Object[][] scenarios(){
		 return super.scenarios();
	 }

}


//AddProductToCart.feature//guest_place_an_order.feature