package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Then;
import testBase.Base;

public class SelectDropDown extends Base{
	
	
	@Then("^click on select dropdown list$")
	public void click_on_select_dropdown_list()  {
		
		driver.findElement(By.xpath("//*[text()='Select Dropdown List']")).click();	   
	}

	@Then("^user selects single and multi select$")
	public void user_selects_single_and_multi_select() throws InterruptedException  {
		
		WebElement ele=driver.findElement(By.xpath("//*[@class='form-control']"));
		Select s= new Select(ele);
		s.selectByVisibleText("Monday");
	   
		
		WebElement ele1=driver.findElement(By.name("States"));
		Select sel= new Select(ele1);
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(sel.getOptions().get(1)).click(sel.getOptions().get(4)).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.id("printAll")).click();
		Thread.sleep(5000);
		
		
	}

}
