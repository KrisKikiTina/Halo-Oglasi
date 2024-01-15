package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseMailinatorTest {
    public static WebDriver driver=new ChromeDriver();
    public static WebDriverWait wdwait;
    @Before
    public void SetUpMailinator(){
        wdwait=new WebDriverWait(driver, 30);
        WebDriverManager.chromedriver().setup();
        driver.manage().window();

    }
}
