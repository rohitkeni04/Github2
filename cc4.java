package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cc4 {
	WebDriver driver;
	@Given("Alex has registered into myTestmeApp")
	public void alex_has_registered_into_myTestmeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\Rohit\\RohitDownload\\chromedriver_win32\\chromedriver.exe\\");
		 driver = new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
		 driver.findElement(By.linkText("SignIn")).click();
		  driver.findElement(By.name("userName")).sendKeys("Alex321");
		  driver.findElement(By.id("password")).sendKeys("123456");
		  driver.findElement(By.name("Login")).click();
	}

	@When("Alex searches a particular product likes headphones")
	public void alex_searches_a_particular_product_likes_headphones() {
	  
		driver.findElement(By.cssSelector("input[id='myInput']")).sendKeys("HeadPhone");
		  driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		  
	}

	@When("Try to proceed to Pay without adding item in the cart")
	public void try_to_proceed_to_Pay_without_adding_item_in_the_cart() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		
	}

	@Then("Testmeapp does'nt dispaly the cart icon")
	public void testmeapp_does_nt_dispaly_the_cart_icon() {
		Assert.assertEquals(driver.getTitle(),"View Cart");
		{
			System.out.println("alex is able to access the page");
		}
	  
	}

}
