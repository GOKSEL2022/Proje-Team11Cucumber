package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddAdminPage {

    public AddAdminPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement login_Link;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username_Box_Login;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password_Box_Login;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement login_Button;

    @FindBy(xpath = "//*[.='Add Admin']")
    public WebElement add_Admin_Text;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement name_admin;

    @FindBy(xpath = "//*[@id='surname']")
    public WebElement surname_admin;

    @FindBy(xpath = "//*[@id='birthPlace']")
    public WebElement birthPlace_admin;

    @FindBy(xpath = "//*[@id='birthDay']")
    public WebElement birthDay_admin;

    @FindBy(xpath = "//*[@id='phoneNumber']")
    public WebElement phoneNumber_admin;

    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement ssn_admin;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username_admin;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password_admin;

    @FindBy(xpath = "(//*[.='Submit'])[3]")
    public WebElement submit_button_admin;

    @FindBy(xpath = "(//input[@name='gender'])[1]")
    public WebElement female_admin;

    @FindBy(xpath = "(//input[@name='gender'])[2]")
    public WebElement male_admin;

    @FindBy(xpath = "(//*[.='Required'])[1]")
    public WebElement required_name;

    @FindBy(xpath = "(//*[.='Required'])[2]")
    public WebElement required_surname;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement required_surname_2;

    @FindBy(xpath = "(//*[.='Required'])[3]")
    public WebElement required_birthPlace;

    @FindBy(xpath = "//*[.='Required']")
    public WebElement required_birthDay;

    @FindBy(xpath = "(//*[.='Required'])[5]")
    public WebElement required_phone;

    @FindBy(xpath = "//div[contains(text(),'Required')]")
    public WebElement required_ssn;
//
//    @FindBy(xpath = "(//*[.='Required')])[6]")
//    public WebElement required_ssn_2;

//    @FindBy(xpath = "(//*[.='Required'])[7]")
//    public WebElement required_username;

    @FindBy(xpath = "//div[contains(text(),'Required')]")
    public WebElement required_username;

    @FindBy(xpath = "(//*[.='Required'])[8]")
    public WebElement required_password;

    @FindBy(xpath = "//div[contains(text(),'Error: User with phone number 530-695-4588 already register')]")
    public WebElement eror_phonenumber_alert;

    @FindBy(xpath = "//div[contains(text(),'Please enter valid phone number')]")
    public WebElement eror_validphonenumber_alert;

    @FindBy(xpath= "//div[contains(text(),'Admin Saved')]")
    public WebElement saved_alert;

    @FindBy(xpath = "//div[@id='19']")
    public WebElement adminSaved_alert;

//    @FindBy(xpath = "//div[contains(text(),'must be a past date')]")
//    public WebElement pastdate_alert;

    @FindBy(xpath = "(//div[.='must be a past date'])[3]")
    public WebElement pastdate_alert;

    @FindBy(xpath = "//div[contains(text(),'Error: User with username AdminB103 already register')]")
    public WebElement username_already_register_alert;

    @FindBy(xpath = "//div[contains(text(),'Minimum 8 character')]")
    public WebElement min8_character;

    @FindBy(xpath = "//div[contains(text(),'Full authentication is required to access this resource')]")
    public WebElement full_authentication_alert;

    @FindBy(xpath = "//div[contains(text(),'Minimum 12 character (XXX-XXX-XXXX)')]")
    public WebElement min12_character;

    @FindBy(xpath = "//div[contains(text(),'Error: User with ssn 333-33-3333 already register')]")
    public WebElement ssn_already_register;

    @FindBy(xpath = "//div[contains(text(),'Please enter valid SSN number')]")
    public WebElement ssn_entervalid;

    @FindBy(xpath = "//div[contains(text(),'Minimum 11 character (XXX-XX-XXXX)')]")
    public WebElement min11_character;

    @FindBy(xpath = "//div[contains(text(),'geçmiş bir tarih olmalı')]")
    public WebElement gecmistariholmali_alert;

}
