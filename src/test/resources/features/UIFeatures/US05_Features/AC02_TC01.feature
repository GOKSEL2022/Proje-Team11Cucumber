@US05_AC02_TC01 @team11 @team11Regression @admin
Feature:Dean ekleyebilme

  Scenario Outline: TC01_Dean_olustur
    Given Ali "http://139.59.159.36:3000/" sayfasina gider
    And Ali bır sanıye bekler
    When Ali Login butonuna tiklar
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
    And Ali Dean List alaninin goruldugunu dogrular
    Then Ali Delete butonunun olmadıgını dogrular
    Then close the application

#
    Examples: dean_bilgileri
      | Username   | Password     | Name  | Surname  | Birth Place | Date Of Birth | Phone         | Ssn          | User Name | password |
      | Admin      | 485424698   | hasan |          | Van         | 29-03-2001    | 090-505-8189  | 505-91-6328  |Team11     | 57916929 |