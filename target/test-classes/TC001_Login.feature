@tag
Feature: Validate Login
  I want to use this template for my feature file

  Background: To verify Login functionality
    Given Launch the URL
    When Enter username and password
    Then User is in home page

  @tag2
  Scenario Outline: To Search Hotel
    Given User select hotel details in search hotel page "<Location>","<Hotels>","<RoomType>","<noofRom>","<InDate>","<outDate>","<adult>","<child>"
    When Click Search
    Then User is in select hotel
    When user select hotel and click on continue
    Then User is in Book Hotel page
    When user enter details in the Book hotel page  "<Fname>","<Lname>","<address>","<CreditNo>","<CardType>"
    And User enter card details and  "<ExpiryMo>","<ExpiryYear>","<CVV>"
    Then User is in Hotel Booking Confirmation 
    

    Examples: 
      | Location | Hotels       | RoomType     | noofRom | InDate    | outDate   | adult | child | Fname  | Lname  | address       | CreditNo         | CardType    | ExpiryMo | ExpiryYear | CVV |
      | Sydney   | Hotel Creek  | Double       |       2 | 5/02/2020 | 6/02/2020 |     1 |     1 | swathi | Sweety | Green Road    | 8521036974107894 | Visa        | January  |       2021 | 800 |
      | New York | Hotel Hervey | Super Deluxe |       1 | 6/02/2020 | 8/02/2020 |     2 |     1 | Swetha | Gideon | Sunshine Road | 8521036974107800 | Master Card | July     |       2022 | 750 |
