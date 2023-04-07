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

}
