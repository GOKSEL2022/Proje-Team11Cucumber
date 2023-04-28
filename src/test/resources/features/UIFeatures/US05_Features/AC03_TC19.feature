@US05_AC03_TC19 @team11
Feature:Dean ekleyebilme

  Scenario Outline:AC03_TC10_Phone_Alani_Guncelle
    Given Ali "https://www.managementonschools.com" sayfasina gider
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
    And Ali Gender alaninda female checkboxini tiklar
    And Ali bır sanıye bekler
    And Ali Phone alanini space girer.
    Then Ali Required mesajini gorur.
    And Ali password "<password>" alanina gecerli sifre girer.
    And Ali bır sanıye bekler
    And Ali Edit Dean alanindaki Submit butonuna tiklar
    And Ali bır sanıye bekler
    Then Ali hata mesajini gorur.

    Examples: dean_bilgileri
      | Username   | Password   | Name  | Surname  | Birth Place | Date Of Birth | Phone         | Ssn          | User Name | password |
      | karakartal | 987654321  | hasan | tarik    | " "         | 29-03-2001    | 090-505-8196  | 505-41-6328  |Team11     | 57916929 |