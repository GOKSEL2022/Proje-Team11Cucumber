package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {
    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='name']")
    public WebElement name_Box_Register;

    @FindBy(xpath = "//*[@id='surname']")
    public WebElement surname_Box_Register;

    @FindBy(xpath = "//*[@id='birthPlace']")
    public WebElement birthPlace_Box_Register;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement phoneNumber_Box_Register;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement female_Checkbox_Register;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement male_Checkbox_Register;

    @FindBy(xpath = "//*[@id='birthDay']")
    public WebElement dateOfBirth_Box_Register;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssn_Box_Register;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username_Box_Register;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password_Box_Register;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement register_Button_Register;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement alert_Register;
    //Toastify__toast-body
    @FindBy(xpath = "//div[@class='mb-4 fw-semibold shadow-sm bg-body-tertiary card-title h5']")
    public WebElement register_Text_Register;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement required_Text_Name_Register;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement required_Text_Surname_Register;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement required_Text_BirthPlace_Register;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement required_Text_Phone_Register;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement required_Text_DateOfBirth_Register;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement required_Text_Ssn_Register;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement required_Text_UserName_Register;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement required_Text_Password_Register;


}
