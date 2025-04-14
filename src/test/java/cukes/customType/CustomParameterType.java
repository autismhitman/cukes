package cukes.customType;

import io.cucumber.java.ParameterType;
import cukes.pojos.Product;

public class CustomParameterType {

	@ParameterType(".*")
	public Product product(String name) {
		
		return new Product(name.replace("\"", ""));
	}
}
