Feature: user story 12

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

  @chooseLesson2
  Scenario: Kullanıcı ders seçebilmeli.
    Then Kullanıcı "Choose Lessons" başlığını görmeli.
    Then Kullanıcı "Select lesson" place holder'ını görmeli.
    When Kullanıcı select lesson butonuna tıklar.
    And Herhangi bir "ders" seçilir.
    Then Seçilen ders select lesson searchbox'ında görünür.
    Then Eğitim dönemi dropdownına tıklanır
    Then Eğitim dönemi seçilir
    Then Add Lesson Program alanından Choose Day dropdowndan gün seçilir
    Then Add Lesson Program alanından Start Time seçilir
    Then Add Lesson Program alanından Stop Time seçilir
    And Kullanıcı submit butonuna tıklar
    Then Lesson Program Assignment alanında choose lessons bölümünde dersin geldiğini görür
    When Lesson Program Assignment alanında choose lessons bölümünde olusturulan dersi seçer
    When Seçilen derse choose teacher kısmından öğretmen ataması yapılabilmelidir
#    Then submit butonuna tıklanarak onay mesajı görülüt