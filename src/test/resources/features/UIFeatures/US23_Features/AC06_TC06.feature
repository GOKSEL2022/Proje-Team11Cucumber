@US23_TC06 @team11 @smoke

Feature: US23

  Scenario Outline : US23

    Given Nilufer "https://www.managementonschools.com/" url'ine git
    When Nilufer Home sayfasindaki Login buttonuna tikla
    And Nilufer Admin olarak User Name'i gir
    And Nilufer Admin olarak Password'u gir
    And Nilufer Login buttonuna tikla
    And Nilufer Vice Dean Management sayfasinda oldugunu dogrula
    And Nilufer Date Of Birth alanina "<Date Of Birth>" girmeyerek bos birak
    And Nilufer Phone alanina tikla
    And Nilufer Date Of Birth alani altinda Required mesajini gor
    And Nilufer Date Of Birth alanina valid bir "<Date Of Birth>" gir
    And Nilufer Date Of Birth alani altinda hata mesaji goruntulenmemeli
    Then close the application

    Examples: Admin_Vice_Dean_Bilgileri
      | Date Of Birth |
      |               |
      | 06.08.1965    |