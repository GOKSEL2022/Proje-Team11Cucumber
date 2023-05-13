package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminViceDeanPage {
    public AdminViceDeanPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[.='Vice Dean Management'])[2]")
    public WebElement Admin_Vice_Dean_Text;

    @FindBy(xpath = "(//*[.='Admin Management'])[2]")
    public WebElement Admin_Vice_Dean_Admin_Management_Text;

    @FindBy(xpath = "//*[.='Menu']")
    public WebElement Admin_Vice_Dean_Menu_Button;

    @FindBy(xpath = "(//*[@id='offcanvasNavbarLabel-expand-lg'])[2]")
    public WebElement Admin_Vice_Dean_Main_Menu_Text;

    @FindBy(xpath = "//*[.='Vice Dean Management']")
    public WebElement Admin_Vice_Dean_Management_Button;
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
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement Admin_Vice_Dean_Name_Error_Message;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement Admin_Vice_Dean_Surname_Error_Message;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement Admin_Vice_Dean_BirthPlace_Error_Message;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement Admin_Vice_Dean_Date_Of_Birth_Error_Message;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement Admin_Vice_Dean_PhoneNumber_Error_Message;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement Admin_Vice_Dean_Ssn_Error_Message;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement Admin_Vice_Dean_Username_Error_Message;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement Admin_Vice_Dean_Password_Error_Message;

    @FindBy(xpath = "//*[.='Required']")
    public List<WebElement> requiredAbsente_text_studentInfo;
}
