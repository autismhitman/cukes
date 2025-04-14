package cukes.stepdefinitions;

import cukes.context.TestContext;
import io.cucumber.java.en.Given;
import cukes.pages.PageManager;
import cukes.pojos.BillingDetails;

public class CustomerStepDefinitions {
	
	TestContext context;
	 
	
	public CustomerStepDefinitions(TestContext context) {
		this.context = context;
	}
	
	@Given("I'm a guest customer")
	public void i_m_a_guest_customer() {
		PageManager.getSp().navigateToStore();

	}
	
	@Given("my billing details are")
	public void my_billing_details_are(BillingDetails billingDetails) {
	   context.billingDetails = billingDetails;
	 
	}
	
	

}
