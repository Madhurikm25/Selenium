package src;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;
public class FrameEx extends Base{
    public static void main(String[] args) throws InterruptedException {
        FrameEx fram = new FrameEx();
        fram.setUpBrowser("chrome", "https://www.w3schools.com/html/html_iframe.asp");
        obj.manage().window().maximize();
        //implicit wait
        obj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        obj.switchTo().frame(1);
        obj.findElement(By.xpath("//a[@class='w3-left w3-btn'][contains(text(),'❮ Home')][1]")).click();
        Thread.sleep(5000);
       // obj.switchTo().defaultContent();
        obj.switchTo().parentFrame();
        obj.findElement(By.xpath("//input[@id='tnb-google-search-input']")).sendKeys("abc");
        System.out.println("1213");
    }
}