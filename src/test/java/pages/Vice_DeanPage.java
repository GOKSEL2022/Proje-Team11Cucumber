package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Vice_DeanPage {

    public Vice_DeanPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//button[@aria-controls='offcanvasNavbar-expand-false']") public WebElement menu_buton;

    @FindBy(xpath = "//*[.='Student Management']") public WebElement student_menu;

    @FindBy(xpath = "//*[.='Add Student']") public WebElement add_student_text;

    @FindBy(xpath = "//*[.='Education Term List']") public WebElement education_text;

    @FindBy(xpath = "//*[@id=\"advisorTeacherId\"]")
    public WebElement chooseTeacher;

    @FindBy(xpath = "//*[@id=\"name\"]") public WebElement student_name;

    @FindBy(xpath = "(//*[@class=\"invalid-feedback\"])[1]") public WebElement required1;

    @FindBy(xpath = "//*[@id=\"surname\"]") public WebElement student_surname;

    @FindBy(xpath = "//*[@id=\"birthPlace\"]") public WebElement student_birthplace;

    @FindBy(xpath = "//*[@id=\"email\"]") public WebElement student_email;

    @FindBy(xpath = "//*[@id=\"phoneNumber\"]") public WebElement student_phone_number;

    @FindBy(xpath = "//*[@value=\"FEMALE\"]") public WebElement student_female;

    @FindBy(xpath = "//*[@value=\"MALE\"]") public WebElement student_male;

    @FindBy(xpath = "//*[@id=\"birthDay\"]") public WebElement stufent_birtday;

    @FindBy(xpath = "//*[@id=\"ssn\"]") public WebElement student_ssn;

    @FindBy(xpath = "//*[@id=\"username\"]") public WebElement student_username;

    @FindBy(xpath = "//*[@id=\"fatherName\"]") public WebElement student_fathername;

    @FindBy(xpath = "//*[@id=\"motherName\"]") public WebElement student_mothername;

    @FindBy(xpath = "//*[@id=\"password\"]") public WebElement student_password;

    @FindBy(xpath = "(//*[.=\"Submit\"])[3]") public WebElement student_submit;

    @FindBy(xpath = "(//*[.='Student saved Successfully'])[4]") public WebElement student_saved_successfully;










}
