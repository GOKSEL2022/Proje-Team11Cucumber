@Nilufer

Feature: US06

  Scenario Outline : US06

    Given Nilufer "https://www.managementonschools.com/" url'ine gider
    When Nilufer Home sayfasindaki Login buttonuna tiklar
    And Nilufer Dean olarak User Name'i girer
    And Nilufer Dean olarak Password'u girer
    And Nilufer Login buttonuna tiklar
    And Nilufer Vice Dean Management sayfasinda oldugunu dogrular
    And Nilufer Ssn alanina "<Ssn>" girmeyerek bos birakir
    And Nilufer User Name alanina tiklar
    And Nilufer Ssn alani altinda Required mesajini gorur
    And Nilufer Ssn alanina valid bir "<Ssn>" girer
    And Nilufer Ssn alani altinda hata mesaji goruntulenmemelidir
    Then close the application

    Examples: Dean_Vice_Dean_Bilgileri
      | Ssn         |
      |             |
      | 103-13-1031 |