@Nilufer @team11Regression @team11Smoke @sunum

Feature: US23
   Scenario: US23

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
    And Nilufer Name alanina valid bir deger gir
    And Nilufer Surname alanina valid bir deger gir
    And Nilufer Birth Place alanina valid bir deger gir
    And Nilufer Gender alanina valid bir Gender sec
    And Nilufer Date Of Birth alanina valid bir deger gir
    And Nilufer Phone alanina valid bir deger gir
    And Nilufer Ssn alanina valid bir deger gir
    And Nilufer User Name alanina valid bir deger gir
    And Nilufer Password alanina valid bir deger gir
    And Nilufer Submit butonuna tikla
    And Nilufer Admin olarak Vice Dean olusturdugunu dogrula
    Then close the applications

