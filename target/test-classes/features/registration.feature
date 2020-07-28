
Feature: Registration feature
@test
  Scenario: User should able to register successfully.
  So that user can use all the user functionality on the website.
    Given User is already on home page
    When User click on register button
    And user enters all required registration details
    And User clicks on register-submit button
    Then user should be register successfully
