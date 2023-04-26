@US05_AC01_TC01 @team11
Feature:Deanlari gorebilme ve silebilme

  Scenario Outline: TC01_Dean_List_Bilgilerini_Gorur
    Given Ali "https://www.managementonschools.com" sayfasina gider
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
    Then Ali Dean List alaninin goruldugunu dogrular


#
    Examples: dean_bilgileri
      | Username   | Password    | Name  | Surname  | Birth Place | Date Of Birth | Phone         | Ssn          | User Name | password |
      | karakartal | 987654321   | hasan | tarik    | Van         | 29-03-2001    | 090-505-7310  | 505-51-6328  |Team11     | 57916929 |