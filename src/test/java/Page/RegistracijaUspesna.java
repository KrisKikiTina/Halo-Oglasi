package Page;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistracijaUspesna extends BaseTest {
    public RegistracijaUspesna(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/div/div/div/form/div/div[2]/div/p[1]/span")
    WebElement MessageSuccessRegistration;
    public boolean MessageSuccessRegistrationIsDisplayed(){
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div/div/form/div/div[2]/div/p[1]/span")));
        return MessageSuccessRegistration.isDisplayed();
    }
    public String MessageSuccessRegistrationGetText(){
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div/div/form/div/div[2]/div/p[1]/span")));
//                                                                                        /html/body/div[3]/div[3]/div/div[2]/div/div/div/form/div/div[2]/div/p[1]/span
        return MessageSuccessRegistration.getText();
    }
}
