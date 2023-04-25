@Nilufer @team11

Feature: US06

  Scenario Outline: US06

    Given Nilufer "https://www.managementonschools.com/" url'ine gider
    When Nilufer Home sayfasindaki Login buttonuna tiklar
    And Nilufer Dean olarak User Name'i girer
    And Nilufer Dean olarak Password'u girer
    And Nilufer Login buttonuna tiklar
    And Nilufer Vice Dean Management sayfasinda oldugunu dogrular
    And Nilufer Phone alanina "<Phone>" girmeyerek bos birakir
    And Nilufer Ssn alanina tiklar
    And Nilufer Phone alani altinda Required mesajini gorur
    And Nilufer Phone alanina valid bir "<Phone>" girer
    And Nilufer Phone alani altinda hata mesaji goruntulenmemelidir
    Then close the application

    Examples: Dean_Vice_Dean_Bilgileri
      | Phone        |
      |              |
      | 552-919-2222 |