package Page;

import Base.BaseMailinatorTest;
import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailinatorPage extends BaseTest {
    public MailinatorPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="/html/body/div[1]/header[1]/div[1]/div/div/div[2]/div/a")
    WebElement Inbox;
    @FindBy(id="inbox_field")
            WebElement EmailInputField;
    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div[5]/button")
    WebElement GoButton;


    public void Inbox(){
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/header[1]/div[1]/div/div/div[2]/div/a")));
        Inbox.click();
    }
    public void EmailInputField(String email){
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("inbox_field")));
        EmailInputField.clear();
        EmailInputField.sendKeys(email);
    }
    public void GoButton(){
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/main/div[2]/div[1]/div[5]/button")));
        GoButton.click();
    }


}
