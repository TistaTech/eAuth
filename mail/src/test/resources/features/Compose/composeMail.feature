@ComposeMail
Feature: Compose an email via Microsoft email
  As a Valid user
  I want to compose a mail
  So that I can communicate with my friends.

  Scenario Outline: Success Compose
    Given I use Valid "<userName>" and Valid "<password>"
    Given I have all Test Data "<userName>" "<password>" "<toAddress>" "<subject>" "<body>" for Compose Scenario
    When I perform Login Action
    Then I should see my Account Mails
    And I compose an email to "<toAddress>"
    Then I should see a successful mail sent

    Examples: Valid Data
      | userName              | password    | toAddress              | subject   | body         |
      | mmetoff@tistatech.com | 95088114Mm! | marat.metoff@gmail.com | Test Mail | Hi, Marat!   |
      | mmetoff@tistatech.com | 95088114Mm! | mushtaq.a.khan@irs.gov | Test Mail | Hi, Mushtaq! |
      | mmetoff@tistatech.com | 95088114Mm! | syamini@tistatech.com  | Test Mail | Hi, Sahar!   |
