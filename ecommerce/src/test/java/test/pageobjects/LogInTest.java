package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.LogIn;

public class LogInTest extends LogIn {
    LogIn objOfLogIn = null;

    @BeforeMethod
    public void initializationOfElements() {

        objOfLogIn = PageFactory.initElements(driver, LogIn.class);
    }

    @Test(priority = 3)
    public void LogInTest() throws InterruptedException {
        objOfLogIn.LogIn();
        System.out.println("LoginPage - Test Passed");
    }

}

