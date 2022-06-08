package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class AmzonAccntCreate {
	
	WebDriver driver = null;

	@Given ("User is on Create Accoun page")
	public void user_Is_On_Main_Page() {

	}
	@When("User enter value name and EmailAddress")
	public void User_Enter_Value_Name_And_EmailAddress()
	{
       System.out.println("Account Creation");
	}
	@And("User  enter password on passwordfeild")
	public void User_Enter_Password_On_Passwordfeild() {
        System.out.println("Entering Password");
	}
	@And("User re-enter password on passwordfeild")
	public void User_re_Enter_Password_On_Passwordfeild(){	
		
		System.out.println("Re-Entering Password");
	}
	@Then("User is click on CreateYourAmazonAccount Button")
	public void User_is_Click_On_CreateYourAmazonAccount_Button() {
		System.out.println("Click on Creating Account Button");

	}
}
