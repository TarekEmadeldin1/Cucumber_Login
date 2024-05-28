package Inherit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {


    private WebElement EmailElement ;
    private By EmailAddres = By.id("user-name");
    private WebElement PassElement ;
    private By PassAddress = By.id("password");
    private WebElement LoginElement ;
    private By LoginAddress = By.id("login-button");

    protected WebDriver driver;
    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void Email(String text){
        EmailElement = driver.findElement(EmailAddres);
        EmailElement.sendKeys(text);
    }

    public void Password(String text){
        PassElement = driver.findElement(PassAddress);
        PassElement.sendKeys(text);
    }

    public void Login(){
        LoginElement = driver.findElement(LoginAddress);
        LoginElement.click();
    }



}
