@US05_AC03_TC23 @team11
Feature:Dean ekleyebilme

  Scenario Outline:AC03_TC10_Ssn_Alani_Guncelle
    Given Alı "https://www.managementonschools.com" gider
    And Alı bır sanıye bekler
    And Alı Login butonuna tiklar
    And Alı bır sanıye bekler
    And Alı Admin olarak Username "<Username>" girer
    And Alı bır sanıye bekler
    And Alı Admin olarak Password "<Password>" girer
    And Alı bır sanıye bekler
    And Alı Login sayfasinda Login butona tiklar.
    And Alı bır sanıye bekler
    And Alı Menu butonuna tiklar
    And Alı bır sanıye bekler
    And Alı Main Menu listinin acildigini gorur
    And Alı bır sanıye bekler
    And Alı Main Menu Listinden Dean Management text`ine tiklar
    And Alı bır sanıye bekler
    And Alı Dean List alanindaki Edit butonuna tiklar
    And Alı Edit Dean bolumunun acildigini gorur
    And Alı Gender alaninda female checkboxini tiklar
    And Alı bır sanıye bekler
    And Alı Ssn alanina space girer.
    And Alı password "<password>" alanina gecerli sifre girer.
    And Alı bır sanıye bekler
    And Alı Edit Dean alanindaki Submit butonuna tiklar
    And Alı bır sanıye bekler
    Then Alı hata mesajini gorur.

    Examples: dean_bilgileri
      | Username   | Password   | Name  | Surname  | Birth Place | Date Of Birth | Phone         | Ssn          | User Name | password |
      | karakartal | 987654321  | hasan | tarik    | " "         | 29-03-2001    | 090-505-8196  | 505-41-6328  |Team11     | 57916929 |