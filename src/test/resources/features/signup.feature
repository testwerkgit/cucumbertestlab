Feature: Make a new user account for website phptravels

  Scenario: Make a new login for John Doe
    Given I open the register page at 'http://www.phptravels.net/register'
    When I make a new account for user 'johndoe242@whoami.com'
    Then the welcome message 'Hi, John Doe' is displayed

#  Scenario: Make a new login for John Doe with wrong assertion
#    Given I open the register page at 'http://www.phptravels.net/register'
#    When I make a new account for user 'johndoe900@whoami.com'
#    Then the welcome message 'Hi, Donald Duck' is displayed