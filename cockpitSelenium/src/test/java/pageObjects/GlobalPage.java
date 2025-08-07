package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class GlobalPage extends Basepage{
    public GlobalPage(WebDriver driver) throws IOException {
        super(driver);
    }


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Properties prop = ConfigReader.initProperties();

    @FindBy(xpath = "//p[contains(text(), \"Tenants\")]/preceding-sibling::p[1]")
    WebElement tenantsInGlobalpage;

    @FindBy(xpath = "//p[contains(text(), \"Users\")]/preceding-sibling::p[1]")
    WebElement usersInGlobalpage;
    public String getTenantsInGlobalpage(){
        wait.until(ExpectedConditions.visibilityOf(tenantsInGlobalpage));
        return tenantsInGlobalpage.getText();
    }
    public String getUsersInGlobalpage(){
        wait.until(ExpectedConditions.visibilityOf(usersInGlobalpage));
        return usersInGlobalpage.getText();
    }
}
