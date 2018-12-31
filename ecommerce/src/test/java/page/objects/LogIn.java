package page.objects;

import base.BrowserDriver;
import org.openqa.selenium.By;

public class LogIn extends BrowserDriver {

    public void LogIn() throws InterruptedException {

        driver.findElement(By.partialLinkText("Log In")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("username")).sendKeys("shokat_hasan@yahoo.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("Test@1234");
        Thread.sleep(1000);
        driver.findElement(By.className("loginBtn")).click();
        Thread.sleep(1000);
    }
}
