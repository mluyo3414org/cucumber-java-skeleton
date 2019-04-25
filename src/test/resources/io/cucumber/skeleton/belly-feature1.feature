@wip
@feature
Feature: Hotdog

  Scenario: a few hotdogs
    Given I have 24 hotdogs in my belly
    When I wait 1 hour
    Then my belly should growl
