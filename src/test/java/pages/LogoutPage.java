package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LogoutPage {
    public LogoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[.='Logout']")
    public WebElement logout_button_logout;
    @FindBy(xpath = "//button[text()='Yes']")
    public WebElement yes_button_logout;
}
