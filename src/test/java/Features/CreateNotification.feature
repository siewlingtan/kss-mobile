Feature: Create Notification

  Scenario: Create notification
    Given I am logged in to KSS with correct "<string>" and "<string>"
    When I click on Self-Services link
    And I click on Create Notification link
    And I input title and content
    And I click Next
    And I input MID
    And I click Next
    And I check on Email option
    And I click on Send Now
    Then I should see notification created successfully

  Scenario: Create scheduled notification
    Given I am logged in to KSS with correct "<string>" and "<string>"
    When I click on Self-Services link
    And I click on Create Notification link
    And I input title and content for scheduled notification
    And I click Next
    And I input MID
    And I click Next
    And I check on Email option
    And I check on Send Later option
    And I click on Submit
    Then I should see notification created successfully
