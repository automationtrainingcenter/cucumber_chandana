Feature: login functionality

Scenario: Verify login functionality using valid credentials
		Given user is in bank home page
		When user enters valid username
		And user enters valid password
		And click on login button
		Then user can see admin home page with logout link
Scenario:Verify login functionality using invalid password
         Given user is in bank home page
         When user enters valid username
         But user enters invalid password
         And click on login button
         Then user can see error message saying invalid username or password
Scenario:Verify login functionality using invalid username
         Given user is in bank home page
         When user enters invalid username
         And user enters valid password
         And click on login button
         Then user can see error message saying invalid username or password
Scenario:Verify login functionality using blank data
         Given user is in bank home page
         When click on login button
         Then user can see error message saying please fill username and password                    