package stepDefinitions;

import org.openqa.selenium.By;
import cucumber.api.java.en.Then;
import testBase.Base;


public class SimpleFormDemo  extends Base{
	
	@Then("^click on simple form demo$")
	public void click_on_simple_form_demo()  {
		driver.findElement(By.xpath("//*[text()='Simple Form Demo']")).click();
	  
	}

	@Then("^enter the inputs$")
	public void enter_the_inputs() throws InterruptedException  {
		driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello this is cucumber");
		driver.findElement(By.xpath("//*[text()='Show Message']")).click();
	    driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("4");
	    driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("9");
	    driver.findElement(By.xpath("//*[text()='Get Total']")).click();
	    Thread.sleep(5000);
	   // Assert.assertEquals(false, true);
	}

}
