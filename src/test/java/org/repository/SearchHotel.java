package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepDefinition.Hooks;

public class SearchHotel {


	public SearchHotel()
	
	{
		PageFactory.initElements(Hooks.driver,this);
		

	}
	
	@FindBy(id="location")
	private WebElement ddLoc;
	
	
	@FindBy(id="hotels")
	private WebElement ddHot;
	
	@FindBy(id="room_type")
	private WebElement ddRoom;
	
	@FindBy (id="room_nos")
	private WebElement ddRomNo;
	
	@FindBy (id="datepick_in")
	private WebElement txtInDate;
	
	@FindBy (id="datepick_out")
	private WebElement txtoutDate;
	
	
	@FindBy (id="adult_room")
	private WebElement ddAdult;
	
	@FindBy (id="child_room")
	private WebElement ddChild;
	
	@FindBy	(id="Submit")
	private WebElement btnSearch;
	
	@FindBy (id="Reset")
	private WebElement btnReset;

	public WebElement getDdLoc() {
		return ddLoc;
	}

	public WebElement getDdHot() {
		return ddHot;
	}

	public WebElement getDdRoom() {
		return ddRoom;
	}

	public WebElement getDdRomNo() {
		return ddRomNo;
	}

	public WebElement getTxtInDate() {
		return txtInDate;
	}

	public WebElement getTxtoutDate() {
		return txtoutDate;
	}

	public WebElement getDdAdult() {
		return ddAdult;
	}

	public WebElement getDdChild() {
		return ddChild;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getBtnReset() {
		return btnReset;
	}
	
	

}
