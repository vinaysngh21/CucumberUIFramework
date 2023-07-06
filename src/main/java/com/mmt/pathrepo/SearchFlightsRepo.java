package com.mmt.pathrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFlightsRepo {
	
	public String selectedFromSyuggestions;
	
	//public static String roundtripXpath = "//*[text()='Round Trip']";
	
	@FindBy(xpath = "//*[text()='Round Trip']")
	public WebElement roundtripXpath;
	
	@FindBy(xpath = "//*[@placeholder='From']")
	public WebElement originAirport;
	
	
	@FindBy(xpath = "//*[@role='option']")
	public WebElement originSuggestions;
	
	
	//*[@id='departure']
	
	//*[@aria-label='Tue Aug 15 2023']

	
	@FindBy(xpath = "//*[@id='fromCity']")
	public WebElement fromCity;



	public String getSelectedFromSyuggestions() {
		return selectedFromSyuggestions;
	}



	public void setSelectedFromSyuggestions(String selectedFromSyuggestions) {
		this.selectedFromSyuggestions = selectedFromSyuggestions;
	}
	
	
	
	

}
