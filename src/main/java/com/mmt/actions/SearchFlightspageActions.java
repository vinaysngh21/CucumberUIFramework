package com.mmt.actions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.mmt.pathrepo.SearchFlightsRepo;
import com.mmt.utils.InitiateBrowser;

public class SearchFlightspageActions {

	SearchFlightsRepo searchFlights = null;
	WebDriver drive;

	public SearchFlightspageActions() {
		this.drive = InitiateBrowser.getDriver();
		this.searchFlights = new SearchFlightsRepo();
		PageFactory.initElements(InitiateBrowser.getDriver(), searchFlights);
	}

	public void clickRoundTripRadioButton() {
		searchFlights.roundtripXpath.click();
	}
	public void clickFromCity() {
		searchFlights.fromCity.click();
	}
	
	public void setOriginAirport() {
		searchFlights.originAirport.sendKeys("Mumbai");
	}

	public void selectFromOriginList() {
		String valueSelected ;
		List<WebElement> opt = searchFlights.originSuggestions.findElements(By.xpath("//*[@role='option']//p"));
		
		Iterator<WebElement> itr =  opt.iterator();
		while(itr.hasNext()) {
			String city =itr.next().getText();
			
			if(city.equals("Mumbai, India")) {
				System.out.println(city);
				valueSelected = createDynamicXpath(city);
				searchFlights.setSelectedFromSyuggestions(valueSelected);
			}
		}
		drive.findElement(By.xpath(searchFlights.getSelectedFromSyuggestions())).click();
		
		
	}

	
	public static String createDynamicXpath(String city) {
		StringBuilder  strBldr = new StringBuilder("//*[@role='option']//p[contains(text(),'");
		strBldr.append(city);
		strBldr.append("')]");
		System.out.println(strBldr.toString());
		return strBldr.toString();
	}
}
