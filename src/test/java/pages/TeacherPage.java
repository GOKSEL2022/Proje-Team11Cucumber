package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherPage {
    public TeacherPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h5[.='Add Teacher']")
    public WebElement addteacher_text_teacher;

    @FindBy(id = "react-select-2-input")
    public WebElement chooseLessons_dropBox_teacher;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement name_box_teacher;

    @FindBy(xpath = "//input[@id='surname']")
    public WebElement surname_box_teacher;

    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement birthPlace_box_teacher;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement email_box_teacher;
    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement phoneNumber_box_teacher;
    @FindBy(xpath = "//input[@id='isAdvisorTeacher']")
    public WebElement isAdvisorTeacher_checkBox_teacher;
    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement male_checkBox_teacher;
    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement birthDay_box_teacher;
    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssn_box_teacher;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username_box_teacher;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password_box_teacher;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submit_button_teacher;
    @FindBy(xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-center']")//*[text()='Teacher saved successfully']
    public WebElement teacherSaved_alert_teacher;
    @FindBy(xpath = "//*[.='Logout']")
    public WebElement logout_button_teacher;

@FindBy(xpath = "//button[@aria-controls='offcanvasNavbar-expand-false']")
    public WebElement menu_button_teacher;
}
