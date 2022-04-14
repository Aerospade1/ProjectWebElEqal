Feature: DelUser
	
	Scenario Outline: Delete User
	  Given User is at login page
	  When User fills details with <Username> and <Password>
	  And User uses Login Button
	  When User is sent flying to home page
	  Then User is sent flying to Users page
	  Then User Ticks Checkboxes
  
	  Examples:
		| Username | Password |
		| Admin    | admin123 |