Feature: Validate wix homepage
In order to provide some business value
As a user
I want to perform some simple action

@Chrome
Scenario: Validate the title of wix website
Given the application is successfully launched
When the user lands on the homepage
Then the user should validate the current page title 'Free Website Builder | Create a Free Website | Wix.com'
