Feature: Sauce lab regression scenario

  Scenario Outline: User performs complete happy flow from login to checkout
    Given User is on Login page
    When user give valid "<username>" and valid "<password>"
    And user clicks on login button
    Then user should be able to see the "Products" page
    Then user selects two products
    And user clicks on the cart icon
    And user performs checkout
    Then user enter it's "<firstName>" "<lastName>" "<postalCode>"
    And user clicks on continue
    Then user can see the "Checkout: Overview" information
    Then user can see finish it's order by clicking on finish button

    Examples:
      | username      | password     | firstName | lastName | postalCode |
      | standard_user | secret_sauce | MUSTAFA   | RASHEED  | 01234      |
