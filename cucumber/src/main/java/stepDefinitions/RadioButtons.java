package stepDefinitions;

import org.openqa.selenium.By;
import cucumber.api.java.en.Then;
import testBase.Base;

public class RadioButtons extends Base {

	@Then("^click on radio buttons demo$")
	public void click_on_radio_buttons_demo()  {
		
		driver.findElement(By.xpath("//*[text()='Radio Buttons Demo']")).click();
	    
	}

	@Then("^perform radio button operations$")
	public void perform_radio_button_operations() throws InterruptedException  {
		
		driver.findElement(By.xpath("(//input[@value='Male'])[1]")).click();
		driver.findElement(By.xpath("//*[text()='Get Checked value']")).click();
		driver.findElement(By.xpath("(//input[@value='Male'])[2]")).click();
		driver.findElement(By.xpath("(//input[@name='ageGroup'])[2]")).click();
		driver.findElement(By.xpath("//*[text()='Get values']")).click();
		Thread.sleep(5000);
		
		
		
		
	    
	}
	
	
}
