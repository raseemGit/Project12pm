@login @e2e
Feature: Facebook Login Funtion Test

  @sanity
  Scenario: User Test Valid Login credintial scenario one
    Given user launch chrome browser
    And user enter url
    When user enter userName and password
      | name  | id     | emailid         |
      | vel   | kj87   | Vel@gmail.com   |
      | Raj   | 987yh  | Raj@gmail.com   |
      | Saran | kjh987 | saran@gmail.com |
    Then user click login button
    And user validate test
