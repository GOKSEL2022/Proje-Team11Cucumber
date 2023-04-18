package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ViceDeanTeacherPage {
    public ViceDeanTeacherPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h5[.='Add Teacher']")
    public WebElement vice_dean_add_teacher_text_teacher;

    @FindBy(id = "react-select-3-input")
    public WebElement vice_dean_chooseLessons_dropBox_teacher;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement vice_name_box_teacher;

    @FindBy(xpath = "//input[@id='surname']")
    public WebElement vice_surname_box_teacher;

    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement vice_birthPlace_box_teacher;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement vice_email_box_teacher;
    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement vice_phoneNumber_box_teacher;
    @FindBy(xpath = "//input[@id='isAdvisorTeacher']")
    public WebElement vice_isAdvisorTeacher_checkBox_teacher;
    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement vice_male_checkBox_teacher;
    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement vice_birthDay_box_teacher;
    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement vice_ssn_box_teacher;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement vice_username_box_teacher;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement vice_password_box_teacher;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement vice_submit_button_teacher;
    @FindBy(xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-center']")//*[text()='Teacher saved successfully']
    public WebElement vice_teacherSaved_alert_teacher;
    @FindBy(xpath = "//*[.='Logout']")
    public WebElement vice_logout_button_teacher;
    @FindBy(xpath = "//*[id='react-select-7-input")
    public WebElement lessonedit;
    // duzeltme

    @FindBy(id = "controlled-tab-example-tabpane-teachersList")
    public List<WebElement> required;
    @FindBy(xpath = "(//*[@role='button'])[13]")
    public WebElement sagOkButton;
    @FindBy(xpath = "//div[text()='Edit Teacher']")
    public WebElement editTeacherYazisi;
    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[13]")
    public WebElement editButton;
    @FindBy(xpath = "(//*[@id='name'])[2]")
    public WebElement editNameTextBox;
    @FindBy(xpath = "(//input[@placeholder='Surname'])[2]")
    public WebElement editSurnameTextBox;
    @FindBy(xpath = "(//input[@placeholder='Birth Place'])[2]")
    public WebElement editBirthPlace;
    @FindBy(xpath = "(//input[@id='password'])[2]")
    public WebElement editPasswordTextbox;
    @FindBy(xpath = "(//*[@id='birthDay'])[2]")
    public WebElement editdateOfBirth;
    @FindBy(xpath = "(//input[@placeholder='Email Address'])[2]")
    public WebElement editEmailTextbox;
    @FindBy(xpath = "(//input[@id='phoneNumber'])[2]")
    public WebElement editPhoneTextbox;
    @FindBy(xpath = "(//input[@id='ssn'])[2]")
    public WebElement editSsnTextbox;
    @FindBy(xpath = "(//input[@id='username'])[2]")
    public WebElement editUsernameTextbox;
    @FindBy(xpath = "(//input[@id='isAdvisorTeacher'])[2]")
    public WebElement editIsAdvisorTeacher;
    @FindBy(xpath = "(//input[@name='gender'])[4]")
    public WebElement editGenderMale;
    @FindBy(xpath = "(//*[@value='FEMALE'])[2]")
    public WebElement editGenderFemale;
    @FindBy(xpath = "(//button[text()='Submit'])[2]")
    public WebElement editSubmitButton;


    @FindBy(xpath = "//div[contains(text(),'JSON parse error: Cannot coerce empty String (\"\") ')]")
    public WebElement errorMessage;

}
