@US05_AC03_TC08 @team11
Feature:Dean ekleyebilme

  Scenario Outline:AC03_TC05_Dean_Surname_Guncelle

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
    And Alı bır sanıye bekler
    And Alı Surname alanina space girer.
    And Alı bır sanıye bekler
    And Alı Gender alaninda checkbox`a tiklar
    And Alı bır sanıye bekler
    And Alı password "<password>" alanina gecerli sifre girer.
    And Alı bır sanıye bekler
    And Alı Edit Dean alanindaki Submit butonuna tiklar
    And Alı bır sanıye bekler
    Then Alı Edit Dean alaninda Surname textboxinin altinda Required uyari mesajini gorur.




#
    Examples: dean_bilgileri
      | Username   | Password   | Name  | Surname  | Birth Place | Date Of Birth | Phone         | Ssn          | User Name | password |
      | karakartal | 987654321  | hasan | tarik    | " "         | 29-03-2001    | 090-505-8196  | 505-41-6328  |Team11     | 57916929 |