package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class RahulPageCreatingAccnt {
	RahulPageCreatingAccnt create;
	WebDriver driver = null;


	

	@Given("User is on crating page")
	public void User_is_on_crating_page() {
		System.setProperty("webdriver.chrome.driver", "C:/Selenium_Cucumber_Training/JavaSelenium/src\\test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://sso.teachable.com/secure/9521/identity/sign_up/email");
		System.out.println("I m creating account");
	}

	@When("^User is enter (.*) and (.*)$")
	public void User_is_enter_fullName_and_Email(String fullName, String Email) {

		create = new RahulPageCreatingAccnt(driver);
		create.User_is_enter_fullName_and_Email(fullName, Email);
	}

	@And("^User is enter (.*)$")
	public void User_is_enter_password(String password) {
		create.User_is_enter_password(password);
	}

	@Then("User is click on check button")
	public void User_is_click_on_check_button(){
		create.User_is_click_on_check_button();
	}
	@And ("User is hit SighUp button")
	public void User_is_hit_SighUp_button() {
		create.User_is_hit_SighUp_button();

	}

}


