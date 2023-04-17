package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminManagementPage {
    public AdminManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[@aria-controls='offcanvasNavbar-expand-false']")
    public WebElement menu_button_adminmanagement;

    @FindBy(xpath = "//*[.='Teacher Management']")
    public WebElement teachermanagement_button_adminmanagement;
    @FindBy(xpath = "//*[.='Logout']")
    public WebElement logout_button_adminmanagement;

    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menu_Button_Menu;

    @FindBy(xpath = "(//div[@id='offcanvasNavbarLabel-expand-lg'])[2]")
    public WebElement main_Menu_Text_Menu;

    @FindBy(xpath = "(//a[@class='nav-link'])[16]")
    public WebElement guest_User_Button_Menu;

    @FindBy(xpath = "//*[@class='fw-bold p-3 card-header']")
    public WebElement guest_User_List_Text_Guest_User;
}
