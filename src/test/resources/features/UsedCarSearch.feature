@Used-Search-Cars
Feature: Acceptance Testing to validate used search cars page is working fine.
  In order to validate that the used search car page is working fine we will do the acceptance testing

  @Used-Search-Cars-Positive
  Scenario: Validate used search cars page
    Given I am on the Home Page "https://www.carsguide.com.au/" of Cars Guide website
    When I move to the menu
      |Menu         |
      |buy + sell   |
      |reviews      |
    And click on "Used" link on Used Sarch Car page
    And select carbrand as "Audi" from AnyMake dropdown Used Sarch Car page
    And select carmodel on Used Sarch Car page
      | carModel |
      | A4       |
      | A3       |
    And select location as "NSW - All" from AnyLocation dropdown Used Sarch Car page
    And select price as "$2,000" from Price dropdown Used Sarch Car page
    And click on Find_My_Next_Car button Used Sarch Car page
    Then I should see list of used searched cars
    And the page title of used car search page should be "Audi A4 Under 2000 for Sale NSW | carsguide"