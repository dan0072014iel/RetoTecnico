Feature: Add products
  Scenario: Add products in the cart successfully
    Given user open the page in the browser
    When add the first product with two quantities
    And add second product with five quantities to the cart respectively
    Then user can see the two products in the cart