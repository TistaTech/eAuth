@Login
Feature: Login into Microsoft Mail
  As a Valid user
  I want to login to the mail
  So that I can check my mails.

  Scenario Outline: Success Login
    Given I use Valid "<userName>" and Valid "<password>"
    When I perform Login Action
    Then I should see my Account Mails

    @prod
    Examples: Valid Data
      | userName              | password    |
      | mmetoff@tistatech.com | 95088114Mm! |
