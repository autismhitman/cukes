package cukes.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import cukes.pages.CartPage;
import cukes.pages.PageManager;
import cukes.pages.StorePage;
import cukes.pojos.Product;

public class StoreStepDefn {
 
	
	@Given("I am on the store page")
	public void i_am_in_the_store_page() {
		PageManager.getSp().navigateToStore();
	}

	@When("I add a {product} to the cart")
	public void i_add_a_to_the_cart(Product product) {
		
		PageManager.getSp().addToCart(product.getProductName());
		 
	}
}
