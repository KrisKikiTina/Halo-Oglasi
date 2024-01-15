package Page;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiAktiviranNalog extends BaseTest {
public HaloOglasiAktiviranNalog(){
    PageFactory.initElements(driver, this);
}
@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/div/div/div/div/div/div/div[2]/div/p/span")
    WebElement MessageActivation;
public boolean MessageActivationIsDisplayed(){
    wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div/div/div/div/div/div[2]/div/p/span")));
   return MessageActivation.isDisplayed();
}
public String MessageActivationGetText(){
    wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div/div/div/div/div/div[2]/div/p/span")));
    return MessageActivation.getText();
}

}
