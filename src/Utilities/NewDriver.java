package Utilities;

import Tests.Elements;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NewDriver {
public static  WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void createDriver() {
        closePreviousDrivers();
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        Duration duration = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(duration);
        driver.manage().timeouts().implicitlyWait(duration);
    }

    @AfterClass(alwaysRun = true)
    public void quitDriver() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    public void closePreviousDrivers() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void login(String usernameParameter, String passwordparameter){
        driver.get("https://www.demoblaze.com/index.html");
        Actions actions = new Actions(driver);
        WebElement login = driver.findElement(By.id("login2"));
        login.click();
        Elements elements = new Elements();
        elements.loginUsername.sendKeys(usernameParameter);
        elements.loginPassword.sendKeys(passwordparameter);
        elements.loginButton.click();
        WebElement successMessage = driver.findElement(By.xpath("//a[.='Log out']"));

//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOf(successMessage));
//        Assert.assertTrue(successMessage.getText().contains("Log out"), "Test Failed!");
    }
}
