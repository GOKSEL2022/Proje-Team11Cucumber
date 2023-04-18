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

    @FindBy(xpath = "(//a[normalize-space()='Lesson Management']")
    public WebElement lessonManagament;
}
