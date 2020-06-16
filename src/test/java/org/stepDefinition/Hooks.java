package org.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	public static WebDriver driver; // to access the Webdriver interface in all other classes we are creating as public statiuc
	
	@Before 
	public void Launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/workspace/HotelBooking/ChromeDriver/chromedriver.exe");
		
		
		driver = new ChromeDriver();
	}

}
