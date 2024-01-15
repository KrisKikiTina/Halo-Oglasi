package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    public static WebDriver driver=new ChromeDriver();
    public static WebDriverWait wdwait;
    @Before
    public void SetUp(){
       wdwait=new WebDriverWait(driver, 30);
        WebDriverManager.chromedriver().setup();
        driver.manage().window();
        driver.get("https://www.halooglasi.com/" );
    }
    @After
    public void TearDown(){
        //driver.close();
        //driver.quit();
    }
}
