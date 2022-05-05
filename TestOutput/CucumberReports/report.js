$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Reg.feature");
formatter.feature({
  "name": "Registration Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validation of register page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Alert"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.before({
  "status": "skipped"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User launches chrome browser and open alert page URL \"http://demo.automationtesting.in/Register.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Alert.launchBrowser(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on the firstname and enter the value \"Vcentry\"",
  "keyword": "When "
});
formatter.match({
  "location": "Registrationnnn_Test.user_clicks_on_the_firstname_and_enter_the_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on the lastname and enters the value \"test\"",
  "keyword": "And "
});
formatter.match({
  "location": "Registrationnnn_Test.user_clicks_on_the_lastname_and_enters_the_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on the address field and enters the value \"Guindy\"",
  "keyword": "And "
});
formatter.match({
  "location": "Registrationnnn_Test.user_click_on_the_address_field_and_enters_the_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.uri("file:alert.feature");
formatter.feature({
  "name": "Validation of alert in demo page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Alert"
    }
  ]
});
formatter.scenario({
  "name": "Validation of ok button in alert",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Alert"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User launches chrome browser and open alert page URL \"http://demo.automationtesting.in/Alerts.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Alert.launchBrowser(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on the button to open alert",
  "keyword": "When "
});
formatter.match({
  "location": "Alert.user_clicks_on_the_button_to_open_alert()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks dummy field for testing",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});