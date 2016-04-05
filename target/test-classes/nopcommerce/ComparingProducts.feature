
Feature: Comparing Products

  Scenario: Customer should be able to see Products for Comparison

    Given Customer on a required Product page
    When  Customer select a product and press on Add to compare list
    And   Again on required Product Page
    And   Customer select another product
    And   press on Add to compare list
    And   press on Compare Product list
    Then  Customer should be able to see selected Products on Compare Products page
