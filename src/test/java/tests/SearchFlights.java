package tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.mmt.actions.SearchFlightspageActions;
import com.mmt.utils.InitiateBrowser;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchFlights {
	
	SearchFlightspageActions searchpageActions = new SearchFlightspageActions() ;
	
	
	@When("I open Browser")
	public void i_open_browser() {
	    InitiateBrowser.openPage("https://www.makemytrip.com/");
	}
   
	
	@Given("I want to write book a flight")
	public void i_want_to_write_book_a_flight() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		searchpageActions.clickRoundTripRadioButton();
	}
	
	@Given("select origin airport")
	public void select_origin_airport() {
	    // Write code here that turns the phrase above into concrete actions
	   searchpageActions.clickFromCity();
	   searchpageActions.setOriginAirport();
	}
	
	@Given("Select from List Of Airports")
	public void select_from_list_of_airports() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		searchpageActions.selectFromOriginList();
	}

	@Given("set date of journey")
	public void set_date_of_journey() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	
	}

	@When("I click on search")
	public void i_click_on_search() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("list of flights should be displayed")
	public void list_of_flights_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

}
