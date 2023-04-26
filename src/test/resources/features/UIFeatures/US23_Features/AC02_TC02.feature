@US23_TC02 @team11 @smoke

Feature: US23

  Scenario Outline: US23

    Given Nilufer "https://www.managementonschools.com/" url'ine git
    When Nilufer Home sayfasindaki Login buttonuna tikla
    And Nilufer Admin olarak User Name'i gir
    And Nilufer Admin olarak Password'u gir
    And Nilufer Login buttonuna tikla
    And Nilufer Vice Dean Management sayfasinda oldugunu dogrula
    And Nilufer Name alanina "<Name>" girmeyerek bos birak
    And Nilufer Surname alanina tikla
    And Nilufer Name alani altinda Required mesajini gor
    And Nilufer Name alanina valid bir "<Name>" gir
    And Nilufer Name alani altinda hata mesaji goruntulenmemeli
    Then close the application

    Examples: Admin_Vice_Dean_Bilgileri
      | Name    |
      |         |
      | Nilufer |