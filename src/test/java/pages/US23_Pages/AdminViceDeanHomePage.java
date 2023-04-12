package pages.US23_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminViceDeanHomePage {
    AdminViceDeanHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[.='Menu']")
    public WebElement Admin_Vice_Dean_Menu;

    @FindBy(xpath = "//a[.='Vice Dean Management']")
    public WebElement Admin_Vice_Dean_Button;






}
