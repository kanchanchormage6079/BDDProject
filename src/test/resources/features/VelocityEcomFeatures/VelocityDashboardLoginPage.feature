Feature: Validate Velocity Ecom Dashboard page
  Background:
    Given user is on Ecom login page
  Scenario: Validate Dashboard as a Admin
    And user click on Admin Button
    When user enters username "9923478751"
    And user enters password "Velocity@123"
    And user click on Access Dashboard Button
    Then user should be on Dashboard page

#  Scenario Outline: Validate Dashboard as a Admin with invalid credentials
#    And user click on Admin Button
#    When user enter username "<username>"
#    And user enter password "<password>"
#    And user click on Access Dashboard Button
#    Then user should be on Dashboard page
#    Examples:
#      | username | password |
#      | 5555555555 | Test@5 |




