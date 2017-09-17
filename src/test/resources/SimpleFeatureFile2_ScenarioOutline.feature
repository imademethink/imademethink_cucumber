Feature: Secure login with captcha on mobile devices 

Background: 
	Given Web application is running 
	And Secure login with captcha functionality is implemented 
	
Scenario Outline: Secure login using mobile devices 
	Given On following devices "<device_type>" required app version "<app_version>" is installed 
	And On home screen of app login button with captcha is available 
	When User clicks on login button 
	Then Following items should be available username password text box and captcha 
	When User enters valid username password captcha 
	And User clicks on login button 
	Then User login task should be successful 
	
	Examples: 
		| device_type | app_version |
		| Android     | 5.5         |
		| Apple       | 5.2         |
		| Blackberry  | 4.8         |
		
Scenario: Parameter passing example 
	Given Passing integer with value 100 to check 
	And Passing string with value "Terminator" to test 
	And Passing boolean with value true to test 
	And Passing float with value 2.5 to check
	And Passing multiple parameter in single step as data table 
		| parameter name   | parameter value|
		| student_address1 | 520 JK Road    |
		| student_address2 | Long island    |
		| student_address3 |                |
		| city             | Berlin         |
		| postcode         | 225599         |
