Feature: feature to test product
Scenario: Check login  is sugcessful with valid credntials
Given user is on login page
When user enter username and password
And clicks on login button
Then user is navigated to home page

Scenario: check product is created or not
Given user is on home page
When click on product module product page should display
And click on new product add all the details
Then validate product is created or not