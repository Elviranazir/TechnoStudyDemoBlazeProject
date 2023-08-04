import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCase1_NavigateToWebsite extends NewDriver {
   @Test(priority = 1)
   public void testLogin() {
        driver.get("https://www.demoblaze.com/index.html");
        Precondition precondition = new Precondition();
        precondition.login.click();
        precondition.loginUsername.sendKeys("technoStudyyGroup6");
        precondition.loginPassword.sendKeys("group6");
        precondition.loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        precondition.phones.click();



//        Assert.assertTrue(precondition.addProduct.isDisplayed(), "Test Failed");
//        driver.navigate().back();
//        precondition.laptops.click();
//        Assert.assertTrue(precondition.addProduct.isDisplayed(), "Test Failed");
//        precondition.monitors.click();
//

    }


}
