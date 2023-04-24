@US23_TC09 @team11 @smoke

Feature: US23

  Scenario Outline : US23

    Given Nilufer "https://www.managementonschools.com/" url'ine git
    When Nilufer Home sayfasindaki Login buttonuna tikla
    And Nilufer Admin olarak User Name'i gir
    And Nilufer Admin olarak Password'u gir
    And Nilufer Login buttonuna tikla
    And Nilufer Vice Dean Management sayfasinda oldugunu dogrula
    And Nilufer User Name alanina "<User Name>" girmeyerek bos birak
    And Nilufer Password alanina tikla
    And Nilufer User Name alani altinda Required mesajini gor
    And Nilufer User Name alanina valid bir "<User Name>" gir
    And Nilufer User Name alani altinda hata mesaji goruntulenmemeli
    Then close the application

    Examples: Admin_Vice_Dean_Bilgileri
      | User Name |
      |           |
      | niloz     |