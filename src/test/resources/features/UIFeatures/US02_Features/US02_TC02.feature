@smoke
Feature:US02_AC0TC02
  Scenario:US02_AC0TC02

  Given Goksel "https://www.managementonschools.com/" gider
  When Goksel login olur
  And Goksel sayfanin sag üst kösesinde Menu butonunu görüntüler
  And Goksel sayfanin sag üst kösesinde Menu butonunu tiklar
  And Goksel bir sn bekler
  And Goksel Main Menuyü görüntüler
  And Goksel Guest User secenegini tiklar
  And Goksel Guest User List basligini görüntüler
  And Goksel Name Surname altbasligini görüntüler
  And Goksel Phone Number altbasligini görüntüler
  When Goksel Ssn altbasligini görüntüler
  Then Goksel User Name altbasligini görüntüler
