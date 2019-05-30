package stepDefinitions;

import org.openqa.selenium.By;
import cucumber.api.java.en.Then;
import testBase.Base;



public class CheckBoxDemo extends Base {
	@Then("^click on check box demo$")
	public void click_on_check_box_demo()  {
		
		driver.findElement(By.xpath("//*[text()='Checkbox Demo']")).click();
	   
	}

	@Then("^validate checkboxes$")
	public void validate_checkboxes() throws InterruptedException  {
		
		driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
		Thread.sleep(5000);
	//	driver.findElement(By.xpath("//*[@value='Check All']")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@value='Uncheck All']")).click();
		//Thread.sleep(5000);
		
		
	    	}

}
