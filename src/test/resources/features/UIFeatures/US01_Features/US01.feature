@US01
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
    And   Kullanici Date Of Birt "<Date Of Birt>" girer
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
    Then  Kullanici Register isleminin basarili oldugunu gösteren popupı görüntüler
    Examples:
      | Name     | Surname | Birth Place | Phone        | Date Of Birt | Ssn         | User Name      | Password |
      | Adminn   | Celik   | Ordu        | 452-481-2166 | 01.01.2000   | 903-58-1258 | Goksel Celik1  | 12345678 |
      | *-+/%?!  | Celik   | Ordu        | 452-481-2166 | 01.01.2000   | 913-18-1258 | Goksel Celik2  | 12345678 |
      | 123456   | Celik   | Ordu        | 452-481-2166 | 01.01.2000   | 123-08-1258 | Goksel Celik3  | 12345678 |
      |          | Celik   | Ordu        | 452-481-2166 | 01.01.2000   | 933-76-1250 | Goksel Celik4  | 12345678 |
      | Adminn   | *-+/%?  | Ordu        | 452-481-2166 | 01.01.2000   | 943-78-1218 | Goksel Celik5  | 12345678 |
      | Admins   | 12345   | Ordu        | 452-481-2166 | 01.01.2000   | 950-78-0258 | Goksel Celik6  | 12345678 |
      | Admine   |         | Ordu        | 452-481-2166 | 01.01.2000   | 963-70-1258 | Goksel Celik7  | 12345678 |
      | Adminu   | Celik   | *-+/%?      | 452-481-2166 | 01.01.2000   | 974-58-1258 | Goksel Celik8  | 12345678 |
      | Admini   | Celik   | 12345       | 452-481-2166 | 01.01.2000   | 383-18-1258 | Goksel Celik9  | 12345678 |
      | Adminst  | Celik   |             | 452-481-2166 | 01.01.2000   | 993-56-1058 | Goksel Celik10 | 12345678 |
      | Admnistr | Celik   | Ordu        | ************ | 01.01.2000   | 163-13-0258 | Goksel Celik11 | 12345678 |
      | Admintor | Celik   | Ordu        | aaaaaaaaaaaa | 01.01.2000   | 163-78-1058 | Goksel Celik12 | 12345678 |
      | Adminnn  | Celik   | Ordu        |              | 01.01.2000   | 263-78-1908 | Goksel Celik13 | 12345678 |
      | Admino   | Celik   | Ordu        | 452-481-2166 | 01.01.2000   | 363-78-1008 | Goksel Celik14 | 12345678 |
      | Adminı   | Celik   | Ordu        | 452-481-2166 | 06.04.2023   | 463-78-1228 | Goksel Celik15 | 12345678 |
      | Adminni  | Celik   | Ordu        | 452-481-2166 | 01.01.1900   | 563-78-1118 | Goksel Celik16 | 12345678 |
      | Adminne  | Celik   | Ordu        | 452-481-2166 |              | 663-78-1098 | Goksel Celik17 | 12345678 |
      | Adminnu  | Celik   | Ordu        | 452-481-2166 | 01.01.2000   | 76307884278 | Goksel Celik18 | 12345678 |
      | Adminne  | Celik   | Ordu        | 452-481-2166 | 01.01.2000   |             | Goksel Celik19 | 12345678 |
      | Adminnm  | Celik   | Ordu        | 452-481-2166 | 01.01.2000   | 803-78-0058 |                | 12345678 |
      | Adminnms | Celik   | Ordu        | 452-481-2166 | 01.01.2000   | 969-78-0008 | Goksel Celik20 |          |


