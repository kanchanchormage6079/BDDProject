Feature: Validate Inventory update page
  Scenario: validate velocity Ecom Inventory update page
    Given user click on Admin Button
    When user enters username "9923478751"
    And user enters password "Velocity@123"
    And user click on Access Dashboard Button
    And user click on inventory update button
    Then user validates all KPI cards details present on inventory update page