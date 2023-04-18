package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Admin_ManagementPage {
    public Admin_ManagementPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menu_button_Admin_Management;

    @FindBy(xpath = "(//*[.='Main Menu'])[4]")
    public WebElement main_Menu_text_Admin_Management;

    @FindBy(xpath = "//*[.='Dean Management']")
    public WebElement dean_Management_button_Main_Menu;

}
