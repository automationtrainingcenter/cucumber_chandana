package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ebanking.cucumber_bank.BrowserHelper;

public class LoginSteps extends BrowserHelper {

	@Given("user is in bank home page")
	public void user_is_in_bank_home_page() {
		launchBrowser("chrome", "http://srssprojects.in");
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
	}

	@When("user enters valid password")
	public void user_enters_valid_password() {
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("login")).click();
	}

	@Then("user can see admin home page with logout link")
	public void user_can_see_admin_home_page_with_logout_link() {
		Assert.assertTrue(driver.getCurrentUrl().contains("adminflow"));
	}

}
