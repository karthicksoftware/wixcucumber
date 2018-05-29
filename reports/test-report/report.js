$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Validate wix homepage",
  "description": "In order to provide some business value\r\nAs a user\r\nI want to perform some simple action",
  "id": "validate-wix-homepage",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6216549541,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Validate the title of wix website",
  "description": "",
  "id": "validate-wix-homepage;validate-the-title-of-wix-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "the application is successfully launched",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the user lands on the homepage",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the user should validate the current page title \u0027Free Website Builder | Create a Free Website | Wix.com\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "Define_HomePage.the_application_is_successfully_launched()"
});
formatter.result({
  "duration": 8730056220,
  "status": "passed"
});
formatter.match({
  "location": "Define_HomePage.the_user_lands_on_the_homepage()"
});
formatter.result({
  "duration": 261755956,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Free Website Builder | Create a Free Website | Wix.com",
      "offset": 49
    }
  ],
  "location": "Define_HomePage.the_user_should_validate_the_current_page_title_It_All_Starts_with_Your_Stunning_Website(String)"
});
formatter.result({
  "duration": 87519236,
  "status": "passed"
});
formatter.after({
  "duration": 2130665614,
  "status": "passed"
});
});