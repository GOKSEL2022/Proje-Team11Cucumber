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


    @FindBy(xpath = "(//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menuButton;



    @FindBy(xpath = "(//a[normalize-space()='Contact Get All']")
    public WebElement contactGetAll;

    @FindBy(xpath = "//th[normalize-space()='Message']")
    public WebElement contactMessage;

    @FindBy(xpath = "//th[normalize-space()='Name']")
    public WebElement contactName;

    @FindBy(xpath = "//th[normalize-space()='Email']")
    public WebElement contactEmail;

    @FindBy(xpath = "//th[normalize-space()='Date']")
    public WebElement contactDate;

    @FindBy(xpath = "//th[normalize-space()='Subject']")
    public WebElement contactSubject;


    @FindBy(xpath = "//*[text()='Home']") public WebElement Home_isDisplayed;



}
