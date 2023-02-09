Feature: EriBank
  As a user of WordPress,
  I want to login into my account,
  So I can check my settings

  Scenario Outline: Login and check
    Given Juan access to the app
    When He completes the forms with his credentials
      | email   | password   |
      | <email> | <password> |
    Then He is able to check his acc
      | message   |
      | <message> |
    Examples:
      | email                | password                | message  |
      | Your email goes here | Your Password Goes Here | jdsa1822 |