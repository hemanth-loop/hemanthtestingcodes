package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.CockpitHomePage;
import pageObjects.FlipkartHomePage;
import pageObjects.GlobalPage;
import pageObjects.MainDashboardpage;
import utilities.ConfigReader;
import utilities.ReUseable;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;


import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class StepDefinition extends ReUseable {

    WebDriver driver;
    FlipkartHomePage flipkart;
    CockpitHomePage cockpithome;
    MainDashboardpage maindashboard;

    GlobalPage globalPage;
    WebDriverWait wait;
    Properties prop;
    private int numberofdate;

    @Before
    public void setUp() throws IOException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-fullscreen");
        //options.addArguments("--headless");
        driver = new ChromeDriver(options);
        //driver.manage().window().maximize();


        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

        flipkart = new FlipkartHomePage(driver);
        cockpithome = new CockpitHomePage(driver);
        maindashboard = new MainDashboardpage(driver);
        globalPage = new GlobalPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        prop = ConfigReader.initProperties();


    }

    @After
    public void TearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String destinationpath = "C:\\Users\\Hemanth\\Desktop\\screenshot" + timestamp + " " + scenario.getName() + ".png";
            FileHandler.copy(srcFile, new File(destinationpath));
        }
        driver.quit();
    }


    @Given("navigate to the cockpit page")
    public void navigateToTheCockpitPage() throws InterruptedException {
        driver.get(prop.getProperty("url"));
    }

    @When("enter the username and password")
    public void enterTheUsernameAndPassword() throws InterruptedException {
        cockpithome.loginToCockpit();
    }

    @Then("verify user is in main dashboard page")
    public void verifyUserIsInMainDashboardPage() throws InterruptedException {
        try {
            wait.until(ExpectedConditions.visibilityOf(cockpithome.getMinervaIotLogo()));
            assertTrue("User is not on dashboard", cockpithome.getMinervaIotLogo().isDisplayed());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(" the background class is executed");

    }

    @When("without entering username and password text fields")
    public void withoutEnteringUsernameAndPasswordTextFields() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(cockpithome.clickOnLogin()));
        cockpithome.clickOnLogin().click();
        Thread.sleep(2000);
        String emailError = cockpithome.getEmailErrorMessage().getText();
        assertEquals("Email error message mismatch", prop.getProperty("EmailIsRequiredError"), emailError);

        String passwordError = cockpithome.getPasswordErrorMessage().getText();
        assertEquals("Password error message mismatch", prop.getProperty("PasswordIsRequired"), passwordError);
    }

    @And("entering invalid email format in email text field")
    public void enteringInvalidEmailFormatInEmailTextField() throws InterruptedException {
        cockpithome.passEmailAndPassword(prop.getProperty("invalidusername"));
        cockpithome.clickOnLogin().click();
    }

    @Then("verify the error messages")
    public void verifyTheErrorMessages() {
        String invalidemailError = cockpithome.getInvalidEmail().getText();
        assertEquals("invalidemail error message mismatch", prop.getProperty("invalidemailformate"), invalidemailError);
    }

    @When("entering valid-username and invalid-password in text fields verify")
    public void enteringValidUsernameAndInvalidPasswordInTextFieldsVerify() throws InterruptedException {
        cockpithome.passEmailAndPassword(prop.getProperty("username"));
        cockpithome.clickOnLogin().click();
        wait.until(ExpectedConditions.visibilityOf(cockpithome.getuserNameorPasswordisIncorrect()));
        String actualmessage = cockpithome.getuserNameorPasswordisIncorrect().getText();
        Assert.assertEquals("the both message is correct", prop.getProperty("messageforincorrectusernameorpassword"), actualmessage);
    }

    @And("entering both invalid email and password in text field")
    public void enteringBothInvalidEmailAndPasswordInTextField() throws InterruptedException {
        Thread.sleep(2000);
        cockpithome.clearEmailfield();
        cockpithome.passEmailAndPassword(prop.getProperty("nonexistingemail"));
        cockpithome.clickOnLogin().click();
    }

    @Then("verify the error messages for fields")
    public void verifyTheErrorMessagesForFields() {
        wait.until(ExpectedConditions.visibilityOf(cockpithome.getUserDoesNotExist()));
        String errror = cockpithome.getUserDoesNotExist().getText();
        Assert.assertEquals("user does't exist message is not same", prop.getProperty("usernotavilable"), errror);
    }

    @Then("verify the application counts in the dashboard")
    public void verifyTheApplicationCountsInTheDashboard() throws InterruptedException {
        String count = cockpithome.getApplicationcountindashboard().getText();
        Assert.assertEquals("the count is not matching", prop.getProperty("ApplicationsCount"), count);
        System.out.println(count);
    }

    @Then("verify all the counts in the main dashboard")
    public void verifyAllTheCountsInTheMainDashboard() {

        System.out.println("pre-registered devices : " + maindashboard.getPreregistered());
        System.out.println("devices : " + maindashboard.getDevices());
        System.out.println("tenants : " + maindashboard.getTenants());
        System.out.println("paidTenants : " + maindashboard.getPaidTenants());
        System.out.println("Users : " + maindashboard.getUsersValue());
        System.out.println("ActiveUsers : " + maindashboard.getActiveUsers());

        List<WebElement> top5 = maindashboard.getTop5();
        List<WebElement> top5country = maindashboard.getTop5country();

        for (int i = 0; i < top5.size(); i++) {
            String value = top5.get(i).getText();
            String country = top5country.get(i).getText();
            System.out.println(country + "-" + value);
        }

    }

    @Then("get the data from the maindashboard and device dashboard")
    public void getTheDataFromTheMaindashboardAndDeviceDashboard() throws InterruptedException {

        String preregistreddatainMain = maindashboard.getPreregistered();
        System.out.println("pre-registered devices in main dashboard: " + preregistreddatainMain);

        maindashboard.clickOnDeviceDashboard();
        String preregistreddatainDevice = maindashboard.getDevicepreregistred();
        System.out.println("pre-registered devices in device dashboard: " + preregistreddatainDevice);
        maindashboard.clickOnGlobalpage();

        System.out.println("pre-registered devices in global dashboard: " + maindashboard.getGlobedevicedata());
        assertEquals(preregistreddatainMain, preregistreddatainDevice);
        assertEquals(preregistreddatainMain, maindashboard.getGlobedevicedata());
    }

    @Then("get the data from the maindashboard and device dashboard for normal devices")
    public void getTheDataFromTheMaindashboardAndDeviceDashboardForNormalDevices() {
        String preregistreddatainMain = maindashboard.getDevices();
        System.out.println("normal devices in main dashboard: " + preregistreddatainMain);

        maindashboard.clickOnDeviceDashboard();
        String preregistreddatainDevice = maindashboard.getNormalDevicedatainDeviceDashboard();


        System.out.println("normal devices in device dashboard: " + preregistreddatainDevice);
        maindashboard.clickOnGlobalpage();

        System.out.println("normal devices in global dashboard: " + maindashboard.getGlobeNormalDevicedata());
        assertEquals(preregistreddatainMain, preregistreddatainDevice);
        assertEquals(preregistreddatainMain, maindashboard.getGlobeNormalDevicedata());
    }

    @Then("get the data from the maindashboard and global dashboard and compare")
    public void getTheDataFromTheMaindashboardAndGlobalDashboardAndCompare() {
        String tenantsdataInMain = maindashboard.getTenants();
        System.out.println("tenant count in main dashboard: " + tenantsdataInMain);
        String usersdataInMain = maindashboard.getUsersValue();
        System.out.println("users count in main dashboard: " + usersdataInMain);
        maindashboard.clickOnGlobalpage();
        String tenantsingloble = globalPage.getTenantsInGlobalpage();
        System.out.println("users count in main dashboard: " + tenantsingloble);
        String usersingloble = globalPage.getUsersInGlobalpage();
        System.out.println("users count in main dashboard: " + usersingloble);
        assertEquals(tenantsdataInMain, tenantsingloble);
        assertEquals(usersdataInMain, usersingloble);

    }

    @Given("click on enlarge in device trends chart")
    public void clickOnEnlargeInDeviceTrendsChart() throws InterruptedException {
        this.numberofdate = maindashboard.clickOnThirtyDays(maindashboard.getDeviceTrendsChart());
    }

    @Then("verify the for {int} days data")
    public void verifyTheForDaysData(int date) {

        for (WebElement data : maindashboard.getDatesInDeviceTrends()) {
            String dateformate = data.getText();
            System.out.println(dateformate);
            boolean dat = dateformate.matches("^[A-Z][a-z]{2,9}-\\d{1,2}$");
            Assert.assertTrue("the matchers is not matched", dat);
        }

        Assert.assertEquals("the data which are present is not equal to 30", numberofdate, date);
    }

    @Given("click on enlarge in tenant trends chart")
    public void clickOnEnlargeInTenantTrendsChart() throws InterruptedException {
        this.numberofdate = maindashboard.clickOnThreeMonths(maindashboard.getTenanttrendschart());
    }


    @Then("verify the for {int} months and {int} months latest data")
    public void verifyTheForMonthsAndMonthsLatestData(int month, int months) {

        for (WebElement data : maindashboard.getMonthsInAllTrends()) {
            String dateformate = data.getText();
            System.out.println(dateformate);
            boolean dat = dateformate.matches("^[A-Z][a-z]{2,5}");
            Assert.assertTrue("the matchers is not matched", dat);
        }

        if (numberofdate == month || numberofdate == months) {
            System.out.println("the data which are present is equal to latest 90 days data");
        }
    }


    @Given("click on enlarge in tenant trends charts")
    public void clickOnEnlargeInTenantTrendsCharts() {
        this.numberofdate = maindashboard.clickOnThirtyDays(maindashboard.getTenanttrendschart());
    }

    @Given("click on enlarge in user trends charts")
    public void clickOnEnlargeInUserTrendsCharts() {
        this.numberofdate = maindashboard.clickOnThirtyDays(maindashboard.getUsertrendschart());
    }

    @Given("click on enlarge in cumulative devices trends charts")
    public void clickOnEnlargeInCumulativeDevicesTrendsCharts() throws InterruptedException {
        this.numberofdate = maindashboard.clickOnThirtyDays(maindashboard.getcumulativedeviceschart());
    }

    @Given("click on enlarge in cumulative tenants trends charts")
    public void clickOnEnlargeInCumulativeTenantsTrendsCharts() {
        this.numberofdate = maindashboard.clickOnThirtyDays(maindashboard.getCumulativetenantschart());
    }

    @Given("click on enlarge in cumulative users trends charts")
    public void clickOnEnlargeInCumulativeUsersTrendsCharts() {
        this.numberofdate = maindashboard.clickOnThirtyDays(maindashboard.getCumulativeuserschart());
    }

    @Given("click on enlarge in device trends chart for three months")
    public void clickOnEnlargeInDeviceTrendsChartForThreeMonths() {
        this.numberofdate = maindashboard.clickOnThreeMonths(maindashboard.getDeviceTrendsChart());
    }

    @Given("click on enlarge in user trends chart for three months")
    public void clickOnEnlargeInUserTrendsChartForThreeMonths() {
        this.numberofdate = maindashboard.clickOnThreeMonths(maindashboard.getUsertrendschart());
    }

    @Given("click on enlarge in user cumulative devices chart for three months")
    public void clickOnEnlargeInUserCumulativeDevicesChartForThreeMonths() {
        this.numberofdate = maindashboard.clickOnThreeMonths(maindashboard.getcumulativedeviceschart());
    }

    @Given("click on enlarge in user cumulative tenants chart for three months")
    public void clickOnEnlargeInUserCumulativeTenantsChartForThreeMonths() {
        this.numberofdate = maindashboard.clickOnThreeMonths(maindashboard.getCumulativetenantschart());
    }

    @Given("click on enlarge in user cumulative users chart for three months")
    public void clickOnEnlargeInUserCumulativeUsersChartForThreeMonths() {
        this.numberofdate = maindashboard.clickOnThreeMonths(maindashboard.getCumulativeuserschart());
    }

    @Given("click on enlarge in device trends chart for six months")
    public void clickOnEnlargeInDeviceTrendsChartForSixMonths() {
        this.numberofdate = maindashboard.clickOnSixMonths(maindashboard.getDeviceTrendsChart());
    }

    @Given("click on enlarge in tenant trends chart for six months")
    public void clickOnEnlargeInTenantTrendsChartForSixMonths() {
        this.numberofdate = maindashboard.clickOnSixMonths(maindashboard.getTenanttrendschart());
    }

    @Given("click on enlarge in user trends chart for six months")
    public void clickOnEnlargeInUserTrendsChartForSixMonths() {
        this.numberofdate = maindashboard.clickOnSixMonths(maindashboard.getUsertrendschart());
    }

    @Given("click on enlarge in cumulative devices main chart for six months")
    public void clickOnEnlargeInCumulativeDevicesMainChartForSixMonths() {
        this.numberofdate = maindashboard.clickOnSixMonths(maindashboard.getcumulativedeviceschart());
    }

    @Given("click on enlarge in cumulative tenants main chart for six months")
    public void clickOnEnlargeInCumulativeTenantsMainChartForSixMonths() {
        this.numberofdate = maindashboard.clickOnSixMonths(maindashboard.getCumulativetenantschart());
    }

    @Given("click on enlarge in cumulative users main chart for six months")
    public void clickOnEnlargeInCumulativeUsersMainChartForSixMonths() {
        this.numberofdate = maindashboard.clickOnSixMonths(maindashboard.getCumulativeuserschart());
    }

    @Given("click on enlarge in device trends chart for one year")
    public void clickOnEnlargeInDeviceTrendsChartForOneYear() {
        this.numberofdate = maindashboard.clickOnOneYear(maindashboard.getDeviceTrendsChart());

    }


    @Then("verify the for {int} or {int} months latest data means one year")
    public void verifyTheForOrMonthsLatestDataMeansoneyear(int year, int years) {
        for (WebElement data : maindashboard.getMonthsInAllTrends()) {
            String dateformate = data.getText();
            System.out.println(dateformate);
            boolean dat = dateformate.matches("^\\d{4}-(?:0[1-9]|1[0-2])|[A-Z][a-z]{2,9}");
            Assert.assertTrue("the matchers is not matched", dat);
        }
        if (numberofdate == year || numberofdate == years) {
            System.out.println("the data which are present is equal to latest 1 year data");
        }
    }

    @Given("click on enlarge in tenant trends chart for one year")
    public void clickOnEnlargeInTenantTrendsChartForOneYear() {
        this.numberofdate = maindashboard.clickOnOneYear(maindashboard.getTenanttrendschart());
    }

    @Given("click on enlarge in user trends chart for one year")
    public void clickOnEnlargeInUserTrendsChartForOneYear() {
        this.numberofdate = maindashboard.clickOnOneYear(maindashboard.getUsertrendschart());
    }

    @Given("click on enlarge in cumulative devices chart for one year")
    public void clickOnEnlargeInCumulativeDevicesChartForOneYear() {
        this.numberofdate = maindashboard.clickOnOneYear(maindashboard.getcumulativedeviceschart());
    }

    @Given("click on enlarge in cumulative tenants chart for one year")
    public void clickOnEnlargeInCumulativeTenantsChartForOneYear() {
        this.numberofdate = maindashboard.clickOnOneYear(maindashboard.getCumulativetenantschart());
    }

    @Given("click on enlarge in cumulative users chart for one year")
    public void clickOnEnlargeInCumulativeUsersChartForOneYear() {
        this.numberofdate = maindashboard.clickOnOneYear(maindashboard.getCumulativeuserschart());
    }


    @Given("click on enlarge in device trends chart for current month")
    public void clickOnEnlargeInDeviceTrendsChartForCurrentMonth() {
        this.numberofdate = maindashboard.clickOnCurrentMonth(maindashboard.getDeviceTrendsChart());
    }

    @When("get the today date")
    public void getTheTodayDate() {
        System.out.println(getCurrentDate());
    }

    @Then("verify for all the back dates from current date for a month")
    public void verifyForAllTheBackDatesFromCurrentDateForAMonth() {

        List<WebElement> elements = maindashboard.getMonthsInAllTrends();
        String today = getCurrentDate(); // e.g., "Aug-4"
        System.out.println(today);

        for (WebElement element : elements) {
            String dateText = element.getText();
            if (dateText.contains(today)) {
                System.out.println("The today's data is matched");
                System.out.println("The current date: " + today);
                break;
            } else {
                System.out.println(dateText);
                boolean matchesPattern = dateText.matches("^[A-Z][a-z]{2,9}-\\d{1,2}$");
                Assert.assertTrue("The matcher is not matched for: " + dateText, matchesPattern);
            }
        }


    }

    @Given("click on enlarge in tenant trends chart for current month")
    public void clickOnEnlargeInTenantTrendsChartForCurrentMonth() {
        this.numberofdate = maindashboard.clickOnCurrentMonth(maindashboard.getTenanttrendschart());
    }

    @Given("click on enlarge in user trends chart for current month")
    public void clickOnEnlargeInUserTrendsChartForCurrentMonth() {
        this.numberofdate = maindashboard.clickOnCurrentMonth(maindashboard.getUsertrendschart());
    }

    @Given("click on enlarge in user cumulative devices for current month")
    public void clickOnEnlargeInUserCumulativeDevicesForCurrentMonth() {
        this.numberofdate = maindashboard.clickOnCurrentMonth(maindashboard.getcumulativedeviceschart());
    }

    @Given("click on enlarge in user cumulative tenants for current month")
    public void clickOnEnlargeInUserCumulativeTenantsForCurrentMonth() {
        this.numberofdate = maindashboard.clickOnCurrentMonth(maindashboard.getCumulativetenantschart());
    }

    @Given("click on enlarge in user cumulative users for current month")
    public void clickOnEnlargeInUserCumulativeUsersForCurrentMonth() {
        this.numberofdate = maindashboard.clickOnCurrentMonth(maindashboard.getCumulativeuserschart());
    }

    @When("get the today month")
    public void getTheTodayMonth() {
        System.out.println(getCurrentMonth());
    }

    @Given("click on enlarge in device trends chart for current year")
    public void clickOnEnlargeInDeviceTrendsChartForCurrentYear() {
        this.numberofdate = maindashboard.clickOnCurrentYear(maindashboard.getDeviceTrendsChart());
    }

    @Then("verify for all the back dates from current month for a year")
    public void verifyForAllTheBackDatesFromCurrentMonthForAYear() {
        List<WebElement> elements = maindashboard.getMonthsInAllTrends();
        String todaymonth = getCurrentMonth(); // e.g., "Aug-4"
        System.out.println(todaymonth);

        for (WebElement element : elements) {
            String dateText = element.getText();
            if (dateText.contains(todaymonth)) {
                System.out.println("The today's data is matched");
                System.out.println("The current date: " + todaymonth);
                break;
            } else {
                System.out.println(dateText);
                boolean matchesPattern = dateText.matches("^[A-Z][a-z]{2,9}$");
                Assert.assertTrue("The matcher is not matched for: " + dateText, matchesPattern);
            }
        }
    }

    @Given("click on enlarge in tenant trends chart for current year")
    public void clickOnEnlargeInTenantTrendsChartForCurrentYear() {
        this.numberofdate = maindashboard.clickOnCurrentYear(maindashboard.getTenanttrendschart());
    }

    @Given("click on enlarge in user trends chart for current year")
    public void clickOnEnlargeInUserTrendsChartForCurrentYear() {
        this.numberofdate = maindashboard.clickOnCurrentYear(maindashboard.getUsertrendschart());

    }

    @Given("click on enlarge in cumulative devices chart for current year")
    public void clickOnEnlargeInCumulativeDevicesChartForCurrentYear() {
        this.numberofdate = maindashboard.clickOnCurrentYear(maindashboard.getcumulativedeviceschart());
    }

    @Given("click on enlarge in cumulative tenants chart for current year")
    public void clickOnEnlargeInCumulativeTenantsChartForCurrentYear() {
        this.numberofdate = maindashboard.clickOnCurrentYear(maindashboard.getCumulativetenantschart());
    }

    @Given("click on enlarge in cumulative users chart for current year")
    public void clickOnEnlargeInCumulativeUsersChartForCurrentYear() {
        this.numberofdate = maindashboard.clickOnCurrentYear(maindashboard.getCumulativeuserschart());
    }

    @Given("click on enlarge in device trends chart for First Quarter")
    public void clickOnEnlargeInDeviceTrendsChartForFirstQuarter() {
        this.numberofdate = maindashboard.clickOnFirstQuarter(maindashboard.getDeviceTrendsChart());
    }
    @Then("verify for all the back dates from first Quarter for a current month")
    public void verifyForAllTheBackDatesFromFirstQuarterForACurrentMonth() {
//        List<WebElement> elements = maindashboard.getMonthsInAllTrends();
//        String todaymonth = getCurrentMonth();
//        System.out.println(todaymonth);
//
//        for (WebElement element : elements) {
//            String dateText = element.getText();
//            if (dateText.contains(todaymonth)) {
//                System.out.println("The today's data is matched");
//                System.out.println("The current date: " + todaymonth);
//                break;
//            } else {
//                System.out.println(dateText);
//                boolean matchesPattern = dateText.matches("^[A-Z][a-z]{2,9}$");
//                Assert.assertTrue("The matcher is not matched for: " + dateText, matchesPattern);
            }
        }
    }
}


