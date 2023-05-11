@team11 @team11Regression
Feature:
  Scenario:
    Given Kuullanici "https://www.managementonschools.com/" gider
  When Kuullanici Add Teacher sayfasının acildigini goruntuler
  And Kuullanıcı açılan listeden belirtilen dersi seçer.
  And Kuullanıcı Name textboxına geçerli bir değer girer
  And Kuullanıcı  Surname textboxına geçerli bir değer girer
  And Kuullanıcı Birth Place textboxını boş bırakır
  And Kuullanıcı Email textboxını boş bırakır.
  And Kuullanıcı Phone textboxına geçerli bir değer girer
  And Kuullanıcı  Is Advisor Teacher seçeneğini tıklar
  And Kuullanıcı Gender seçeneklerinden male seçeneğini tıklar
  And Kuullanıcı Date of Birth kutusuna geçerli bir değer girer
  And Kuullanıcı Ssn textboxına geçerli bir değer girer
  And Kuullanıcı User Name textboxına geçerli bir değer girer
  And Kuullanıcı Password textboxına geçerli bir değer girer
  And Kuullanıcı Submit butonuna tıklar
  Then Kuullanici  isleminin basarili oldugunu gösteren popupı görüntüler
    Then close the application

