package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainMenuPage {
    public MainMenuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[.='Menu']")
    public WebElement menu_button;

    @FindBy(xpath = "//a[text()='Meet Management']")
    public WebElement meet_management_button;

    @FindBy(xpath = "//*[@class=' css-qbdosj-Input']")
    public WebElement choose_students;

    @FindBy(xpath = "(//*[.='Huseyin Kemal Bulat'])[1]")
    public WebElement student_dogrulama;

    @FindBy(xpath = "//input[@id='date']")
    public WebElement date_of_meet;

    @FindBy(xpath = "//*[@id='startTime']")
    public WebElement start_time;

    @FindBy(xpath = "//*[@id='stopTime']")
    public WebElement stop_time;

    @FindBy(xpath = "//*[@id='description']")
    public WebElement description;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement add_meet_submit;

   @FindBy(xpath = "//*[text()='ileri bir tarih olmalı']")
    public WebElement tarih_dogrulama;

   @FindBy(xpath = "//th[text()='Start Time']")
    public WebElement start_time_dogrulama;

   @FindBy(xpath = "//input[@id='description']")
    public WebElement description_dogrulama;
    @FindBy(xpath = "(//*[@id='description'])[2]")
    public WebElement edit_dogrulama;

    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[1]")
    public WebElement edit_button;

    @FindBy(xpath = "(//button[text()='Submit'])[2]")
    public WebElement edit_submit;

    @FindBy(xpath = "//*[text()='Meet Updated Successfully']")
    public WebElement Updated_Successfully;

    @FindBy(xpath = "(//*[@class='fa-solid fa-trash'])[3]")
    public WebElement sil_button;

}