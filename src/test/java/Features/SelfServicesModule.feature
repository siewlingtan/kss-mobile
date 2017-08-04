Feature: Self Services Module

  Scenario: Access Self Services Module
    Given I am logged in to KSS with correct "username" and "password"
    When I click on Self-Services link
    Then I should be directed to Self-Services module

  Scenario: View Notifications Link
    Given I am logged in to KSS with correct "username" and "password"
    When I click on Self-Services link
    And I click on View Notifications link
    Then I should be directed to Notifications Listing Page

  Scenario: Create Notification Link
    Given I am logged in to KSS with correct "username" and "password"
    When I click on Self-Services link
    And I click on Create Notification link
    Then I should be directed to Create Notification Page

  Scenario: Academic Checklists Link
    Given I am logged in to KSS with correct "username" and "password"
    When I click on Self-Services link
    And I click on Academic Checklists link
    Then I should be directed to Academic Checklists Listing Page

  Scenario: Create Checklist Group Link
    Given I am logged in to KSS with correct "username" and "password"
    When I click on Self-Services link
    And I click on Create Checklist Group link
    Then I should be directed to Create Checklist Group Page

  Scenario: View Requests Link
    Given I am logged in to KSS with correct "username" and "password"
    When I click on Self-Services link
    And I click on View Requests link
    Then I should be directed to View Requests Page

  Scenario: View Leaves Link
    Given I am logged in to KSS with correct "username" and "password"
    When I click on Self-Services link
    And I click on View Leaves link
    Then I should be directed to View Leaves Page

  Scenario: View Reports Link
    Given I am logged in to KSS with correct "username" and "password"
    When I click on Self-Services link
    And I click on View Reports link
    Then I should be directed to View Reports Page