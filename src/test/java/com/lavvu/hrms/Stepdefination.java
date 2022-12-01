package com.lavvu.hrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Stepdefination {
	public WebDriver driver;
	@Given("Openapplication")
	public void openapplication() {
		System.setProperty("webdriver.chrome.driver", "D:\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("open application");
		
	}

	@When("loginApplication")
	public void login_application() {
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Login into Application");
	  
	    
	}

	@Then("CloseApplication")
	public void close_application() {
		driver.close();
		System.out.println("Closed Application");
		
		
	    
	}

@When("verify title")
public void verify_title() {
	System.out.println(driver.getTitle());
}





}
