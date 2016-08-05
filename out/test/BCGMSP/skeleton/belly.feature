Feature: sso login

  Scenario: Login to okta
    Given the OKTA url
    When I enter username
    And I enter Password
    When I click signin button
    Then I should be loggedin

