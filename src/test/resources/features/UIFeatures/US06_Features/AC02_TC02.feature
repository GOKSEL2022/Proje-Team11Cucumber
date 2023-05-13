@Nilufer @team11Regression @sunum

Feature: US06

  Scenario Outline:US06

    Given Nilufer "http://139.59.159.36:3000/" url'ine gider
    When Nilufer Home sayfasindaki Login buttonuna tiklar
    And Nilufer Dean olarak User Name'i girer
    And Nilufer Dean olarak Password'u girer
    And Nilufer Login buttonuna tiklar
    And Nilufer Vice Dean Management sayfasinda oldugunu dogrular
    And Nilufer Name alanina Name girmeyerek bos birakir
    And Nilufer Surname alanina tiklar
    And Nilufer Name alani altinda Required mesajini gorur
    And Nilufer Name alanina valid bir "<Name>" girer
    And Nilufer Name alani altinda hata mesaji goruntulenmemelidir
    Then close the application

    Examples: Dean_Vice_Dean_Bilgileri
      | Name    |
      | Nilufer |


















