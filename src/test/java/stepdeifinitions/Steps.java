package stepdeifinitions;

import Inherit.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Steps {

     protected WebDriver driver = new ChromeDriver();

     private Login login;

    @Given("user on login page")
    public void OpenBrowser() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @When("user enter (.*) and (.*)$")
    public void user_enters_email_and_password(String User , String Password){
        login = new Login(driver);
        login.Email(User);
        login.Password(Password);
        login.Login();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //throw new io.cucumber.java.PendingException();
    }

    @Then("Logged in Successfully")
    public void Logged_in_Successfully(){
        WebElement Check = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
        System.out.println(Check.isDisplayed());
        driver.close();
        driver.quit();
    }

    @Then("Logged in inSuccessfully")
    public void Logged_in_inSuccessfully(){
        String expected = "Epic sadface: Sorry, this user has been locked out.";
        String actual = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
        Assert.assertTrue(expected.contains(actual));
        driver.quit();
    }
}
