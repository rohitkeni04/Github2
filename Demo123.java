package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Demo123{
WebDriver d;

	@Given("john launched chrome browser")
	public void john_launched_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Rohit\\RohitDownload\\chromedriver_win32\\chromedriver.exe\\");
        d=new ChromeDriver();
	   
	}

	@Given("provided testmeapp site url")
	public void provided_testmeapp_site_url() {
		d.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	  
	}

	@When("he clicks on the login")
	public void he_clicks_on_the_login() {
		
		d.findElement(By.linkText("SignIn")).click();

	}

	@Then("he shall be able to provide the credentials")
	public void he_shall_be_able_to_provide_the_credentials() {
		d.findElement(By.name("Username")).sendKeys("Lalitha");
		d.findElement(By.name("Password")).sendKeys("Password123");
	}

	@When("he clicks on the register link")
	public void he_clicks_on_the_register_link() {
		d.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/li[2]/a"));
		
		
	}

	@Then("he shall be able to provide the registration details")
	public void he_shall_be_able_to_provide_the_registration_details() {
		
	    System.out.println("provide registration details");
	}

}
