@team11 @team11Regression
Feature:
  Scenario:
    Given Kullanici "https://www.managementonschools.com/" gider
  When Kullanici Add Teacher sayfasının acildigini goruntuler
  And Kullanıcı açılan listeden belirtilen dersi seçer.
  And Kullanıcı Name textboxına geçerli bir değer girer
  And Kullanıcı  Surname textboxına geçerli bir değer girer
  And Kullanıcı Birth Place textboxını boş bırakır
  And Kullanıcı Email textboxına geçerli bir değer girer
  And Kullanıcı Phone textboxına geçerli bir değer girer
  And Kullanıcı  Is Advisor Teacher seçeneğini tıklar
  And Kullanıcı Gender seçeneklerinden seçim yapar.
  And Kullanıcı Date of Birth kutusuna geçersiz farkli değer girilir.
  And Kullanıcı Ssn textboxına geçerli bir değer girer
  And Kullanıcı User Name textboxına geçerli bir değer girer
  And Kullanıcı Password textboxına geçerli bir değer girer
  And Kullanıcı Submit butonuna tıklar
  Then Kullanici  isleminin basarili oldugunu gösteren popupı görüntüler
    Then close the application
