package Page;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailinatorInobxPage extends BaseTest {
    public MailinatorInobxPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[3]/div/div[4]/div/div/table/tbody/tr/td[3]")
    WebElement MailClick;

    public void MailClick(){
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/main/div[2]/div[3]/div/div[4]/div/div/table/tbody/tr/td[3]")));
        MailClick.click();
    }
}
