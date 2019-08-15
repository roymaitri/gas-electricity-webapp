Feature: HomePage

Scenario: navigate to the homepage
Given Initialize the webdriver
And I navigate to the Web application URL

Scenario: verify header of the homepage	
When the page loading is complete
Then the main header of the page is "COMPARE GAS & ELECTRICITY"

Scenario: verify empty postcode error message
When the Postcode and Email text entry fields are not populated
And I Click on FIND A BETTER DEAL button
Then a validation error message: "Please provide your pstcode, as different regions have different fuel prices" is displayed

Scenario: verify invalid postcode error message
When the Postcode text entry field is populated with the text "W30PN#" 
And I Click on FIND A BETTER DEAL button
Then a validation error message: "Please provide a valid UK postcode" is displayed

Scenario: verify valid postcode journey
When the Postcode text entry field is populated with the text "W30PN" 
And I Click on FIND A BETTER DEAL button
Then the user is taken to a new search page with the following URL
And the Heading text "START YOUR SEARCH" is present


Scenario: Quit WebDriver
Then Quit the webdriver