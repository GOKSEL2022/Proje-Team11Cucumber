package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuestUserPage {

    public GuestUserPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='fw-bold p-3 card-header']")
    public WebElement guest_User_List_Text_Guest_User;

    @FindBy(xpath = "//*[.='Name Surname']")
    public WebElement name_Surname_Text_Guest_User;

    @FindBy(xpath = "//*[.='Phone Number']")
    public WebElement phone_Number_Text_Guest_User;

    @FindBy(xpath = "//*[.='Ssn']")
    public WebElement ssn_Text_Guest_User;

    @FindBy(xpath = "//*[.='User Name']")
    public WebElement user_Name_Text_Guest_User;

    @FindBy(xpath = "(//*[@class='fa-solid fa-trash'])[1]")
    public WebElement first_Delete_Button_Guest_User;

    @FindBy(xpath = "//*[.=' Guest User deleted Successful']")
    public WebElement alert_Guest_User;

}
