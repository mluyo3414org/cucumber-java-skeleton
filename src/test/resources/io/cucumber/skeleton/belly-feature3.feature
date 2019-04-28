@feature-3
Feature: Sodas

  Scenario: a few sodas
    Given I have 2 sodas in my belly
    When I wait 1 hour
    Then my belly should growl
