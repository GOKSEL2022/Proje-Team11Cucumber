@Nilufer @team11Regression @sunum

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
    And Nilufer Surname alanina Surname girmeyerek bos birak
    And Nilufer Birth Place alanina tikla
    And Nilufer Surname alani altinda Required mesajini gor
    And Nilufer Surname alanina valid bir "<Surname>" gir
    And Nilufer Surname alani altinda hata mesaji goruntulenmemeli
    Then close the applications

    Examples: Admin_Vice_Dean_Bilgileri
      | Surname |
      | Ozkul   |