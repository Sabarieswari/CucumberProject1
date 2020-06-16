package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepDefinition.Hooks;

public class BookingConfirmation {
	
	public BookingConfirmation()
	
	{
		PageFactory.initElements(Hooks.driver, this);
	}
	
	@FindBy(id="search_hotel")
	private WebElement btnSearchHotel;
	
	@FindBy(id="my_itinerary")
	private WebElement btnMyItenerary;
	
	@FindBy(id="logout")
	private WebElement btnLogout;

	public WebElement getBtnSearchHotel() {
		return btnSearchHotel;
	}

	public WebElement getBtnMyItenerary() {
		return btnMyItenerary;
	}

	public WebElement getBtnLogout() {
		return btnLogout;
	}
	
	

}
