package Page;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiLogIn extends BaseTest {
    public HaloOglasiLogIn(){
        PageFactory.initElements(driver, this);}
        @FindBy(xpath = "/html/body/div[3]/div[4]/div/div/div/div[1]/form/div[8]/div/div/a")
        WebElement RegistracijaButton;

    public void RegistracijaButton(){
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[4]/div/div/div/div[1]/form/div[8]/div/div/a")));
        RegistracijaButton.click();
    }
}
