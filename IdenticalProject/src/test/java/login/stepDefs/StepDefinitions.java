package login.stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	static WebDriver driver;
	
	@Given("^User able to open a any browser$")
	public void user_able_to_open_a_any_browser()  {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	   driver.manage().window().maximize();
	}

	@Given("^User able to enter \"([^\"]*)\" url$")
	public void user_able_to_enter_url(String URL)  {
		driver.get(URL);
	    
	   
	}

	@When("^User able to click on sign-in button$")
	public void user_able_to_click_on_sign_in_button()  {
	    
	   
	}

	@When("^User able to enter valid userName \"([^\"]*)\" & password \"([^\"]*)\"$")
	public void user_able_to_enter_valid_userName_password(String arg1, String arg2)  {
	    
	   
	}

	@When("^User able to click on login button$")
	public void user_able_to_click_on_login_button()  {
	    
	   
	}

	@Then("^User can verify the user information on the grid$")
	public void user_can_verify_the_user_information_on_the_grid()  {
	    
	   
	}
}
