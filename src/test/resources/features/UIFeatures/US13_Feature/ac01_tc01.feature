@team11 @team11Regression @team11Smoke
Feature:AC01_TC01
  Scenario:AC01_TC01

    Given Kullanici "https://www.managementonschools.com/" gider
    When Kullanici Add Teacher sayfasının acildigini goruntuler
  And Kullanıcı Choose Lessons butonuna tıklar
  And Kullanıcı açılan listeden belirtilen dersi seçer.
  And Kullanıcı Name textboxına geçerli bir değer girer
  And Kullanıcı  Surname textboxına geçerli bir değer girer
  And Kullanıcı Birth Place textboxına geçerli bir değer girer
  And Kullanıcı Email textboxına geçerli bir değer girer
  And Kullanıcı Phone textboxına geçerli bir değer girer
  And Kullanıcı  Is Advisor Teacher seçeneğini tıklar
  And Kullanıcı Gender seçeneklerinden male seçeneğini tıklar
  And Kullanıcı Date of Birth kutusuna geçerli bir değer girer
  And Kullanıcı Ssn textboxına geçerli bir değer girer
  And Kullanıcı User Name textboxına geçerli bir değer girer
  And Kullanıcı Password textboxına geçerli bir değer girer
  And Kullanıcı Submit butonuna tıklar
  Then Kullanici  isleminin basarili oldugunu gösteren popupı görüntüler
    Then close the application
