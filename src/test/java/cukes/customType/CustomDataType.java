package cukes.customType;

import java.util.Map;

import io.cucumber.java.DataTableType;
import cukes.pojos.BillingDetails;

public class CustomDataType {
	
	    @DataTableType
	    public BillingDetails billingDetailsEntry(Map<String, String> entry){
	        return new BillingDetails(entry.get("firstname"),
	                entry.get("lastname"),
	                entry.get("address_line1"),
	                entry.get("city"),
	                entry.get("state"),
	                entry.get("zip"),
	                entry.get("email"));
	    }

}
