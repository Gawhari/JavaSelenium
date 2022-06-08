package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RahulPageCreatingAccnt {
	
	WebDriver driver;
 
	By txt_fullName = By.id("user_name");
	By tx_email = By.id("user_email");
	By tx_password = By.id("password");
	By txt_checkButton = By.id("id=\"allow_marketing_emails\"");
	By txt_signUpButton = By.name("commit");
	
	public RahulPageCreatingAccnt(WebDriver driver) {  // this constructor
		this.driver = driver;
	}
	
	public void enterFullName(String fullName) {
		driver.findElement(txt_fullName).sendKeys(fullName);
	}
	
	public void enterEmail(String email) {
		driver.findElement(tx_email).sendKeys(email);
		
	}
	
	public void enterPassword(String password) {
		driver.findElement(tx_password).sendKeys(password);
		
	}
	
	public void checkButton() {
		driver.findElement(txt_checkButton).click();
	}
	
	public void signUpButton() {
		driver.findElement(txt_signUpButton).click();
	}
	
//	public void createAccount(String fullName, String email, String password) { // Sample for real job
//		driver.findElement(tx_email).sendKeys(email);
//		driver.findElement(tx_password).sendKeys(password);
//		driver.findElement(txt_checkButton).click();
//		driver.findElement(txt_checkButton).click();
//		driver.findElement(txt_signUpButton).click();
//	}
	
}
 