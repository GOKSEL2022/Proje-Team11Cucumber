package pages.US04_US05_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeanManagementPage {
    public DeanManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[.='Dean Management'])[4]")
    public WebElement text_Dean_Management;

    @FindBy(xpath = "//*[.='Add Dean']")
    public WebElement text_Add_Dean;

    @FindBy(xpath = "//*[.='Dean List']")
    public WebElement text_Dean_List;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement name_Add_Dean;

    @FindBy(xpath = "//*[@id='surname']")
    public WebElement surname_Add_Dean;

    @FindBy(xpath = "//*[@id='birthPlace']")
    public WebElement birthPlace_Add_Dean;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement phoneNumber_Add_Dean;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement female_Checkbox_Add_Dean;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement male_Checkbox_Add_Dean;

    @FindBy(xpath = "//*[@id='birthDay']")
    public WebElement dateOfBirth_Add_Dean;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssn_Add_Dean;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username_Add_Dean;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password_Add_Dean;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submit_Button_Add_Dean;

    @FindBy(xpath = "(//*[@class='text-dark btn btn-outline-info'])[1]")
    public WebElement button_Edit_Dean_List;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement name_Required_Message_Add_Dean;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[2]")
    public WebElement surname_Required_Message_Add_Dean;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[3]")
    public WebElement birthPlace_Required_Message_Add_Dean;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[4]")
    public WebElement dateOfBirth_Required_Message_Add_Dean;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[5]")
    public WebElement phoneNumber_Required_Message_Add_Dean;

    @FindBy(xpath = "//*[.='Minimum 12 character (XXX-XXX-XXXX)']")
    public WebElement phoneNumber_Minimum12_Character_Message_Add_Dean;



    @FindBy(xpath = "//*[@id='16']")
    public WebElement phoneNumber_12_Character_Message_Add_Dean;

    @FindBy(xpath = "//*[.='Minimum 12 character (XXX-XXX-XXXX)']")
    public WebElement phoneNumber_PleaseEntervalidPhoneNumber_Character_Message_Add_Dean;

    @FindBy(xpath = "//div[.='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement ssn_Minimum11Character_Message_Add_Dean;

    @FindBy(xpath = "(//*[.='Please enter valid SSN number'])[4]")
    public WebElement ssn_PleaseEnterValidSsnNumber_Message_Add_Dean;



    @FindBy(xpath = "(//*[@class='invalid-feedback'])[6]")
    public WebElement ssn_Required_Message_Add_Dean;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[7]")
    public WebElement username_Required_Message_Add_Dean;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[8]")
    public WebElement password_Required_Message_Add_Dean;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[8]")
    public WebElement password_Minimum8Character_Message_Add_Dean;

    @FindBy(xpath = "//div[@id='2']")
    public WebElement dean_Saved_message;



//div[.='Minimum 8 character']


}
