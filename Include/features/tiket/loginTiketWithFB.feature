Feature: bookHotel

  Scenario: bookHotel
    Given go to url login tiket 
    When user klik login with facebook
    Then user input email
    And user input password
    And user klik login
    And verify landing page login
    
 
          