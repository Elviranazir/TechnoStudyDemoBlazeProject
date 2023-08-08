package Tests;

import Utilities.NewDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase1 extends NewDriver {
    Elements elements = new Elements();
    @Test
    public void TestCase01 (){
       login("TechnoStudyGroup6", "group6");
      elements.phones.click();


    }


}
