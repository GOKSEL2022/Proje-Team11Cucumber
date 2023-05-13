@Nilufer @team11Regression @sunum

Feature: US06

  Scenario Outline: US06

    Given Nilufer "http://139.59.159.36:3000/" url'ine gider
    When Nilufer Home sayfasindaki Login buttonuna tiklar
    And Nilufer Dean olarak User Name'i girer
    And Nilufer Dean olarak Password'u girer
    And Nilufer Login buttonuna tiklar
    And Nilufer Vice Dean Management sayfasinda oldugunu dogrular
    And Nilufer User Name alanina User Name girmeyerek bos birakir
    And Nilufer Password alanina tiklar
    And Nilufer User Name alani altinda Required mesajini gorur
    And Nilufer User Name alanina valid bir "<User Name>" girer
    And Nilufer User Name alani altinda hata mesaji goruntulenmemelidir
    Then close the application

    Examples: Dean_Vice_Dean_Bilgileri
      | User Name |
      | niloz     |