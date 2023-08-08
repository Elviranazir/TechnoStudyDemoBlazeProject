package Tests;

import Utilities.NewDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {

    public Elements() {
        PageFactory.initElements(NewDriver.driver, this);
    }

    @FindBy(xpath = "//a[.='Sign up']")
    public WebElement signUp;

    @FindBy(id = "sign-username")
    public WebElement signUpUsername;

    @FindBy(id = "sign-password")
    public WebElement signUpPassword;

    @FindBy(xpath = "//button[.='Sign up']")
    public WebElement signUpButton;

    @FindBy(id = "login2")
    public WebElement login;

    @FindBy(id = "loginusername")
    public WebElement loginUsername;

    @FindBy(id = "loginpassword")
    public WebElement loginPassword;
    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;


    @FindBy(xpath = "//a[text()='Phones']")
    public WebElement phones;

//    @FindBy(xpath = "//a[.='Laptops']")
//    public WebElement laptops;
//
//    @FindBy(xpath = "//a[.='Monitors']")
//    public WebElement monitors;
//
//    @FindBy(id = "logout2")
//    public WebElement logout;
//
//    @FindBy(xpath = "//a[.='Samsung galaxy s6']")
//    public WebElement samsungGalaxy;
//
//    @FindBy(xpath = "//a[.='Add to cart']")
//    public WebElement addProduct;
//
//    @FindBy(xpath = "//*[@id=\"navbarExample\"]/ul/li[1]/a")
//    public WebElement home;
//
//    @FindBy(id = "cartur")
//    public WebElement cart;
//
//    @FindBy(xpath = "//button[.='Place Order']")
//    public WebElement placeOrder;

}
