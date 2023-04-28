package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditDeanPage {

    public EditDeanPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@type='button'])[6]")
    public WebElement edit_Button_Team_Hasan;

    @FindBy(xpath = "(//*[.='Edit Dean'])[2]")
    public WebElement text_Edit_Dean;

    @FindBy(xpath = "(//*[@type='text'])[7]")
    public WebElement name_Edit_Dean;

    @FindBy(xpath = "(//*[@id='surname'])[2]")
    public WebElement surname_Edit_Dean;

    @FindBy(xpath = "(//*[@id='birthPlace'])[2]")
    public WebElement birthPlace_Edit_Dean;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement phoneNumber_Edit_Dean;

    @FindBy(xpath = "(//*[@class='form-check-input'])[3]")
    public WebElement female_Checkbox_Edit_Dean;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement male_Checkbox_Edit_Dean;

    @FindBy(xpath = "//*[@id='birthDay']")
    public WebElement dateOfBirth_Edit_Dean;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssn_Edit_Dean;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username_Edit_Dean;

    @FindBy(xpath = "(//*[@id='password'])[2]")
    public WebElement password_Edit_Dean;

    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement submit_Button_Edit_Dean;

    @FindBy(xpath = "/html/body/div[3]/div[1]/button")
    public WebElement close_editDeanKapatma_x_Button;

    @FindBy(xpath = "(//*[.='Name'])[2]")
    public WebElement header_Name_Surname;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/thead/tr/th[2]")
    public WebElement header_Gender;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/thead/tr/th[3]")
    public WebElement header_Phone_Number;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/thead/tr/th[4]")
    public WebElement header_Ssn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/thead/tr/th[5]")
    public WebElement header_User_Name;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[9]")
    public WebElement Required_edit_Dean_Name;

    @FindBy(xpath = "(//*[.='Required'])[7]")
    public WebElement Required_edit_Dean_Surname;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div/form/div/div[3]/div/div")
    public WebElement Required_edit_Dean_BirthPlace;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[12]")
    public WebElement Required_edit_Dean_DateOfBirth;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[13]")
    public WebElement Required_edit_Dean_Phone;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[14]")
    public WebElement Required_edit_Dean_Ssn;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[15]")
    public WebElement Required_edit_Dean_UserName;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[16]")
    public WebElement Required_edit_Dean_Password;

    @FindBy(xpath = "(//*[.='Dean updated Successful'])[9]")
    public WebElement dean_Saved_message_name_Edit_Dean;

    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']")
    public WebElement dean_Saved_message_Surname_Edit_Dean;

    @FindBy(xpath = " (//*[@id='2'])[2]")
    public WebElement dean_Saved_message_Birth_Place_Edit_Dean;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement json_parse_error_message_Edit_Dean;

    @FindBy(xpath = "//div[@id='7']")
    public WebElement dean_Saved_message_female_Edit_Dean;

    @FindBy(xpath = "//div[@id='8']")
    public WebElement dean_Saved_message_male_Edit_Dean;

    @FindBy(xpath = "(//*[.='Full authentication is required to access this resource'])[3]")
    public WebElement Full_authentication_is_RequiredToAccessThisResource_message_Edit_Dean;


    @FindBy(xpath = " ")
    public WebElement delete_Buton;








}
