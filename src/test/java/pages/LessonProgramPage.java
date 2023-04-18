package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class LessonProgramPage {

    @FindBy(xpath = "//h3[contains(text(),'Education')]")
    public WebElement educationTermManagementHeader;
    @FindBy(xpath = "//ul[@role='tablist']//li")
    public List<WebElement> allTabs;
    @FindBy(xpath = "//label[contains(text(),'Choose Lessons')]")
    public WebElement chooseLessonsHeader;
    @FindBy(xpath = "//div[contains(text(),'Select')]")
    public WebElement chooseLessonsPlaceHolder;
    @FindBy(xpath = "//div[@class=' css-13cymwt-control']")
    public WebElement chooseLessonsSelectBox;

    @FindBy(xpath = "//h3[contains(text(),'Lesson P')]")
    public WebElement lessonProgramManagementHeader;

    @FindBy(xpath = "//h5[contains(text(),'Add Lesson Program')]")
    public WebElement addLessonProgramHeader;

    @FindBy(xpath = "//*[@class=' css-v7duua']")
    public WebElement carpiIsareti;

    @FindBy(xpath = "//div[contains(text(),'Bos ders')]")
    public WebElement bosDersDersi;

    @FindBy(id = "educationTermId")
    public WebElement chooseEducationTerm;

    @FindBy(id = "day")
    public WebElement chooseDay;

    @FindBy(id = "startTime")
    public WebElement startTime;

    @FindBy(xpath = "//h5[contains(text(),'Lesson Program List')]")
    public WebElement lessonProgramListElement;
  @FindBy(xpath = "(//th[contains(text(),'Lesson')])[2]")
    public WebElement lessonProgramListLesson;

  @FindBy(xpath = "(//th[contains(text(),'Day')])[1]")
    public WebElement lessonProgramListDay;

  @FindBy(xpath = "(//th[contains(text(),'Start Time')])[1]")
    public WebElement lessonProgramListStartTime;
  @FindBy(xpath = "(//th[contains(text(),'Stop Time')])[1]")
    public WebElement lessonProgramListStopTime;
  @FindBy(xpath = "(//span[contains(text(),'Functional Analysis')])[2]")
    public WebElement functional;
  @FindBy(xpath = "(//span[contains(text(),'MONDAY')])[1]")
    public WebElement gunMonday;
  @FindBy(xpath = "(//span[contains(text(),'14:00')])[1]")
    public WebElement baslamaSaati;
  @FindBy(xpath = "(//span[contains(text(),'15:00')])[1]")
    public WebElement bitisSaati;


  @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[3]")
    public WebElement button1;
  @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[4]")
    public WebElement button2;

    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover'])[4]/tbody/tr/td[2]/span")
    public List<WebElement> assigmentlesson;

//  (//table[@class='table table-striped table-bordered table-hover'])[4]/tbody/tr/td[2]/span

    @FindBy(id = "lessonProgramId")
    public List<WebElement> lessonCheckBoxButton;

@FindBy(id = "teacherId")
  public   WebElement teacherId;








    public LessonProgramPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
