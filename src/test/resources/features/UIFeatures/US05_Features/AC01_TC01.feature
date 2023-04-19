@US05_AC01_TC01 @team11
Feature:Deanlari gorebilme ve silebilme

  Scenario Outline: TC01_Dean_List_Bilgilerini_Gorur
    Given Alı "https://www.managementonschools.com" gider
    And Alı bır sanıye bekler
    When Alı Login butonuna tiklar
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
    Then Alı Dean List alaninin goruldugunu dogrular


#
    Examples: dean_bilgileri
      | Username   | Password    | Name  | Surname  | Birth Place | Date Of Birth | Phone         | Ssn          | User Name | password |
      | karakartal | 987654321   | hasan | tarik    | Van         | 29-03-2001    | 090-505-7310  | 505-51-6328  |Team11     | 57916929 |