Feature: API Demos Test

  @Exam1
  Scenario: Find Element and Get Text
    Given Check that the application is opened.

  @Exam2
  Scenario: Get Text
    Given Check that the title of application is "API Demos"

  @Exam3
  Scenario: Click to Element
    Given Check that the title of application is "API Demos"
    When Check that the App tab is clicked

    @Exam4
    Scenario: Search the text
      Given Check that the title of application is "API Demos"
      When Click to App tab
      And Click to Action Bar
      And Click to Action Bar Usage
      And Click to Search icon
      And Send to "baran" and search
      Then Check to "baran" at result

