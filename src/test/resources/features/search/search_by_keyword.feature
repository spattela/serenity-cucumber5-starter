Feature: Search by keyword

  Scenario: Searching for a term
    Given Sergey is on the DuckDuckGo home page
    When he searches for "Cucumber"
    Then all the result titles should contain the word "Cucumber"

  Scenario: Refining a search using two terms
    Given Sergey is on the DuckDuckGo home page
    And he has searched for "Cucumber"
    When he searches again for "zucchini"
    Then all the result titles should contain the word "zucchini"


  Scenario: Request a demo on Lifeview
    Given A user is on the mlc insurance page
    And He clicks on lifeview link

#    Then user should be navigated to lifeview landing page
#    When the user clicks on "Request a demo" button
#    Then a form is displayed and data is entered in the form