package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanLessonPage {
    public ViceDeanLessonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='controlled-tab-example-tab-lessonsList']")
    public WebElement lessons;


    @FindBy(xpath = "//*[@id='lessonName']")
    public WebElement lessonName;

    @FindBy(xpath = "//*[@id='compulsory']")
    public WebElement compulsory;

    @FindBy(xpath = "//*[@id='creditScore']")
    public WebElement creditScore;

    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement lessonSubmit;

    @FindBy(xpath = "(//*[@class='fa-solid fa-trash']")
    public WebElement lessonAdd;

    @FindBy(xpath = "(//*[@class='fa-solid fa-trash']")
    public WebElement lessonDelete;




}
