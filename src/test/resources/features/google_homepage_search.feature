Feature: Google Homepage Search

  Scenario: User can search with “Google Search”
    Given I’m on the homepage
    When I type “The name of the wind” into the search field
    And I click the Google Search button
    Then I go to the search results page and the first result is “El nombre del viento - Wikipedia, la enciclopedia libre”
    When I click on the first result link
    Then I go to the “El nombre del viento” page

  Scenario: User can search by using the suggestions
    Given I’m on the homepage
    When I type “The name of the w” into the search field
    And the suggestions list is displayed and I click on the first suggestion in the list
    Then I go to the search results page and the first result is “El nombre del viento - Wikipedia, la enciclopedia libre”
    When I click on the first result link
    Then I go to the “El nombre del viento” page