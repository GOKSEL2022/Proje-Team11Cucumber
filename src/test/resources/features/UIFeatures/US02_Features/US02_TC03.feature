@admin @team11Regression
Feature:US02_TC03

  Scenario:US02_TC03
    Given Goksel "https://www.managementonschools.com/" gider
    When Goksel login olur
    And Goksel sayfanin sag üst kösesinde Menu butonunu tiklar
    And Goksel bir sn bekler
    And Goksel Main Menuyü görüntüler
    And Goksel Guest User secenegini tiklar
    And Goksel Guest User List basligini görüntüler
    And Goksel Name Surname altbasligini görüntüler
    And Goksel Phone Number altbasligini görüntüler
    And Goksel Ssn altbasligini görüntüler
    And Goksel User Name altbasligini görüntüler
    And Goksel sil butonlarini görüntüler
    And Goksel sil butonlarindan ilkine tiklar
    When Goksel Guest User deleted Successful alertini görüntüler
    Then close the application