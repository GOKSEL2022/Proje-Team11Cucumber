@US02_AC0TC02
Feature:US02_AC0TC02
  Scenario:US02_AC0TC02

  Given Kullanici "https://www.managementonschools.com/" gider
  When Kullanici login olur
  And  Kullanici sayfanin sag üst kösesinde Menu butonunu görüntüler
  And Kullanici sayfanin sag üst kösesinde Menu butonunu tiklar
  And Kullanici bir sn bekler
  And  Kullanici Main Menuyü görüntüler
  And  Kullanici Guest User secenegini tiklar
  And  Kullanici Guest User List basligini görüntüler
  And  Kullanici Name Surname altbasligini görüntüler
  And  Kullanici Phone Number altbasligini görüntüler
  When Kullanici Ssn altbasligini görüntüler
  Then Kullanici User Name altbasligini görüntüler
