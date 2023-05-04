@ApiGuestUser @Api @End2End_GuestUser @admin
Feature: US01_Guest_User

  Scenario:US01_Get_GuestUserById

    Given Nilufer sends getAll request for room data
    Then Nilufer gets the room data and assert
