Feature: bookHotel

  Scenario: bookHotel
    Given user klik hotel menu
    When user klik destination
    Then user select Jakarta
    And user klik check in date
    And user select check in date
    And user klik check out date
    And user select check out date
    And user klik guest and room
    And user klik selesai
    And user klik search hotel
    And verify landing page search hotel
    
 
          