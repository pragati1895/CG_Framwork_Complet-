Feature: Login Feature
Scenario Outline: negative loginScenario
Given user is on login page
When user enters "<un>" & "<pw>"
And user clicks on submit
Then user is on same page
Examples:
|un|pw|
|admin|addmin@123|
|rincy|rincy@123|