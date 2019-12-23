package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class firstcucumber {
	WebDriver d;
	@Given("the user is on testme app home page")
	public void the_user_is_on_testme_app_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Rohit\\RohitDownload\\chromedriver_win32\\chromedriver.exe\\");
        d=new ChromeDriver();
		d.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("the user gives valid id and valid password")
	public void the_user_gives_valid_id_and_valid_password() {
		d.findElement(By.linkText("SignIn")).click();
		d.findElement(By.name("userName")).sendKeys("Lalitha");
		d.findElement(By.name("password")).sendKeys("Password123");
		d.findElement(By.name("Login")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("the user should be able to login")
	public void the_user_should_be_able_to_login() {
		
		String UserName=d.findElement(By.cssSelector("ul.nav.navbar-nav")).getText();
		
		System.out.println("----------------");
		System.out.println("----------------");
		System.out.println("Login Successful");
		System.out.println("----------------");
		System.out.println("----------------");
		d.close();
		
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	
	
	
	
	
	
	

}
