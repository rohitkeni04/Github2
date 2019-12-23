package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cc1 {
	WebDriver driver;
	@Given("the user is on Testme app home page")
	public void the_user_is_on_Testme_app_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Rohit\\RohitDownload\\chromedriver_win32\\chromedriver.exe\\");
        driver=new ChromeDriver();
    	driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	}
	@When("the user clicks on Signup")
	public void the_user_clicks_on_Signup() {
		driver.findElement(By.linkText("SignUp")).click();
		driver.findElement(By.id("firstName")).sendKeys("ssssss");
		driver.findElement(By.id("lastName")).sendKeys("ssssss");
		driver.findElement(By.id("password")).sendKeys("sssssss");
		driver.findElement(By.id("pass_confirmation")).sendKeys("sssssss");
		driver.findElement(By.cssSelector("Input[id='gender'][value='Male']")).click();
		driver.findElement(By.id("emailAddress")).sendKeys("ssss@g.com");
		driver.findElement(By.id("mobileNumber")).sendKeys("9999999999");
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		Select date = new Select(driver.findElement(By.className("ui-datepicker-year")));
		date.selectByValue("1997");
		Select date1 = new Select(driver.findElement(By.className("ui-datepicker-month")));
		date1.selectByValue("0");
		driver.findElement(By.linkText("12")).click();
		driver.findElement(By.id("address")).sendKeys("ssssssssssss");
		Select q = new Select(driver.findElement(By.id("securityQuestion")));
		q.selectByValue("411012");
		driver.findElement(By.id("answer")).sendKeys("sssssss");
		driver.findElement(By.className("btn")).submit(); 
	}

	@Then("the user should be able to enter the registration details")
	public void the_user_should_be_able_to_enter_the_registration_details() {
	    
		System.out.println("registration");

	}
}
