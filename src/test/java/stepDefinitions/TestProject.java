package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class TestProject {

	WebDriver driver = null;

	@Given("User is on main page")
	public void user_is_on_main_page() {
		System.setProperty("webdriver.chrome.driver", "C:/Selenium_Cucumber_Training/JavaSelenium/src\\test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://testproject.io/");

	}

	@When("User is enter email")
	public void user_is_enter_email() {
		driver.findElement(By.xpath("//input[@name='your-email']")).sendKeys("Ahmad@gamil.com");
	}

	@And("User is click AccountCreate button")
	public void user_is_click_account_create_button() {

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Kevin");
		driver.findElement(By.xpath("//input[@id='passwor']")).sendKeys("Ahmad@12342");

	}

	@Then("User is on next step")
	public void user_is_on_next_step() { 

		System.out.println("I m on the next page");
		driver.findElement(By.xpath("//span[@class='tp-checkbox-input-view']")).click();
		driver.findElement(By.className("tp-submit-wrapper")).click();
		driver.quit();

	}
}
