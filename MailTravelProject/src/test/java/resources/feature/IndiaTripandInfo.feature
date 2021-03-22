@all
Feature:  Trip to India
  As a customer
  I want to search for trip to India with all the valid information
  So I can book trip and accomadation in India successfully

  Background:
    Given I am on the 'MailTravel' home page
    And I accept all cookies

  @trip
  Scenario: Fill all details and book the dates for trip to India
    When I enter 'India' in the search box
    Then I landed in the page which listed tourism in India
    When I click on 'More Info' button
    Then Verify the date and the price for travelling
    And Verify the telephone number provided in the details
    When I click on the itineary tab
    When I click on 'Book Online' button
    Then Verify the first date of availability
    And Verify date available should be departure date
    And Click on 'Select. button and view transport info
    When I enter the details for standard room in accomodation
    And I click on 'Select Accomodatio' button
    And I continue without 'Extras'
    When I enter the passengers info
      | Field       |     Value    |
      | title       |  title p1    |
      | fname1      | first name1  |
      | lastname    | last name    |
      | dobday1     |  dob day1    |
      | dobmon1     | dob mon1     |
      | dobyrs1     | dob yrs1     |
    And I enter the passengers info for second adult
      | Field       |     Value    |
      | title       |  title p2    |
      | fname2      | first name2  |
      | lastname    | last name    |
      | dobday2     |  dob day2    |
      | dobmon2     | dob mon2     |
      | dobyrs2     | dob yrs2     |
    And I enetr the Lead Contact Details
      | Field       |     Value    |
      | name        |  name lead   |
      | phome       | phone num    |
      | emailadd    | email add    |
      | add1        |  add det1    |
      | add2        | add det2     |
      | city        | city det     |
      | postcode    | post code    |
      | hearyou     | hear you     |
    And I click on 'Continue' button


   @alert
  Scenario: Sign up for newsletter
    And I click on signup for newsletter link
    When I enter the details to sign up for newsletter
      | Field       |     Value    |
      | title       |  name lead   |
      | email       | email add    |
      | fname       | first name1  |
      | lname       |  last name   |
      | postcode    | post code    |
      | phoneNo     | phone num    |
     And I check terms and conditions
     And I click on 'Sign-Up' button
     Then I landed in confirmation page


