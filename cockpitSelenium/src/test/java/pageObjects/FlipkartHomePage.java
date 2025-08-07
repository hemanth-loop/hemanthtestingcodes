package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class FlipkartHomePage extends Basepage {

    public FlipkartHomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(name = "q")
    WebElement Search;
    @FindBy(xpath = "//*[text()=\"Apple iPhone 15 (Blue, 128 GB)\"]")
    WebElement Iphone;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement SearchIcon;
    @FindBy(xpath = "//*[@class=\"QqFHMw vslbG+ In9uk2\"]")
    WebElement AddToCart;
    @FindBy(xpath = "//*[contains(text(),'Product is now out of stock')]")
    WebElement OutOfCart;
    @FindBy(xpath = "//*[contains(text(),'Place Order')]")
    WebElement PlaceOrder;

    @FindBy(xpath = "(//*[@class=\"KzDlHZ\"])[1]")
    WebElement SearchFirstData;


    public void ClickOnSearch() throws InterruptedException {
        Search.click();
    }

    public void SearchForIphone(String phone) throws InterruptedException {
        Search.sendKeys(phone);
        SearchIcon.click();
    }

    public void AddIphoneToCart() throws InterruptedException {

        SearchFirstData.click();
        Thread.sleep(2000);

        String anotherwindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(anotherwindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        AddToCart.click();

        try {
            if (OutOfCart.isDisplayed())
                System.out.println(OutOfCart.getText());
        } catch (Exception e) {
            System.out.println("the exceptions "+e.toString());
        }

        try {
              if (PlaceOrder.isDisplayed())
                System.out.println("Product successfully added to cart. Ready to place order.");
        } catch (Exception f){
            System.out.println(f.getMessage());
        }

    }
        public void SearchForData (String products) throws InterruptedException {
            Search.sendKeys(products);
            SearchIcon.click();
        }
    }

