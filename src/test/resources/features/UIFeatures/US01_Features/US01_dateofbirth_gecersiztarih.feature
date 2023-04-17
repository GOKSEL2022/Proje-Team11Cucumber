@team11
Feature:US01
  Scenario Outline:US01

    Given Kullanici "https://www.managementonschools.com/" gider
    Then  Kullanici anasayfanın acildigini goruntuler
    And   Kullanici bir sn bekler
    And   Kullanici Register butonunun sayfada yer aldigini goruntuler
    And   Kullanici bir sn bekler
    And   Kullanici Register butonuna tiklar
    And   Kullanici bir sn bekler
    And   Kullanici Register menusunun altinda doldurulacak alanlari goruntuler
    And   Kullanici bir sn bekler
    And   Kullanici zorunlu alanlarin altinda Required yazisini  goruntuler
    And   Kullanici Name "<Name>" girer
    And   Kullanici bir sn bekler
    And   Kullanici Name textboxinin altindaki Required yazisinin kalktigini  goruntuler
    And   Kullanici Surname "<Surname>"  girer
    And   Kullanici bir sn bekler
    And   Kullanici Surname textboxinin altindaki required yazisinin kalktigini  goruntuler
    And   Kullanici Birth Place "<Birth Place>" girer
    And   Kullanici bir sn bekler
    And   Kullanici Birth Place textboxinin altindaki required yazisinin kalktigini  goruntuler
    And   Kullanici Phone "<Phone>" girer
    And   Kullanici bir sn bekler
    And   Kullanici Phone textboxinin altindaki required yazisinin kalktigini  goruntuler
    And   Kullanici Gender alanindan Male chexboxini tiklar
    And   Kullanici bir sn bekler
    And   Kullanici Date Of Birt "<Date Of Birt>" girer.
    And   Kullanici bir sn bekler
    And   Kullanici Date Of Birt textboxinin altindaki required yazisinin kalktigini  goruntuler
    And   Kullanici Ssn "<Ssn>" girer
    And   Kullanici bir sn bekler
    And   Kullanici Ssn textboxinin altindaki required yazisinin kalktigini  goruntuler
    And   Kullanici User Name "<User Name>" girer
    And   Kullanici bir sn bekler
    And   Kullanici User Name textboxinin altindaki required yazisinin kalktigini  goruntuler
    And   Kullanici Password "<Password>" girer ve Register_Register butonunu tiklar
    And   Kullanici bir sn bekler
    Then  Kullanici Register olmadıgını görüntüler
    Examples:
      | Name    | Surname | Birth Place | Phone        | Date Of Birt | Ssn         | User Name    | Password |
      | Admin   | Celik   | Ordu        | 452-481-2166 | 01.01.1900   | 563-78-1118 | Goksel Celik | 12345678 |






