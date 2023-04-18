package pages.US06_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DeanViceDeanPage {
    public DeanViceDeanPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//h3[.='Vice Dean Management']")
    public WebElement Admin_Vice_Dean_Text;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement Admin_Vice_Dean_Name;

    @FindBy(xpath = "//input[@id='surname']")
    public WebElement Admin_Vice_Dean_Surname;

    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement Admin_Vice_Dean_BirthPlace;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement Admin_Vice_Dean_Female_Radio_Button;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement Admin_Vice_Dean_Male_Radio_Button;

    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement Admin_Vice_Dean_Date_Of_Birth;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement Admin_Vice_Dean_PhoneNumber;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement Admin_Vice_Dean_Ssn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement Admin_Vice_Dean_Username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement Admin_Vice_Dean_Password;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement Admin_Vice_Dean_Submit_Button;

    @FindBy(xpath = "//*[.='Vice dean Saved']")
    public WebElement Admin_Vice_Dean_Vice_dean_Saved;


    @FindBy(xpath = "(//*[.='Required'])[1]")
    public WebElement Admin_Vice_Dean_Name_Error_Message;

    @FindBy(xpath = "(//*[.='Required'])[2]")
    public WebElement Admin_Vice_Dean_Surname_Error_Message;

    @FindBy(xpath = "(//*[.='Required'])[3]")
    public WebElement Admin_Vice_Dean_BirthPlace_Error_Message;

    @FindBy(xpath = "(//*[.='Required'])[4]")
    public WebElement Admin_Vice_Dean_BirthDay_Error_Message;

    @FindBy(xpath = "(//*[.='Required'])[5]")
    public WebElement Admin_Vice_Dean_PhoneNumber_Error_Message;

    @FindBy(xpath = "(//*[.='Required'])[6]")
    public WebElement Admin_Vice_Dean_Ssn_Error_Message;

    @FindBy(xpath = "(//*[.='Required'])[7]")
    public WebElement Admin_Vice_Dean_Username_Error_Message;

    @FindBy(xpath = "(//*[.='Required'])[8]")
    public WebElement Admin_Vice_Dean_Password_Error_Message;

    @FindBy(xpath = "//*[.='Required']")
    public List<WebElement> requiredAbsente_text_studentInfo;
}
