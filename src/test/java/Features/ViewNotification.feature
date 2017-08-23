Feature: View Notification

  Scenario: View a scheduled notification
    Given I am logged in to KSS with correct "<string>" and "<string>"
    When I click on Self-Services link
    And I click on View Notifications link
    And I click on View button
    Then I should be directed to View

#  Scenario: View a delivered notification
#    Given I am logged in to KSS with correct "<string>" and "<string>"
#    When I click on Self-Services link
#    And I click on View Notifications link
#    And I click on Delivered tab
#    And I click on View button
#    Then I should be directed to View