Feature: training scenarios 11

  Background:
    And I load my google page
    And I accept cookies if they are present on the page


  Scenario Outline: Google and random people test
    Given request <amount> random people from API
    And I store those people in database
    And I pick a single random person from DB


    When I set search to random persons name
    Then Search field contains random persons name
    Examples:
      |amount  |
      |3       |
      |2       |









