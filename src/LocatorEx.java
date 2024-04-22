package src;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LocatorEx extends Base {


    public void switchFrame() {
       //obj.switchTo().frame(2);
        //obj.switchTo().frame("second-img");
        obj.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
        System.out.println(123);
        obj.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
    }



    public void locateElements() {

        //obj.findElement(By.name("email")).sendKeys("mad@gmail.com");
        //obj.findElement(By.cssSelector("#email.inputtext")).sendKeys("mad@gmail.com");
        //obj.findElement(By.name("email")).sendKeys("mad@gmail.com");
        //obj.findElement(By.className("inputtext")).sendKeys("mad@gmail.com");
        //obj.findElement(By.tagName("input")).sendKeys("mad@gmail.com");
        //obj.findElement(By.tagName("button")).click();
        //obj.findElement(By.linkText("Forgotten password?")).click();
        //obj.findElement(By.xpath("//button[starts-with(text(),'Sign Up')]")).click();
        // obj.findElement(By.xpath("//select[@id='day']//ancestor::div[@class='fb_content clearfix _9bq7']//img[@class='fb_logo _agiv img']")).getText();
        //obj.findElement(By.xpath("//div[@id='nav-belt']//div[@class='nav-right']//a[@id='nav-orders']/span[@class='nav-line-1']")).click();
        // obj.close();
        switchFrame();
        System.out.println("***********");
        //obj.findElement(By.xpath("//a[@class='close']")).click();
        //obj.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#webklipper-publisher-widget-container-notification-close-div.close"))).click();
        //obj.findElement(By.cssSelector("div.flt_fsw_inputBox.dates.inactiveWidget.activeWidget > label > span ")).click();

        //obj.findElement(By.xpath("//li[@class='menu_Hotels']//span[@class='headerIconTextAlignment chNavText darkGreyText']")).click();
    }


    public static void main(String[] args) throws InterruptedException {

        LocatorEx e1 = new LocatorEx();
        e1.setUpBrowser("chrome", "https://www.makemytrip.com/");
        obj.manage().window().maximize();
        //WebDriver driver = e1.getDriver();
        //e1.obj.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(20));
        e1.switchFrame();



    }


}