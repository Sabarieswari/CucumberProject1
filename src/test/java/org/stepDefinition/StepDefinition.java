package org.stepDefinition;

import org.Baseclass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.repository.BookHotel;
import org.repository.BookingConfirmation;
import org.repository.Login;
import org.repository.SearchHotel;
import org.repository.SelectHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinition extends BaseClass {
	
	Login l = new Login();
	SearchHotel s = new SearchHotel();
	SelectHotel sh = new SelectHotel();
	BookHotel bh = new BookHotel();
	BookingConfirmation bc = new BookingConfirmation();
	
	@Given("Launch the URL")
	public void launch_the_URL()
	{
		launchapp("https://adactin.com/HotelAppBuild2/index.php"); 
		Hooks.driver.manage().window().maximize();

	}

	@When("Enter username and password")
	public void enter_username_and_password() {
		
		type1(l.getTxtUsername(),"DarkDevil");
		type1(l.getTxtPassword(),"happy@2020");
		click1(l.getBtnlogin());
	    
	}

	@Then("User is in home page")
	public void user_is_in_home_page() {
	   
		Assert.assertTrue(Hooks.driver.getTitle().contains("Search Hotel"));
	}

	@Given("User select hotel details in search hotel page {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_select_hotel_details_in_search_hotel_page(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8) 
	{
		type1(s.getDdLoc(),s1);
		   type1(s.getDdHot(),s2);
		   type1(s.getDdRoom(),s3);
		   type1(s.getDdRomNo(),s4);
		   type1(s.getTxtInDate(),s5);
		   type1(s.getTxtoutDate(),s6);  
		   type1(s.getDdAdult(),s7);
		   type1(s.getDdChild(),s8);
	}

	@When("Click Search")
	public void click_Search()
	{
		 click1(s.getBtnSearch());
	}

	@Then("User is in select hotel")
	public void user_is_in_select_hotel() 
	{
		Assert.assertTrue(Hooks.driver.getTitle().contains("Select Hotel"));
	}

	@When("user select hotel and click on continue")
	public void user_select_hotel_and_click_on_continue() 
	{
	
		click1(sh.getRbselecthotel());
		click1 (sh.getBtnContinue());
	}

	@Then("User is in Book Hotel page")
	public void user_is_in_Book_Hotel_page() 
	{
		Assert.assertTrue(Hooks.driver.getTitle().contains("Book A Hotel"));
	}

	@When("user enter details in the Book hotel page  {string},{string},{string},{string},{string}")
	public void user_enter_details_in_the_Book_hotel_page(String s1, String s2, String s3, String s4, String s5)
	{
		type1(bh.getTxtFname(),s1);
		type1(bh.getTxtLname(),s2);
		type1(bh.getTxtAddress(),s3);
		type1(bh.getTxtCard(),s4);
		type1(bh.getDdCardtype(),s5);	
	}

	@When("User enter card details and  {string},{string},{string}")
	public void user_enter_card_details_and(String s1, String s2, String s3) throws Exception 
	{
		type1(bh.getDdMonth(),s1);
		type1(bh.getDdYear(),s2);
		type1(bh.getTxtCVV(),s3);
		click1(bh.getBtnBookNow());
		Thread.sleep(7000);
		
	}

	@Then("User is in Hotel Booking Confirmation")
	public void user_is_in_Hotel_Booking_Confirmation()
	{
		
		JavascriptExecutor js = (JavascriptExecutor)Hooks.driver;
		WebElement down = Hooks.driver.findElement(By.id("last_name"));
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		js.executeScript("arguments[0].click1", bc.getBtnLogout());

		
		//Assert.assertTrue(Hooks.driver.getTitle().contains("Hotel Booking"));
	}





	
}