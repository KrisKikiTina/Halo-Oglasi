package Page;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiRegistration extends BaseTest {
    public HaloOglasiRegistration(){
        PageFactory.initElements(driver, this);}
    @FindBy(id = "UserName")
    WebElement ImeInputField;
    @FindBy(id="Email")
    WebElement EmailInputField;
    @FindBy(id="Password")
    WebElement PasswordInputField;
    @FindBy(id="ConfirmPassword")
    WebElement PasswordConfirmation;
    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/div/div/div/form/div/div[2]/div/div/div[9]/div/button[1]")
    WebElement RegistracijaButton;
    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/div/div/div/form/div/div[2]/div/div/div[8]/div/label")
    WebElement RacuniSelect;
     public void ImeInputField(String ime){
         wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("UserName")));
         ImeInputField.clear();
         ImeInputField.sendKeys(ime);
     }
     public void EmailInputField(String email){
         wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("Email")));
         EmailInputField.clear();
         EmailInputField.sendKeys(email);
     }
     public void PasswordInputField(String password){
         wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("Password")));
         PasswordInputField.clear();
         PasswordInputField.sendKeys(password);
     }
     public void PasswordConfirmation(String passwordConfirmation){
         wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("ConfirmPassword")));
         PasswordConfirmation.clear();
         PasswordConfirmation.sendKeys(passwordConfirmation);
     }
     public void RegistracijaButton(){
         wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div/div/form/div/div[2]/div/div/div[9]/div/button[1]")));
         RegistracijaButton.click();
     }
     public void RacuniSelect(){
         wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div/div/form/div/div[2]/div/div/div[8]/div/label")));
         RacuniSelect.click();
     }


}
