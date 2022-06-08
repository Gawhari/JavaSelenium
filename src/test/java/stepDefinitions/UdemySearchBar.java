package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class UdemySearchBar {


	WebDriver driver = null;


	@Given("User is on login pgae")
	public void user_is_on_login_pgae() {
		
       
		System.setProperty("webdriver.chrome.driver", "C:/Selenium_Cucumber_Training/JavaSelenium/src\\test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");

	}
	@And("User is click on LearningPath")
	public void user_is_click_on_learning_path() {
		//driver.findElement(By.className("new-navbar-highlighter")).click();
	    System.out.println("Entering to learning path");
	}

	@When("User enter text into searchbar")
	public void user_enter_text_into_searchbar() {
    //driver.findElement(null);
		System.out.println("User is entering value to searchbar");

	}


	@And("User hits Enterkey")
	public void user_hits_enterkey() {

		System.out.println("User hits Enter key");

	}

	@Then("User is navegated to the search result")
	public void user_is_navegated_to_the_search_result() {

		System.out.println("User is navegating to the value");
		driver.close();

	}

}
