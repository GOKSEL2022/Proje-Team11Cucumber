package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactPage {


    public ContactPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[.='Contact']")
    public WebElement contact_Button;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement yourEmail_textBox;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement yourName_textBox;

    @FindBy(xpath = "//*[@id='subject']")
    public WebElement subject_textBox;

    @FindBy(xpath = "//*[@id='message']")
    public WebElement message_textBox;

    @FindBy(xpath = "//*[.='Send Message']")
    public WebElement sendMessage_Button;

    @FindBy(xpath = "//div[contains(text(),'Contact Message Created Successfully')]")
    public WebElement successfully_alert;

    @FindBy(css = "div[role='alert'] div:nth-child(2)")
    public WebElement successfully_alert_css;

    @FindBy(xpath = "//div[contains(text(),'Please enter valid email')]")
    public WebElement mail_alert;

    @FindBy(xpath = "//div[contains(text(),'boyut ')]")
    public WebElement size_alert;






}
