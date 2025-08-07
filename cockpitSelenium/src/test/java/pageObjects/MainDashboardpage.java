package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;


import javax.xml.xpath.XPath;
import java.io.IOException;
import java.io.WriteAbortedException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

public class MainDashboardpage extends Basepage {

    public MainDashboardpage(WebDriver driver) throws IOException {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Properties prop = ConfigReader.initProperties();
    private int numberofdate;
    @FindBy(xpath = "//*[@id=\"Pre-registered value\"]")
    WebElement preregistered;
    @FindBy(xpath = "//*[@id=\"Devices value\"]")
    WebElement devices;
    @FindBy(xpath = "//*[@id=\"Tenants value\"]")
    WebElement tenants;
    @FindBy(xpath = "//*[@id=\"Paid-Tenants value\"]")
    WebElement paidtenants;
    @FindBy(xpath = "//*[@id=\"Users value\"]")
    WebElement usersvalue;
    @FindBy(xpath = "//*[@id=\"Active-Users value\"]")
    WebElement activeusers;
    @FindBy(xpath = "//*[@data-z-index=\"1\" and @x=\"5\" and @y=\"16\"]")
    List<WebElement> top5;

    @FindBy(xpath = "//*[@text-anchor=\"end\"  and @x=\"61\" ]")
    List<WebElement> top5country;
    @FindBy(xpath = "//*[@class=\"highcharts-a11y-proxy-button highcharts-no-tooltip\"]")
    WebElement appsbydevicecount;
    @FindBy(xpath = "//*[@y=\"179\"]")
    WebElement dataformate;

    @FindBy(xpath = "//*[@data-testid=\"CloseIcon\"]")
    WebElement closeicon;

    @FindBy(xpath = "//*[@aria-label=\"Device\"]")
    WebElement devicedashboard;

    @FindBy(xpath = "(//span[contains(text(),\"Pre-Registered\")]/following-sibling::span)[1]")
    WebElement devicepreregistred;

    @FindBy(xpath = "//*[@aria-label=\"Global\"]")
    WebElement globalpage;

    @FindBy(xpath = "//p[contains(text(), \"Pre-Registered\")]/preceding-sibling::p[1]")
    WebElement globedevicedata;

    @FindBy(xpath = "//p[contains(text(), \"Devices\")]/preceding-sibling::p[1]")
    WebElement globenormaldevicedata;
    @FindBy(xpath = "//span[contains(text(), \"Total Devices\")]/following-sibling::span[1]")
    WebElement normaldevicedatainDeviceDashboard;
    @FindBy(xpath = "//*[@transform=\"translate(0,0) rotate(-45 63.10939153101767 179)\"]")
    WebElement firstdateindeviceTreands;

    @FindBy(xpath = "//*[@y=\"357\"]")
    List<WebElement> datesindevicetrends;

    @FindBy(xpath = "//*[@y=\"381\"]")
    List<WebElement> monthsinalltrends;

    @FindBy(xpath="(//*[@class=\"highcharts-background\"])[7]")
    WebElement devicetrendschart;
    @FindBy(xpath = "//*[@data-testid=\"ZoomOutMapIcon\"]")
    WebElement enlargeicon;
    @FindBy(xpath="(//*[@class=\"highcharts-background\"])[8]")
    WebElement tenanttrendschart;

    @FindBy(xpath="(//*[@class=\"highcharts-background\"])[9]")
    WebElement usertrendschart;

    @FindBy(xpath="(//*[@class=\"highcharts-background\"])[10]")
    WebElement cumulativedeviceschart;

    @FindBy(xpath="(//*[@class=\"highcharts-background\"])[11]")
    WebElement cumulativetenantschart;

    @FindBy(xpath="(//*[@class=\"highcharts-background\"])[12]")
    WebElement cumulativeuserschart;



    @FindBy(xpath = "//*[@aria-label=\"Settings\"]")
    WebElement settings;

    @FindBy(xpath = "//*[contains(text(),\"Date Range\")]")
    WebElement daterange;

    @FindBy(xpath = "//*[@placeholder=\"Start date\"]")
    WebElement startdate;

    @FindBy(xpath = "//*[contains(text(),\"Latest 90 Days\")]")
     WebElement latest90days;
    @FindBy(xpath = "//*[contains(text(),\"Latest 180 Days\")]")
    WebElement latest180days;
    @FindBy(xpath = "//*[contains(text(),\"Latest 1 Year\")]")
    WebElement latest1year;
    @FindBy(xpath = "//*[contains(text(),\"Current Month\")]")
    WebElement latestcurrentmonth;
    @FindBy(xpath = "//*[contains(text(),\"Current Year\")]")
    WebElement latestcurrentyear;

    @FindBy(xpath = "//*[contains(text(),\"1st Quarter\")]")
    WebElement firstquarter;




    @FindBy(xpath = "//*[contains(text(),\"OK\")]")
    WebElement  okbutton;

    public String getPreregistered() {
        return preregistered.getText();
    }

    public String getDevices() {
        return devices.getText();
    }

    public String getTenants() {
        wait.until(ExpectedConditions.visibilityOf(tenants));
        return tenants.getText();
    }

    public String getPaidTenants() {
        return paidtenants.getText();
    }

    public String getUsersValue() {
        return usersvalue.getText();
    }

    public String getActiveUsers() {
        return activeusers.getText();
    }

    public List<WebElement> getTop5() {
        return top5;
    }

    public List<WebElement> getTop5country() {
        return top5country;
    }

    public List<WebElement> getDatesInDeviceTrends(){
        return datesindevicetrends;
    }


    public String getAppsByDeviceCount() {
        return appsbydevicecount.getText();
    }

    public String getDataFormate() {
        return dataformate.getText();
    }

    public WebElement GetEnlargeIcon(){
        wait.until(ExpectedConditions.visibilityOf(enlargeicon));
        return enlargeicon;
    }

    public void clickOnDeviceDashboard() {
        wait.until(ExpectedConditions.visibilityOf(devicedashboard));
        devicedashboard.click();
    }

    public String getDevicepreregistred() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(devicepreregistred));
        return devicepreregistred.getText();
    }

    public void clickOnGlobalpage(){
        wait.until(ExpectedConditions.visibilityOf(globalpage));
        globalpage.click();
    }

    public String getGlobedevicedata(){
        wait.until(ExpectedConditions.visibilityOf(globedevicedata));
      return globedevicedata.getText();
    }

    public String getNormalDevicedatainDeviceDashboard(){
        wait.until(ExpectedConditions.visibilityOf(normaldevicedatainDeviceDashboard));
        return normaldevicedatainDeviceDashboard.getText();
    }
    public String getGlobeNormalDevicedata(){
        wait.until(ExpectedConditions.visibilityOf(globenormaldevicedata));
        return globenormaldevicedata.getText();
    }
    public String getFirstDateInDeviceTreands(){
        wait.until(ExpectedConditions.visibilityOf(firstdateindeviceTreands));
        return firstdateindeviceTreands.getText();
    }


    public void clickSettings(){
        wait.until(ExpectedConditions.visibilityOf(settings));
         settings.click();
    }

    public void clickDateRange(){
        wait.until(ExpectedConditions.visibilityOf(daterange));
        daterange.click();
    }

    public void clickStartDate(){
        wait.until(ExpectedConditions.visibilityOf(startdate));
        startdate.click();
    }

    public void clickOnLatest90days(){
        wait.until(ExpectedConditions.visibilityOf(latest90days));
        latest90days.click();
    }
    public void clickOnlatest180days(){
        wait.until(ExpectedConditions.visibilityOf(latest180days));
        latest180days.click();
    }
    public void clickOnlatest1year(){
        wait.until(ExpectedConditions.visibilityOf(latest1year));
        latest1year.click();
    }
    public void clickOnLatestCurrentMonth(){
        wait.until(ExpectedConditions.visibilityOf(latestcurrentmonth));
        latestcurrentmonth.click();
    }
    public void clickOnLatestCurrentYear(){
        wait.until(ExpectedConditions.visibilityOf(latestcurrentyear));
        latestcurrentyear.click();
    }
    public void clickOnFirstQuarter(){
        wait.until(ExpectedConditions.visibilityOf(firstquarter));
        firstquarter.click();
    }


    public void clickOnOkButton(){
        wait.until(ExpectedConditions.visibilityOf(okbutton));
        okbutton.click();
    }

    public List<WebElement> getMonthsInAllTrends(){
        return monthsinalltrends;
    }
    public  WebElement getUsertrendschart(){
        wait.until(ExpectedConditions.visibilityOf(usertrendschart));
        return usertrendschart;
    }
    public  WebElement getcumulativedeviceschart(){
        wait.until(ExpectedConditions.visibilityOf(cumulativedeviceschart));
        return cumulativedeviceschart;
    }
    public  WebElement getCumulativetenantschart(){
        wait.until(ExpectedConditions.visibilityOf(cumulativetenantschart));
        return cumulativetenantschart;
    }
    public  WebElement getCumulativeuserschart(){
        wait.until(ExpectedConditions.visibilityOf(cumulativeuserschart));
        return cumulativeuserschart;
    }
    public  WebElement getDeviceTrendsChart(){
        wait.until(ExpectedConditions.visibilityOf(devicetrendschart));
        return devicetrendschart;
    }
    public  WebElement getTenanttrendschart(){
        wait.until(ExpectedConditions.visibilityOf(tenanttrendschart));
        return tenanttrendschart;
    }




    public int clickOnThirtyDays(WebElement pathofchart) {
        Actions actions = new Actions(driver);
        actions.moveToElement(pathofchart).perform();
        actions.moveToElement(GetEnlargeIcon()).click().perform();
        numberofdate = getDatesInDeviceTrends().size();
        System.out.println("the total number of dates : " + getDatesInDeviceTrends().size());
        return numberofdate;
    }
    public int clickOnThreeMonths(WebElement pathofchart) {
        clickSettings();
         clickDateRange();
        clickStartDate();
        clickOnLatest90days();
        clickOnOkButton();
        Actions actions = new Actions(driver);
        actions.moveToElement(pathofchart).perform();
        actions.moveToElement(GetEnlargeIcon()).click().perform();
        numberofdate = getMonthsInAllTrends().size();
        System.out.println("the number of devices" + numberofdate);
        System.out.println("the total number of dates : " + getMonthsInAllTrends().size());
        return numberofdate;
    }

    public int clickOnSixMonths(WebElement pathofchart){
        clickSettings();
        clickDateRange();
        clickStartDate();
       clickOnlatest180days();
        clickOnOkButton();
        Actions actions = new Actions(driver);
        actions.moveToElement(pathofchart).perform();
        actions.moveToElement(GetEnlargeIcon()).click().perform();
        numberofdate = getMonthsInAllTrends().size();
        System.out.println("the number of devices"+numberofdate);
        System.out.println("the total number of dates : "+getMonthsInAllTrends().size());
        return numberofdate;
    }
    public int clickOnOneYear(WebElement pathofchart){
        clickSettings();
        clickDateRange();
        clickStartDate();
        clickOnlatest1year();
        clickOnOkButton();
        Actions actions = new Actions(driver);
        actions.moveToElement(pathofchart).perform();
        actions.moveToElement(GetEnlargeIcon()).click().perform();
        numberofdate = getMonthsInAllTrends().size();
        System.out.println("the number of devices"+numberofdate);
        System.out.println("the total number of dates : "+getMonthsInAllTrends().size());
        return numberofdate;
    }



    public int clickOnCurrentMonth(WebElement pathofchart){
        clickSettings();
        clickDateRange();
        clickStartDate();
        clickOnLatestCurrentMonth();
        clickOnOkButton();
        Actions actions = new Actions(driver);
        actions.moveToElement(pathofchart).perform();
        actions.moveToElement(GetEnlargeIcon()).click().perform();
        numberofdate = getMonthsInAllTrends().size();
        System.out.println("the number of devices"+numberofdate);
        System.out.println("the total number of dates : "+getMonthsInAllTrends().size());
        return numberofdate;
    }
    public int clickOnCurrentYear(WebElement pathofchart){
        clickSettings();
        clickDateRange();
        clickStartDate();
        clickOnLatestCurrentYear();
        clickOnOkButton();
        Actions actions = new Actions(driver);
        actions.moveToElement(pathofchart).perform();
        actions.moveToElement(GetEnlargeIcon()).click().perform();
        numberofdate = getMonthsInAllTrends().size();
        System.out.println("the total number of dates : "+getMonthsInAllTrends().size());
        return numberofdate;
    }
    public int clickOnFirstQuarter(WebElement pathofchart){
        clickSettings();
        clickDateRange();
        clickStartDate();
        clickOnFirstQuarter();
        clickOnOkButton();
        Actions actions = new Actions(driver);
        actions.moveToElement(pathofchart).perform();
        actions.moveToElement(GetEnlargeIcon()).click().perform();
        numberofdate = getMonthsInAllTrends().size();
        System.out.println("the total number of dates : "+getMonthsInAllTrends().size());
        return numberofdate;
    }

}



