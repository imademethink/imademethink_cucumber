Feature:  Secure login with captcha
	Secure login with captcha
# Brief summary about feature
# Short description of particular feature

# Pre condition for every test scenario
Background: 
	Given Web application is running 
# More pre condition for each test scenario
	And Secure login with captcha functionality is implemented 

# Briefy summary about this test scenario
Scenario: Secure login using desktop website 
# Pre condition for this scenario
	Given On desktop browser on home page login button with captcha is available 
# Additional pre condition
	And After clicking on login button username password text box and captcha should be shown 
# Individual step performed by user
	When User enters valid username password captcha 
# Additional individual step performed by user
	And User clicks on login button 
# Expected scenario behaviour
	Then User login should be successful 
# Additional expected test scenario behaviour
	And User name should be shown on top right side 
# Following behaviour is not expected 
	But Register option should not be shown
	