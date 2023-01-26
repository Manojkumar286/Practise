
Feature: Instagram Login Automation Test-Case

  @Instagram
  Scenario: Instagram Login With Valid Details
  Given User enter browser launch
  And User get url
  And User verify land on loginpage
  And User enter valid username
  And User enter valid password
  Then User click login button
   