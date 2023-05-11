@team11 @team11Regression
Feature:
  Scenario:
    Given Kullanici "https://www.managementonschools.com/" gider
  When Kullanici Teacher Management sayfasının acildigini goruntuler
  And Kullanıcı Teacher listten seçilen öğretmenin Edit butonuna tıklar
  And Choose Lessons bölümünü geçerli değer ile günceller
  And Name textboxını geçerli değer ile günceller
  And Surname textboxını geçerli değer ile günceller
  And Birth Place textboxını geçerli değer ile günceller
  And e-mail  textboxını geçerli değer ile günceller
  And phone textboxını geçerli değer ile günceller
  And is Advisor Teacher seçimini seçer ve günceller
  And Gender seçimini seçer ve günceller
  And Date of Birth  textboxını geçerli değer ile günceller
  And SSN  textboxını geçerli değer ile günceller
  And User Name geçerli değer ile günceller
  And Password geçerli değer ile günceller
    Then close the application
