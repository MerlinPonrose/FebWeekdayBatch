Feature: Registration Page





@Alert @smoke
Scenario: validation of register page
Given  User launches chrome browser and open alert page URL "http://demo.automationtesting.in/Register.html"
When user clicks on the firstname and enter the value "Vcentry"
And user clicks on the lastname and enters the value "test"
And user click on the address field and enters the value "Guindy"