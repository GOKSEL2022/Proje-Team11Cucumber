Feature: user story 11

  Background:
    Given Kullanıcı login sayfasına gider.
    Then Kullanıcı login sayfasında olduğunu onaylar.
    When Kullanıcı username alanını doldurur.
    And Kullanıcı password alanını doldurur.
    And Kullanıcı login butonuna tıklar.
    Then Kullanıcı anasayfada olduğunu doğrular.
    Then Kullanıcı uc farklı modulü görmelidir.
      | Education Term |
      | Lessons        |
      | Lesson Program |
    When Lesson Program alanına tıklar.
    Then Kullanıcı "Lesson Program Management" başlığını görmeli.(lessonProgram)
    And Kullanıcı "Add Lesson Program" başlığını görmeli.(addLesson)

    @viceDeanDersProgramıGörme
    Scenario: Kullanıcı dersleri görmeli ve düzenlemelidir
      When Kullanıcı Lesson Program List'e sayfayı sürükler
      And Kullanıcı "Lesson Program List" görmeelidir
      And Kullanıcı Lesson Program List tablosundaki "Lesson","Day","Start Time","Stop Time" görür
      And Kullanıcı Lesson Program List tablosu içerisindeki "Functional Analysis","MONDAY","14:00","15:00" görür
