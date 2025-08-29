package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
		driver.get("https://ess.changepond.com/#/");
//	    throw new io.cucumber.java.PendingException();
	}

	@When("User Enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("empid")).sendKeys("4724");
		driver.findElement(By.name("password")).sendKeys("142701");
//	    throw new io.cucumber.java.PendingException();
	}

	@When("Click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should navigate on next page")
	public void user_should_navigate_on_next_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}




}
