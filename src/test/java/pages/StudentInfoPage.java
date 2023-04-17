package pages;


import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;


public class StudentInfoPage {
    public StudentInfoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[.='Student Info List']")
    public WebElement studentInfoList_text_studentInfo;
    @FindBy(id = "lessonId")
    public WebElement chooseLesson_dropDown_studentInfo;
    @FindBy(xpath = "(//option[@value='5'])[1]")
    public WebElement chooseLesson_text_studentInfo;
    @FindBy(xpath= "//select[@id='studentId']")
    public WebElement chooseStudent_dropDown_studentInfo;
    @FindBy(xpath = "//select[@id='educationTermId']")
    public WebElement educationTerm_dropDown_studentInfo;
    @FindBy(xpath = "//input[@id='absentee']")
    public WebElement absentee_box_studentInfo;
    @FindBy(xpath = "//*[.='Required']")
    public List<WebElement> requiredAbsente_text_studentInfo;
    @FindBy(xpath = "//*[@id='midtermExam']")
    public WebElement midtermExam_box_studentInfo;
    @FindBy(xpath = "(//*[.='Required'])[2]")
    public WebElement requiredMidterm_text_studentInfo;
    @FindBy(xpath = "//*[@id='finalExam']")
    public WebElement finalExam_box_studentInfo;
    @FindBy(xpath = "(//*[.='Required'])[3]")
    public WebElement requiredFinal_text_studentInfo;
    @FindBy(xpath = "//*[@id='infoNote']")
    public WebElement infoNote_box_studentInfo;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[4]")
    public WebElement requiredinfoNote_text_studentInfo;
    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submit_button_studentInfo;
    @FindBy(xpath = "(//div[@id='4'])[1]")
    public WebElement studentSaved_alert_studentInfo;
    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[1]")  //button[@class='text-dark btn btn-outline-info']
    public WebElement edit_button_studentInfo;
    @FindBy(xpath = "//div[@class='mt-2 col-md-auto']//select[@id='lessonId']")
    public WebElement edit_chooseLesson_studentInfo;
    @FindBy(xpath = "//div[@class='mt-2 col-md-auto']//select[@id='educationTermId']")
    public WebElement edit_educationTerm_studentInfo;
    @FindBy(xpath = "//div[@role='dialog']//input[@placeholder='Midterm Exam']")
    public WebElement edit_midtermExam_studentInfo;
    @FindBy(xpath = "//div[contains(@class,'mx-auto ps-3 pt-3 col')]//div//button[contains(@type,'button')][normalize-space()='Submit']")
    public WebElement edit_submitButton_studentInfo;
    @FindBy(xpath = "(//i[@class='fa-solid fa-trash'])[1]")
    public WebElement deleteButton_studentInfo;
@FindBy(xpath = "(//*[text()='Student Info deleted Successfully'])[1]")
    public WebElement delete_alert_text_studentInfo;


}
