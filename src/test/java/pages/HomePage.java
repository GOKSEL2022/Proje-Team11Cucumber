package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement login_Button_Home;

    @FindBy(xpath = "//a[@href='/register']")
    public WebElement register_Button_Home;

    @FindBy(xpath = "//*[text()='Home']") public WebElement Home_isDisplayed;



}
