@US05_AC02_TC01 @team11
Feature:Dean ekleyebilme

  Scenario Outline: TC01_Dean_olustur
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
    And Alı Dean List alaninin goruldugunu dogrular
    Then Alı Delete butonunun olmadıgını dogrular

#
    Examples: dean_bilgileri
      | Username   | Password     | Name  | Surname  | Birth Place | Date Of Birth | Phone         | Ssn          | User Name | password |
      | karakartal | 987654321   | hasan |          | Van         | 29-03-2001    | 090-505-8189  | 505-91-6328  |Team11     | 57916929 |