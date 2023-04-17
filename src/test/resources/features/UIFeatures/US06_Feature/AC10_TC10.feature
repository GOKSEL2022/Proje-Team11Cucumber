@US06_TC10 @team11
Feature: Dean Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Kullanici "https://www.managementonschools.com/" url'ine gider
    Given Kullanici Home sayfasindaki Login buttonuna tiklar
    Given Kullanici Dean olarak User Name'i girer
    Given Kullanici Dean olarak Password'u girer
    Given Kullanici Login buttonuna tiklar
    Given Kullanici "Vice Dean Management" sayfasinda oldugunu dogrular

  Scenario Outline:US06_TC10_Password_alaninin_testi
    When Kullanici Name alanina valid bir "<Name>" girer
    And Kullanici Surname alanina valid bir "<Surname>" girer
    And Kullanici Birth Place alanina valid bir "<Birth Place>" girer
    And Kullanici Gender alanina valid bir Gender secer
    And Kullanici Date Of Birth alanina valid bir "<Date Of Birth>" girer
    And Kullanici Phone alanina valid bir "<Phone>" girer
    And Kullanici Ssn alanina valid bir "<Ssn>" girer
    And Kullanici User Name alanina valid bir "<User Name>" girer
    And Kullanici Password alanini bos birakir
    And Kullanici Submit butonuna tiklayamaz
    And Kullanici Password alani altinda Required mesajini gorur
    And Kullanici Name alanina valid bir "<Name>" girer
    And Kullanici Surname alanina valid bir "<Surname>" girer
    And Kullanici Birth Place alanina valid bir "<Birth Place>" girer
    And Kullanici Gender alanina valid bir Gender secer
    And Kullanici Date Of Birth alanina valid bir "<Date Of Birth>" girer
    And Kullanici Phone alanina valid bir "<Phone>" girer
    And Kullanici Ssn alanina valid bir "<Ssn>" girer
    And Kullanici User Name alanina valid bir "<User Name>" girer
    And Kullanici Password alanina "<Password>" olarak yedi karakter veri girer
    And Kullanici Submit butonuna tiklayamaz
    And Kullanici Password alani altinda Minimum 8 character mesajini gorur

    Examples: Dean_Vice_Dean_Bilgileri
      | Name    | Surname | Birth Place | Date Of Birth | Phone        | Ssn         | User Name | Password |
      | Nilufer | Ozkul   | Izmir       | 06.08.1965    | 552-919-2222 | 103-13-1031 | niloz     |          |
      | Nilufer | Ozkul   | Izmir       | 06.08.1965    | 552-919-2222 | 103-13-1031 | niloz     | Nil.123  |