Feature: selectRoom

  Scenario: selectRoom
    Given verify landing page select hotel
    When user klik lihat kamar
    Then user klik pilih kamar
    And user klik pesan kamar
    And user klik title detail pemesanan
    And user select title detail pemesanan
    And user klik title detail tamu
    And user select title detail tamu
    And user klik bebas asap rokok
    And user klik lanjut ke pembayaran
    And user verify landing page after pembayaran
    
 
          