@feature-4
Feature: Hotdog-2

  Scenario: a few hotdogs
    Given I have 10 hotdogs in my belly
    When I wait 1 hour
    Then my belly should growl
