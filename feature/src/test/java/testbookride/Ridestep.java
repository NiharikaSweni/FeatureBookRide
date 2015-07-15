package testbookride;

import bookride.bookride;
import bookride.bookridebll;
import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Ridestep extends TestCase {
	bookride ride=new bookride();
	@Given("^user enter \"([^\"]*)\" as source and \"([^\"]*)\" as destination$")
	public void user_enter_as_source_and_as_destination(String src, String dest) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride.setSource(src);
		ride.setDest(dest);
		
	}

	@When("^click search$")
	public void click_search() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
	
	}

	@Then("^should get \"([^\"]*)\" as message$")
	public void should_get_as_message(String msg) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		bookridebll bll=new bookridebll();
		assertEquals(msg,bll.ValidateRide(ride));
		
	}

	
}
