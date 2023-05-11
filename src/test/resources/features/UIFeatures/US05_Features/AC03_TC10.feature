@US05_AC03_TC10 @team11 @team11Regression
Feature:Dean ekleyebilme

  Scenario Outline:AC03_TC10_Birth_Place_Guncelle

    Given Ali "http://139.59.159.36:3000/" sayfasina gider
    And Ali bır sanıye bekler
    And Ali Login butonuna tiklar
    And Ali bır sanıye bekler
    And Ali Admin olarak Username "<Username>" girer
    And Ali bır sanıye bekler
    And Ali Admin olarak Password "<Password>" girer
    And Ali bır sanıye bekler
    And Ali Login sayfasinda Login butona tiklar.
    And Ali bır sanıye bekler
    And Ali Menu butonuna tiklar
    And Ali bır sanıye bekler
    And Ali Main Menu listinin acildigini gorur
    And Ali bır sanıye bekler
    And Ali Main Menu Listinden Dean Management text`ine tiklar
    And Ali bır sanıye bekler
    And Ali Dean List alanindaki Edit butonuna tiklar
    And Ali Edit Dean bolumunun acildigini gorur
    And Ali bır sanıye bekler
    And Ali Birth Place textboxinin icine sembol girer
    And Ali bır sanıye bekler
    And Ali Gender alaninda checkbox`a tiklar
    And Ali bır sanıye bekler
    And Ali password "<password>" alanina gecerli sifre girer.
    And Ali bır sanıye bekler
    And Ali Edit Dean alanindaki Submit butonuna tiklar
    And Ali bır sanıye bekler
    Then Ali Edit Dean alaninda Surname textboxinin altinda Required uyari mesajini gorur.
    Then close the application
#
    Examples: dean_bilgileri
      | Username   | Password   | Name  | Surname  | Birth Place | Date Of Birth | Phone         | Ssn          | User Name | password |
      | Admin      | 485424698  | hasan | tarik    | " "         | 29-03-2001    | 090-505-8196  | 505-41-6328  |Team11     | 57916929 |