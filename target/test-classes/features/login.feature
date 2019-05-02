Feature: login functionality

Scenario: Verify login functionality using valid credentials
		Given user is in bank home page
		When user enters valid username
		And user enters valid password
		And click on login button
		Then user can see admin home page with logout link
