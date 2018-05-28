Feature: Automate Wix Application
In order to provide some business value
As a user
I want to perform some simple action, but I commented then condition

Scenario: Validate user experience in home page of wix website
Given the browser is successfully launched
When the user lands on the homepage
Then the user should validate the current page title 'Free Website Builder | Create a Free Website | Wix.com'