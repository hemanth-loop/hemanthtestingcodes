package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class CockpitHomePage extends Basepage {


    public CockpitHomePage(WebDriver driver) throws IOException {
        super(driver);
    }

    Properties prop = ConfigReader.initProperties();
    @FindBy(xpath = "//*[@name=\"email\"]")
    WebElement EmailField;
    @FindBy(xpath = "//*[@name=\"password\"]")
    WebElement PasswordField;
    @FindBy(xpath = "//*[@type=\"submit\"]")
    WebElement Login;

    @FindBy(xpath = "//*[@id=\"MinervaIoT_Logo\"]")
    WebElement MinervaIotLogo;

    @FindBy(xpath = "//*[contains(text(),\"Please enter your email address\")]")
    WebElement EmailErrorMessage;
    @FindBy(xpath = "//*[contains(text(),\"Please enter your Password\")]")
    WebElement PasswordErrorMessage;

    @FindBy(xpath = "//*[contains(text(),\"Invalid email format.\")]")
           WebElement InvalidEmail;

    @FindBy(xpath = "//*[contains(text(),\"Incorrect Username or Password.\")]")
    WebElement userNameorPasswordisIncorrect;

  @FindBy(xpath = "//*[contains(text(),\"User does not exist.\")]")
  WebElement userDoesNotExist;


  @FindBy(xpath = "//*[@id=\"Application value\"]")
  WebElement applicationcountindashboard;

  @FindBy(xpath = "//*[@data-testid=\"CloseIcon\"]")
  WebElement closeicon;


    public void loginToCockpit() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(EmailField));
        EmailField.click();
        EmailField.sendKeys(prop.getProperty("username"));
        PasswordField.sendKeys(prop.getProperty("password"));
        Login.click();
        wait.until(ExpectedConditions.visibilityOf(getCloseicon()));
        getCloseicon().click();
    }

    public WebElement getMinervaIotLogo() {
        return MinervaIotLogo;
    }

    public WebElement clickOnLogin() {
        return Login;
    }

    public WebElement getEmailErrorMessage() {
        return EmailErrorMessage;
    }

    public WebElement getPasswordErrorMessage() {
        return PasswordErrorMessage;
    }

    public void passEmailAndPassword(String ivlaidemail) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(EmailField));
        EmailField.click();
        EmailField.sendKeys(ivlaidemail);
        PasswordField.sendKeys(prop.getProperty("invalidpassword"));
    }

    public WebElement getInvalidEmail(){
        return InvalidEmail;
    }

    public void clearEmailfield() throws InterruptedException {
        EmailField.click();
        EmailField.sendKeys(Keys.CONTROL +"a");
        EmailField.sendKeys(Keys.DELETE);
        Thread.sleep(2000);
    }
    public WebElement getuserNameorPasswordisIncorrect(){
        return userNameorPasswordisIncorrect;
    }
    public WebElement getUserDoesNotExist(){
        return userDoesNotExist;
    }
    public WebElement getApplicationcountindashboard(){
        return applicationcountindashboard;
    }

    public WebElement getCloseicon(){
        return closeicon;
    }
}

