Feature: Contacts Page Functionality 
	Validate functionalities in Contacts Page
	
Scenario: Create new contact 
	Given user navigates to New Contacts page by hovering over Contacts tab 
	When user enters the below details 
		|firstname 	| lastname 	| mobile 		| email 			|
		| Henry		| Gary 		| 9878734343 	| henry@gary.com 	|
	Then a new contact with the entered details should be created