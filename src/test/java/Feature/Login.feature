Feature: Sauce lab login scenario

  Scenario Outline: User performs login
    Given User is on Login page
    When user give valid "<username>" and valid "<password>"
    And user clicks on login button
    Then user should be able to see the "Products" page


    Examples:
      | username      | password      |
      | standard_user | secret_sauce  |
      | problem_user  | secret_sauce  |

