
Feature:US02_TC03
  Scenario:US02_TC03
    Given Kullanici "https://www.managementonschools.com/" gider
    When Kullanici login olur
    And Kullanici sayfanin sag üst kösesinde Menu butonunu tiklar
    And Kullanici bir sn bekler
    And  Kullanici Main Menuyü görüntüler
    And  Kullanici Guest User secenegini tiklar
    And  Kullanici Guest User List basligini görüntüler
    And  Kullanici Name Surname altbasligini görüntüler
    And  Kullanici Phone Number altbasligini görüntüler
    And  Kullanici Ssn altbasligini görüntüler
    And  Kullanici User Name altbasligini görüntüler
    And  Kullanici sil butonlarini görüntüler
    And  Kullanici sil butonlarindan ilkine tiklar
    When Kullanici Guest User deleted Successful alertini görüntüler

