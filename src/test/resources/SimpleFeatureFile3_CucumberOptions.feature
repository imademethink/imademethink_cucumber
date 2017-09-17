Feature: Cucumber options learning 

#Scenario: Cucumber option dry run 
#	Given Step without step definition 
	
@tag1
Scenario: Cucumber option tags 
	Given Step with tag1 
	
@tag2
Scenario: Cucumber option tags 
	Given Step with tag2
	
@tag3
Scenario: Cucumber  option tags 
	Given Step with tag3

@tag4
Scenario: Cucumber  option tags 
	Given Step with tag4
	
@tag11 @tag22
Scenario: Cucumber  option tags 
	Given Step with tag11 tag22
	
Scenario: Cucumber option without tags 
	Given Step without tag

#Scenario: Cucumber option failed test for reporting
#	Given Step which failed 
		