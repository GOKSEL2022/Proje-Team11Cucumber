@Nilufer @team11

Feature: US06

  Scenario Outline:US06

    Given Nilufer "http://139.59.159.36:3000/" url'ine gider
    When Nilufer Home sayfasindaki Login buttonuna tiklar
    And Nilufer Dean olarak User Name'i girer
    And Nilufer Dean olarak Password'u girer
    And Nilufer Login buttonuna tiklar
    And Nilufer Vice Dean Management sayfasinda oldugunu dogrular
    And Nilufer Name alanina valid bir "<Name>" girer
    And Nilufer Surname alanina valid bir "<Surname>" girer
    And Nilufer Birth Place alanina valid bir "<Birth Place>" girer
    And Nilufer Gender alanini bos birakir
    And Nilufer Date Of Birth alanina valid bir "<Date Of Birth>" girer
    And Nilufer Phone alanina valid bir "<Phone>" girer
    And Nilufer Ssn alanina valid bir "<Ssn>" girer
    And Nilufer User Name alanina valid bir "<User Name>" girer
    And Nilufer Password alanina valid bir "<Password>" girer
    And Nilufer Submit butonuna tiklayamaz
    Then close the application



    Examples: Dean_Vice_Dean_Bilgileri
      | Name    | Surname | Birth Place | Date Of Birth | Phone        | Ssn         | User Name | Password |
      | Nilufer | Ozkul   | Izmir       | 06.08.1965    | 552-919-2222 | 103-13-1031 | niloz     | 12345678 |
