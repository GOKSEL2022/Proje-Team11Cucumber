@Nilufer @team11Regression

Feature: US23

  Scenario Outline: US23

    Given Nilufer "http://139.59.159.36:3000/" url'ine git
    When Nilufer Home sayfasindaki Login buttonuna tikla
    And Nilufer Admin olarak User Name'i gir
    And Nilufer Admin olarak Password'u gir
    And Nilufer Login buttonuna tikla
    And Nilufer Admin Management sayfasinda oldugunu dogrular
    And Nilufer Menu buttonuna tikla
    And Nilufer Main Menu buttonunun acildigini dogrula
    And Nilufer Vice Dean Management buttonuna tikla
    And Nilufer Vice Dean Management sayfasinda oldugunu dogrula
    And Nilufer User Name alanina User Name girmeyerek bos birak
    And Nilufer Password alanina tikla
    And Nilufer User Name alani altinda Required mesajini gor
    And Nilufer User Name alanina valid bir "<User Name>" gir
    And Nilufer User Name alani altinda hata mesaji goruntulenmemeli
    Then close the applications

    Examples: Admin_Vice_Dean_Bilgileri
      | User Name |
      | niloz     |