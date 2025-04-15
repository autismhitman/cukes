package cukes.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	 
	public static  WebDriver getBrowser(String browser) {
		
		WebDriver driver = null;
		 
		switch(browser) {
		  
		case "chrome" ->{
			
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 
			 }
		case "edge" -> {
			   WebDriverManager.edgedriver().setup();
			   driver =new EdgeDriver();
		   }
		case "ff" -> {
			   WebDriverManager.firefoxdriver().setup();
			   driver =new FirefoxDriver();
		   }
		   default -> throw new IllegalStateException("INVALID BROWSER" + browser);
		}
		return driver;
	}

}
