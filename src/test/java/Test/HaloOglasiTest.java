package Test;

import Base.BaseTest;
import Page.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HaloOglasiTest extends BaseTest {
    MailinatorPage KlasaGdeSuMetode;
    HaloOglasiPage KlasaGdeSuMetode1;
    HaloOglasiLogIn KlasaGdeSuMetode2;
    HaloOglasiRegistration KlasaGdeSuMetode3;
    RegistracijaUspesna KlasaGdeSuMetode4;
    MailinatorInobxPage KlasaGdeSuMetode5;
    AktivacijaNaloga KlasaGdeSuMetode6;
    HaloOglasiAktiviranNalog KlasaGdeSuMetode7;

    @Before
    public void SetUpPage(){
        KlasaGdeSuMetode1=new HaloOglasiPage();
        KlasaGdeSuMetode2=new HaloOglasiLogIn();
        KlasaGdeSuMetode3=new HaloOglasiRegistration();
        KlasaGdeSuMetode4=new RegistracijaUspesna();
        KlasaGdeSuMetode = new MailinatorPage();
        KlasaGdeSuMetode5=new MailinatorInobxPage();
        KlasaGdeSuMetode6=new AktivacijaNaloga();
        KlasaGdeSuMetode7=new HaloOglasiAktiviranNalog();

    }
    @Test
    public void HaloOglasiTestRegistration(){

//        KlasaGdeSuMetode1.CoockiesButton();
//        KlasaGdeSuMetode1.LogInButton();
//        KlasaGdeSuMetode2.RegistracijaButton();
//        KlasaGdeSuMetode3.ImeInputField("KristinaSplinter1122333");
//        KlasaGdeSuMetode3.EmailInputField("kristinablazic1234@mailinator.com");
//        KlasaGdeSuMetode3.PasswordInputField("Tina1234");
//        KlasaGdeSuMetode3.PasswordConfirmation("Tina1234");
//        KlasaGdeSuMetode3.RacuniSelect();
//        KlasaGdeSuMetode3.RegistracijaButton();
//        Assert.assertTrue(KlasaGdeSuMetode4.MessageSuccessRegistrationIsDisplayed());
//        Assert.assertEquals("Registracija je uspela!", KlasaGdeSuMetode4.MessageSuccessRegistrationGetText());
        driver.get("https://www.mailinator.com/");
        KlasaGdeSuMetode.Inbox();
        KlasaGdeSuMetode.EmailInputField("kristinablazic1234@mailinator.com");
        KlasaGdeSuMetode.GoButton();
        KlasaGdeSuMetode5.MailClick();
        KlasaGdeSuMetode6.SwitchIFrameBody();
        Assert.assertTrue(KlasaGdeSuMetode7.MessageActivationIsDisplayed());
        Assert.assertEquals("Vaš nalog je uspešno aktiviran!", KlasaGdeSuMetode7.MessageActivationGetText());

    }
}
