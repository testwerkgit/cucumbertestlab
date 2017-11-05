Feature: Make a new user account for website phptravels

  Scenario: Make a new login for John Doe
    Given I open the register page at 'http://www.phptravels.net/register'
    When I make a new account for user 'johndoe@whoami.com'
    Then the welcome message 'Hi, John Doe' is displayed

  Scenario Outline: Make several new logins by use of abstract scenario
    Given I open the register page at 'http://www.phptravels.net/register'
    When I make the following account for <firstname>, <lastname>, <phone>, <email>, <password>, <passwordrepeat>
    Then the account page is displayed

    Examples:
      |firstname|lastname|phone|email|password|passwordrepeat|
      |Peter    |Parker  |0698765432|peter.parker@marvel.com|spider123|spider123|
      |Guybrush |Threepwood|08006547|wannabepirate@lucasarts.com|monkey|monkey  |

   Scenario: Create an existing account
     Given I open the register page at 'http://www.phptravels.net/register'
     When I make a new account for user 'mail@whoami.com'
     And I logout
     And I open the register page at 'http://www.phptravels.net/register'
     And I make a new account for user 'mail@whoami.com'
     Then the error message 'Email Already Exists.' is displayed
