package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeanPage {

    public DeanPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[.='Menu']")
    public WebElement menu_button;

    @FindBy(xpath = "//*[.='Contact Get All']")
    public WebElement contact_getAll_button;

    @FindBy(xpath = "//*[.='Contact Message']")
    public WebElement contact_message_header;

//    @FindBy(xpath = "//*[.='Name']")
//    public WebElement name_column;

    @FindBy(xpath = "(//tr/th)[1]")
    public WebElement name_column_2;

    @FindBy(xpath = "//*[.='Email']")
    public WebElement email_column;

//    @FindBy(xpath = "//*[.='Date']")
//    public WebElement date_column;

    @FindBy(xpath = "(//tr/th)[3]")
    public WebElement date_column_2;

    @FindBy(xpath = "//*[.='Subject']")
    public WebElement subject_column;

    @FindBy(xpath = "//*[.='Message']")
    public WebElement message_column;


}

