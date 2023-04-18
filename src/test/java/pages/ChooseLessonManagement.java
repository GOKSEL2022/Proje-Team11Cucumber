package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ChooseLessonManagement {
    public ChooseLessonManagement() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

   // @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler']")
  //  public WebElement menu_button;

    @FindBy(xpath = "(//*[text()='Choose Lesson'])[3]")
    public WebElement choose_lesson;

    @FindBy(xpath = "(//*[text()='Day'])[1]")
    public WebElement day_dogrulama;

    @FindBy(xpath = "(//*[text()='Teacher'])[1]")
    public WebElement teacher_dogrulama;

    @FindBy(xpath = "(//*[@id='lessonProgramId'])[1]")
    public WebElement kutucuk;

    @FindBy(xpath = " (//*[@type='checkbox'])[11]")
    public WebElement kutucuk11;

    @FindBy(xpath = " (//*[@type='checkbox'])[13]")
    public WebElement kutucuk13;

    @FindBy(xpath = " (//*[@type='checkbox'])[15]")
    public WebElement kutucuk15;

    @FindBy(xpath = " //*[text()='Error: Course schedule cannot be selected for the same hour and day']")
    public WebElement eror_yazisi;

    @FindBy(xpath = " //*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submit_button;

    @FindBy(xpath = " (//*[text()='cografya'])[2]")
    public WebElement program_list;

    @FindBy(xpath = " //*[text()='Midterm Exam']")
    public WebElement midterm_exam_dogrulama;

    @FindBy(xpath = " //*[text()='kalem']")
    public WebElement kalem_exam_dogrulama;

    @FindBy(xpath = " //*[text()='veli görüsme']")
    public WebElement danisman_dogrulama;

    @FindBy(xpath = " //*[text()='Grades and Announcements'] ")
    public WebElement grades_and_announcements;

}
