@Alert
Feature: Validation of alert in demo page

Background:
Given  User launches chrome browser and open alert page URL "http://demo.automationtesting.in/Alerts.html"
When User clicks on the button to open alert
And User switches to alert


Scenario: Validation of ok button in alert
And User click ok button in alert
Then User verifies the title of alert page is "Alerts"
And validate last step "xxx"


Scenario: Validation of ok button in alert
And User click ok button in alert
Then User verifies the title of alert page is "Alerts"
And validate last step "xxx"







