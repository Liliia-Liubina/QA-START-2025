Feature: training scenarios 11

#  Background:
#    And I load my google page
#    And I accept cookies if they are present on the page
#
#
#  Scenario Outline: Google and random people test
#    Given request <amount> random people from API
#    And I store those people in database
#    And I pick a single random person from DB
#
#
#    When I set search to random persons name
#    Then Search field contains random persons name
#    Examples:
#      |amount  |
#      |3       |
#      |2       |


  Scenario: Google and random people test
    Given request some 3 random people from API as "friends"
    And I store my "friends" in database
    And I pick a some random person from DB as "random_guy"
    Given I load my google page
    Given I accept cookies if they are present
    When I am setting search to "random_guy"
    Then My search field contains "random_guy"





