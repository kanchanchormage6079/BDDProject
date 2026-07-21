Feature: Velocity Ecom Login
  Background:
    Given user is on Ecom login page
    @Smoke @Functional
  Scenario: user login as a Admin
    When user click on admin button
    And user enters username as "9923478751"
    And user enters password as "Velocity@123"
    And user click on access dashboard button
    Then user navigate to dashboard page

      @Retesting
  Scenario Outline: user login as a multiple Admin users
    When user click on admin button
    And user enters username as a "<username>"
    And user enters password as a "<password>"
    And user click on access dashboard button
    Then user click on access dashboard button
    Examples:
      | username | password |
      | 1111111111 | Test@1 |
      | 2222222222 | Test@2 |
      | 3333333333 | Test@3 |
      | 4444444444 | Test@4 |

        @Regression
  Scenario: user login as a users
    When user enters registration details & click on admin button
    | Firstname | Lastname | EmailId |
    | kanchan   | chormage | kbc@123 |
    | rutuja    | shinde | rutuja@123 |
    | kiran     | khade | kb@123 |
    Then user click on access dashboard button

