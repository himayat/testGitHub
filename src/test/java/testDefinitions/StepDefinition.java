package testDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class StepDefinition {

	@Given("^User is on Home Page$")
	public void user_is_already_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suresh\\Desktop\\lavanya\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Using get() method to open a webpage
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 12");
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println("user logged in");
	}

}
