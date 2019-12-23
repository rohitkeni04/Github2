package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class democucumber {
	WebDriver d;
	@Given("Testmeapp home page is opened")
	public void testmeapp_home_page_is_opened() {
		System.setProperty("webdriver.chrome.driver","C:\\Rohit\\RohitDownload\\chromedriver_win32\\chromedriver.exe\\");
        d=new ChromeDriver();
		d.get("http://demowebshop.tricentis.com/");
		
		d.findElement(By.className("ico-login")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("signin page is Displayed")
	public void signin_page_is_Displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	
	

	@When("I provide {string} and {string}")
	public void i_provide_and(String Login, String Password) {
		
		
		d.findElement(By.id("Email")).sendKeys(Login);
		d.findElement(By.id("Password")).sendKeys(Password);
		d.findElement(By.cssSelector("input[value='Log in']")).submit();
		
		
		
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("the relevant Login username is displayed")
	public void the_relevant_Login_username_is_displayed() throws InterruptedException {
		
		System.out.println("----------------");
		System.out.println("----------------");
		System.out.println("Login Successful");
		System.out.println("----------------");
		System.out.println("----------------");
		d.findElement(By.linkText("Log out")).click();
		Thread.sleep(3000);
		d.close();
		
		
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}

