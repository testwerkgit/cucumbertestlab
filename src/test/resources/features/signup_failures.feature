Feature: Failing scenarios for making a new user account for website phptravels

  Scenario: Make a new login for John Doe with wrong assertion
    Given I open the register page at 'http://www.phptravels.net/register'
    When I make a new account for user 'johndoe900@whoami.com'
    Then the welcome message 'Hi, Donald Duck' is displayed

