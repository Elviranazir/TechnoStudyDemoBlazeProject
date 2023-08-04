import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Base64;

public class SignUp extends NewDriver {
    @Test
    public void signUpTest(){
        driver.get("https://www.demoblaze.com/index.html");
        Precondition precondition = new Precondition();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(precondition.signUp));
        precondition.signUp.click();

       WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
        precondition.signUpUsername.sendKeys("technoStudyyGroup6");
        precondition.signUpPassword.sendKeys("group6");
        WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
        precondition.signUpButton.click();
    }
}
