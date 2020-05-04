Feature: Search for Property for sale
  As a customer
  I want the ability to search a property
  So I can have more information about searched property

  Scenario Outline: User can successfully search for a property
    Given I navigate to Zoopla.co.uk
    And the To Buy tab is highlighted
    When I enter a "<UKLocation>" in the search bar
    And I select "<MinPrice>" from the Min dropdown
    And I select "<MaxPrice>" from the Max dropdown
    And I select "<PropertyType>" from the Property dropdown
    And I select "<Bedrooms>" from the rooms dropdown
    And I click on the Search button
    Then all the "<Property>" within the selected "<Location>" are displayed
    And I click on any


    Examples:
      |UKLocation|MinPrice|MaxPrice|PropertyType|Bedrooms|
      |ST4 7DW|50000	|400000	|Flat	|	3|
#      |Liverpool|600000|1000000|House|7|
#      |M40|200000|800000|Farms|3|