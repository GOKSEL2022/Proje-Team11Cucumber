package stepdefinitions.UI_Tests.US10;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LessonProgramPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.image.Kernel;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class US10 {
  // LoginPage loginPage = new LoginPage();
  // LessonProgramPage lessonProgramPage = new LessonProgramPage();
  // HomePage homePage = new HomePage();

  // @Given("Kullanıcı login sayfasına gider.")
  // public void kullanıcıLoginSayfasınaGider() {
  //     Driver.getDriver().get(ConfigReader.getProperty("managementonschools"));
  //     ReusableMethods.waitForClickablility(homePage.login_Button_Home, 15);
  //     homePage.login_Button_Home.click();


  // }

  // @Then("Kullanıcı login sayfasında olduğunu onaylar.")
  // public void kullanıcıLoginSayfasındaOlduğunuOnaylar() {
  //     ReusableMethods.waitForVisibility(loginPage.username_Box_Login, 15);
  //     String expectedUrl = "https://www.managementonschools.com/login";
  //     String actualUrl = Driver.getDriver().getCurrentUrl();
  //     assert expectedUrl.equals(actualUrl);
  // }

  // @When("Kullanıcı username alanını doldurur.")
  // public void kullanıcıUsernameAlanınıDoldurur() {
  //     ReusableMethods.waitForVisibility(loginPage.username_Box_Login, 15);
  //     String username = ConfigReader.getProperty("vice_dean_username");
  //     loginPage.username_Box_Login.sendKeys(username);
  // }

  // @And("Kullanıcı password alanını doldurur.")
  // public void kullanıcıPasswordAlanınıDoldurur() {
  //     ReusableMethods.waitForVisibility(loginPage.password_Box_Login, 15);
  //     String password =ConfigReader.getProperty("vice_dean_password");
  //     loginPage.password_Box_Login.sendKeys(password);
  // }

  // @And("Kullanıcı login butonuna tıklar.")
  // public void kullanıcıLoginButonunaTıklar() {
  //     ReusableMethods.waitForClickablility(loginPage.login_Button_Login, 15);
  //     loginPage.login_Button_Login.click();
  // }

  // @Then("Kullanıcı anasayfada olduğunu doğrular.")
  // public void kullanıcıAnasayfadaOlduğunuDoğrular() {
  //     ReusableMethods.waitForVisibility(lessonProgramPage.educationTermManagementHeader, 15);
  //     String expectedUrl = "https://www.managementonschools.com/lesson";
  //     String actualUrl = Driver.getDriver().getCurrentUrl();
  //     assert expectedUrl.equals(actualUrl);
  // }

  // @Then("Kullanıcı {string} başlığını görmeli.\\(lessonProgram)")
  // public void kullanıcıBaşlığınıGörmeliLessonProgram(String expectedHeader) {
  //     ReusableMethods.waitForVisibility(lessonProgramPage.lessonProgramManagementHeader, 15);
  //     String actualHeader = lessonProgramPage.lessonProgramManagementHeader.getText();
  //     System.out.println("actualHeader = " + actualHeader);
  //     assertEquals(expectedHeader,actualHeader);

  // }

  // @And("Kullanıcı {string} başlığını görmeli.\\(addLesson)")
  // public void kullanıcıBaşlığınıGörmeliAddLesson(String expectedHeader) {
  //     ReusableMethods.waitForVisibility(lessonProgramPage.addLessonProgramHeader, 15);
  //     String actualHeader = lessonProgramPage.addLessonProgramHeader.getText();
  //     System.out.println("actualHeader = " + actualHeader);
  //     assertEquals(expectedHeader,actualHeader);

  // }
  // @Then("Kullanıcı uc farklı modulü görmelidir.")
  // public void kullanıcıUcFarklıModulüGörmelidir(List<String> expectedAllTabs) {
  //     ReusableMethods.waitForVisibility(lessonProgramPage.allTabs.get(0), 15);
  //     for (int i = 0; i < lessonProgramPage.allTabs.size(); i++) {
  //         ReusableMethods.waitForVisibility(lessonProgramPage.allTabs.get(i), 15);
  //         System.out.println("expectedAllTabs = " + expectedAllTabs.get(i));
  //         String actualTab = lessonProgramPage.allTabs.get(i).getText();
  //         System.out.println("actualTab = " + actualTab);
  //         assert expectedAllTabs.get(i).equals(actualTab);
  //     }
  // }

  // @When("Lesson Program alanına tıklar.")
  // public void lessonProgramAlanınaTıklar() {
  //     ReusableMethods.waitForClickablility(lessonProgramPage.allTabs.get(2), 15);
  //     lessonProgramPage.allTabs.get(2).click();
  // }

  // @Then("Kullanıcı {string} başlığını görmeli.")
  // public void kullanıcıBaşlığınıGörmeli(String expectedHeader) {
  //     ReusableMethods.waitForVisibility(lessonProgramPage.chooseLessonsHeader, 15);
  //     String actualHeader = lessonProgramPage.chooseLessonsHeader.getText();
  //     System.out.println("actualHeader = " + actualHeader);
  //     assertEquals(expectedHeader,actualHeader);


  // }

  // @Then("Kullanıcı {string} place holder'ını görmeli.")
  // public void kullanıcıPlaceHolderInıGörmeli(String expectedPlaceHolder) {
  //     ReusableMethods.waitForVisibility(lessonProgramPage.chooseLessonsPlaceHolder, 15);
  //     String actualPlaceHolder = lessonProgramPage.chooseLessonsPlaceHolder.getText();
  //     System.out.println("actualPlaceHolder = " + actualPlaceHolder);
  //     assert expectedPlaceHolder.equals(actualPlaceHolder);
  // }

  // @When("Kullanıcı select lesson butonuna tıklar.")
  // public void kullanıcıSelectLessonButonunaTıklar() throws InterruptedException {
  //     ReusableMethods.waitForClickablility(lessonProgramPage.chooseLessonsSelectBox, 15);
  //     lessonProgramPage.chooseLessonsSelectBox.click();

  // }

  // @And("Herhangi bir {string} seçilir.")
  // public void herhangiBirSeçilir(String ders) throws InterruptedException {
  //     Thread.sleep(2000);
  //     Actions action=new Actions(Driver.getDriver());
  //     action.keyDown(Keys.ARROW_DOWN).sendKeys(ders,Keys.ENTER).perform();
  //     action.keyDown(Keys.TAB).perform();

  // }

  // @Then("Seçilen ders select lesson searchbox'ında görünür.")
  // public void seçilenDersSelectLessonSearchboxIndaGörünür() {
  // }

  // @When("Çarpı ikonuna basılır.")
  // public void çarpıIkonunaBasılır() {
  //     ReusableMethods.waitForClickablility(lessonProgramPage.bosDersDersi,15);
  //     lessonProgramPage.carpiIsareti.click();
  // }


  // @Then("Eğitim dönemi dropdownına tıklanır")
  // public void eğitimDönemiDropdownınaTıklanır() {
  //     ReusableMethods.waitForVisibility(lessonProgramPage.addLessonProgramHeader,14);
  //     lessonProgramPage.chooseEducationTerm.click();
  // }

  // @Then("Eğitim dönemi seçilir")
  // public void eğitimDönemiSeçilir() {
  //     ReusableMethods.waitForVisibility(lessonProgramPage.addLessonProgramHeader,10);
  //     Actions action=new Actions(Driver.getDriver());
  //     action.keyDown(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
  // }

  // @Then("Add Lesson Program alanından Choose Day dropdowndan gün seçilir")
  // public void addLessonProgramAlanındanChooseDayDropdowndanGünSeçilir() {
  //     ReusableMethods.waitForVisibility(lessonProgramPage.addLessonProgramHeader,10);
  //     lessonProgramPage.chooseDay.click();
  //     Actions action=new Actions(Driver.getDriver());
  //     action.keyDown(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
  // }

  // @Then("Add Lesson Program alanından Start Time seçilir")
  // public void addLessonProgramAlanındanStartTimeSeçilir() {
  //     ReusableMethods.waitForVisibility(lessonProgramPage.addLessonProgramHeader,15);
  //     WebElement startTime=lessonProgramPage.startTime;
  //     startTime.click();
  //     startTime.sendKeys("12","00");

  // }

  // @Then("Add Lesson Program alanından Stop Time seçilir")
  // public void addLessonProgramAlanındanStopTimeSeçilir() {
  //     ReusableMethods.waitForVisibility(lessonProgramPage.addLessonProgramHeader,15);
  //     WebElement startTime=lessonProgramPage.startTime;
  //     startTime.click();
  //     startTime.sendKeys(Keys.TAB,"13","00");


  // }


}
