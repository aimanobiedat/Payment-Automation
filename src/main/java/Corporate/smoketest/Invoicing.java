package Corporate.smoketest;

import Corporate.Base;
import Corporate.pages.HomePage;
import org.testng.annotations.Test;

import static Corporate.smoketest.ComonTest.validLoginCorp;

public class Invoicing extends Base {
    @Test(description = "this to test open Invoicing  page ", priority = 1)
    public void OpenInvoicing() throws InterruptedException {
        validLoginCorp();
        Thread.sleep(1000);
        HomePage homePage = new HomePage(driver);
        homePage.InvoicingLink();
        Thread.sleep(1000);
    }
}