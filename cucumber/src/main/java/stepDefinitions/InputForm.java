package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testBase.Base;

public class InputForm extends Base{
	
	//WebDriver driver;
	
	@Given("^User is in selenium easy homepage$")
	public void user_is_in_selenium_easy_homepage() throws IOException {
		
		loadPropertiesFile();
		launchBrowser();

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}

	
	@When("^Title of the pageis selenium easy$")
	public void title_of_the_pageis_selenium_easy() {
		
		String title= driver.getTitle();
		System.out.println(title);
	//	Assert.assertEquals("Learn Selenium with Best Practices and Examples | Selenium Easy", title);
	    }

	@Then("^click on demo website$")
	public void click_on_demo_website()  {
		
		driver.findElement(By.xpath("//*[text()='Demo Website!']")).click();
		
	    
	}

	@Then("^Title of the page is best demo website$")
	public void title_of_the_page_is_best_demo_website() {
		String title= driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals("Selenium Easy - Best Demo website to practice Selenium Webdriver Online", title);
	    
	}

	@Then("^click on input forms$")
	public void click_on_input_forms()  {
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
	    
	}

	@Then("^click on input form submit$")
	public void click_on_input_form_submit()  {
		driver.findElement(By.xpath("//*[text()='Input Form Submit']")).click();
	    
	}

	@Then("^user enters details and click on send$")
	public void user_enters_details_and_click_on_send() throws InterruptedException  {
		
		driver.findElement(By.name("first_name")).sendKeys("sujith");
		driver.findElement(By.name("last_name")).sendKeys("reddy");
		driver.findElement(By.name("email")).sendKeys("sujith.talamanchi@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("8686214972");
		driver.findElement(By.name("address")).sendKeys("marathahalli");
		driver.findElement(By.name("city")).sendKeys("banglore");
		
		Select s= new Select(driver.findElement(By.name("state")));
		s.selectByVisibleText("Georgia");
		driver.findElement(By.name("zip")).sendKeys("500038");
		driver.findElement(By.name("website")).sendKeys("www.google.com");
		driver.findElement(By.xpath("(//*[@name='hosting'])[1]")).click();
		driver.findElement(By.name("comment")).sendKeys("input form testing");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	  
	}
	
	@Then("^close the browser$")
	public void close_the_browser()
	{
		closeBrowser();
	}


}
