package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username_Box_Login;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password_Box_Login;


    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement login_Button_Login;




}
















