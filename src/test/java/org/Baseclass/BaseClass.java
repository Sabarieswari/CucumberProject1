package org.Baseclass;

import org.openqa.selenium.WebElement;
import org.stepDefinition.Hooks;

public class BaseClass {
	
	public static void launchapp (String s)
	{
	
	Hooks.driver.get(s);
	}

	public static void type1(WebElement w, String s)
	{
		w.sendKeys(s);
	}

	public static void click1(WebElement w) 
	{
		w.click();
	}
}