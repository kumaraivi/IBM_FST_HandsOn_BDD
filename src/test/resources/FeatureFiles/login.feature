@demo
Feature: retail add task validation

  @test
  Scenario: Verify user is able to add task and update in retail site
    Given I am on retail login page
    When I enter username and password
    And I click on submit
    Then I should see retail home page
    When I click on Coupon link
    Then I should see Coupon page
    When I click on Add Coupon button
    Then I should be able to add coupon
    When I click edit coupon
    Then I should be able to edit coupon
    When I select a coupon and click delete coupon
    Then I should see coupon got deleted