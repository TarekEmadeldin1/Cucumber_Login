Feature: Login Functionality
  Test Valid and Invalid login

  Scenario Outline: InValid Login With InValid UserName and Valid Password
    Given user on login page
    When user enter <User> and <Password>
    Then Logged in inSuccessfully
    Examples:
      | User            | Password     |
      | locked_out_user | secret_sauce |


  Scenario Outline: Valid Login
    Given user on login page
    When user enter <User> and <Password>
    Then Logged in Successfully
    Examples:
      | User                    | Password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |
      | performance_glitch_user | secret_sauce |
