package tests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.mmt.utils.InitiateBrowser;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	
	 @Before
	    public static void setUp() {
	 
		 InitiateBrowser.setUpDriver();
	    }
	 
	    @After
	    public static void tearDown(Scenario scenario) {
	 
	        //validate if scenario has failed
	        if(scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot) InitiateBrowser.getDriver()).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName()); 
	        }   
	         
	        InitiateBrowser.tearDown();
	    }
	 
}
