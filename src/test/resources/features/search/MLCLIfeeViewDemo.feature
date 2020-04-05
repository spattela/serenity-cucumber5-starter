Feature: MLC LifeView page actions

  Scenario: Request a demo on Lifeview
    Given a user is on the mlc insurance page
    When he searches for "lifeview"
    Then all the result titles should contain the word "lifeview"
    And user clicks on the lifeview link
    Then user should be navigated to lifeview landing page
    When the user clicks on Request a demo button
    Then a form is displayed to enter the following user details such as "test","Testcompany","fake@gmail.com","0400000000","blah blah"
