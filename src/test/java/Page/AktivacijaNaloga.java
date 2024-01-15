package Page;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AktivacijaNaloga extends BaseTest {
    public AktivacijaNaloga() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "html_msg_body")
    WebElement IFrameBody;
    @FindBy(xpath = "/html/body/div/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/a")
    WebElement AktivacijaNaloga;

    public void SwitchIFrameBody() {
        driver.switchTo().frame(IFrameBody);
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/a")));
        driver.get(AktivacijaNaloga.getAttribute("href"));
        driver.switchTo().defaultContent();
    }
}
