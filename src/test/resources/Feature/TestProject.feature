Feature: TestProject

  @SmokeTest
  Scenario: Account Craete on TestPorject page
    Given User is on main page
    When User is enter email
    And User is click AccountCreate button
    Then User is on next step
    And User enter firstname
    And User enter lastName
    And User enter password
    Then User click on checkbox
    Then User clic sighUp button
