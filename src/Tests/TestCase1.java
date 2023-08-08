package Tests;

import Utilities.NewDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCase1 extends NewDriver {
 Elements elements = new Elements();
    @Test
    public void TestCase01 (){
       login("TechnoStudyGroup6", "group6");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
        wait.until(ExpectedConditions.elementToBeClickable((By.xpath( "//a[.='Laptops']"))));
        elements.phonesButton.click();
        Assert.assertTrue(elements.phoneCheck.getText().contains("galaxy s6"));

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//  driver.findElement(By.xpath( "//a[.='Laptops']")).click();



    }


}
