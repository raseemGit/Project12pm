@logout @e2e
Feature: Facebook Logout Funtion Test

  Background: 
    Given user launch chrome browser
    And user enter url

  @smoke
  Scenario: User Test Valid Logout Credintial scenario one
    When user enter userName and password
      | name  | id     | emailid         |
      | vel   | kj87   | Vel@gmail.com   |
      | Raj   | 987yh  | Raj@gmail.com   |
      | Saran | kjh987 | saran@gmail.com |
    Then user click login button
    And user validate test

  @reg @sanity
  Scenario: User Test Valid Logout Credintial scenario two
    When user enter userName and password
      | name  | id     | emailid         |
      | vel   | kj87   | Vel@gmail.com   |
      | Raj   | 987yh  | Raj@gmail.com   |
      | Saran | kjh987 | saran@gmail.com |
    Then user click login button
    And user validate test
    
    
