package stepdefinitions.UI_Tests.US14;

import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import pages.ViceDeanTeacherPage;
import utilities.ReusableMethods;

public class AC02_TC01_Goruntuleme {
    ViceDeanTeacherPage viceDeanTeacherPage = new ViceDeanTeacherPage();
    @And("Choose Lessons bölümünü geçerli değer ile günceller")
    public void chooseLessonsBolumunuGecerliDegerIleGunceller() {
        viceDeanTeacherPage.lessonedit.sendKeys(Keys.PAGE_DOWN,Keys.ENTER);
        ReusableMethods.waitFor(4);
    }

    @And("Name textboxını geçerli değer ile günceller")
    public void nameTextboxınıGecerliDegerIleGunceller(String string) {
        viceDeanTeacherPage.editNameTextBox.sendKeys("mert");
        ReusableMethods.waitFor(1);
    }

    @And("Surname textboxını geçerli değer ile günceller")
    public void surnameTextboxınıGecerliDegerIleGunceller(String string) {
        viceDeanTeacherPage.editSurnameTextBox.sendKeys("dogan");
        ReusableMethods.waitFor(1);
    }

    @And("Birth Place textboxını geçerli değer ile günceller")
    public void birthPlaceTextboxınıGecerliDegerIleGunceller() {
        viceDeanTeacherPage.editBirthPlace.sendKeys("usak");
        ReusableMethods.waitFor(1);

    }

    @And("e-mail  textboxını geçerli değer ile günceller")
    public void eMailTextboxınıGecerliDegerIleGunceller() {
        viceDeanTeacherPage.editEmailTextbox.sendKeys("asdfght@gmail.com");
        ReusableMethods.waitFor(1);
    }

    @And("phone textboxını geçerli değer ile günceller")
    public void phoneTextboxınıGecerliDegerIleGunceller() {
        viceDeanTeacherPage.editPhoneTextbox.sendKeys("888-999-5555");
        ReusableMethods.waitFor(1);
    }

    @And("is Advisor Teacher seçimini seçer ve günceller")
    public void isAdvisorTeacherSeciminiSecerVeGunceller() {
        viceDeanTeacherPage.editIsAdvisorTeacher.click();
        ReusableMethods.waitFor(1);
    }

    @And("Gender seçimini seçer ve günceller")
    public void genderSeciminiSecerVeGunceller() {
        viceDeanTeacherPage.editGenderFemale.click();
        ReusableMethods.waitFor(1);
    }

    @And("Date of Birth  textboxını geçerli değer ile günceller")
    public void dateOfBirthTextboxınıGecerliDegerIleGunceller() {
        viceDeanTeacherPage.editdateOfBirth.sendKeys("05.06.1986");
        ReusableMethods.waitFor(1);
    }

    @And("SSN  textboxını geçerli değer ile günceller")
    public void ssnTextboxınıGecerliDegerIleGunceller() {
        viceDeanTeacherPage.editSsnTextbox.sendKeys("666-11-8888");
        ReusableMethods.waitFor(1);
    }

    @And("User Name geçerli değer ile günceller")
    public void userNameGecerliDegerIleGunceller() {
        viceDeanTeacherPage.editUsernameTextbox.sendKeys("samet");
        ReusableMethods.waitFor(1);
    }

    @And("Password geçerli değer ile günceller")
    public void passwordGecerliDegerIleGunceller() {
        viceDeanTeacherPage.editPasswordTextbox.sendKeys("eren");
    }
}
