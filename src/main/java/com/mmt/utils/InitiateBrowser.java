package com.mmt.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InitiateBrowser {
    
     static InitiateBrowser initiateBrowser;
	
	private ChromeOptions chromeOptions;
	private static WebDriver driver;
	
    public final static int TIMEOUT = 10;
	
	
	public  InitiateBrowser() {
		System.setProperty("webdriver.chrome.driver", ProjectConstants.driverPath);
		chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		chromeOptions.addArguments("disable-infobars");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	}     
               
    public static void openPage(String url) {
        driver.get(url);
    }
           
    public static WebDriver getDriver() {
        return driver;              
    }
       
    public static void setUpDriver() {
     
		try {
			if (initiateBrowser==null) {
			       
				try {
					initiateBrowser = new InitiateBrowser();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
       
    public static void tearDown() {
            
        if(driver!=null) {
            driver.close();
             driver.quit();
        }
            
        initiateBrowser = null;
   } 
     
}


