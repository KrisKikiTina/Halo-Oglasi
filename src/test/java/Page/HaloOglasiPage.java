package Page;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiPage extends BaseTest {
    public HaloOglasiPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/p")
    WebElement CoockiesButton;
    @FindBy(xpath = "/html/body/div[3]/header/div[1]/div[5]/div/section/div[2]/div[3]/a")
    WebElement LogInButton;

    public void CoockiesButton(){
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/p")));
        CoockiesButton.click();
    }
    public void LogInButton(){
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/header/div[1]/div[5]/div/section/div[2]/div[3]/a")));
        LogInButton.click();
    }

}
